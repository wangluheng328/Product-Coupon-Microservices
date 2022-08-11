package com.wes.springcloud.controllers;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wes.springcloud.model.Coupon;
import com.wes.springcloud.model.Product;
import com.wes.springcloud.repos.ProductRepo;
import com.wes.springcloud.restclients.CouponClient;

import io.github.resilience4j.retry.annotation.Retry;

@RestController
@RequestMapping(value = "/productapi")
@RefreshScope
public class ProductRestController {


	@Autowired
	CouponClient couponClient;
	
	@Autowired
	ProductRepo repo;
	
	@Value("${com.wes.spingcloud.prop}")
	private String prop;
	
	@PostMapping(value = "/products")
	@Retry(name="product-api", fallbackMethod = "handleError") //for fault tolerence, by default retry 3 times, can be configured in .properties file
	public Product create(@RequestBody Product product) {
		Coupon coupon = couponClient.getCoupon(product.getCouponCode());
		product.setPrice(product.getPrice().subtract(coupon.getDiscount()));
		return repo.save(product);
	}
	
	
	@GetMapping(value = "/prop")
	public String getProp() {
		return this.prop;
	}
	
	public Product handleError(Product product, Exception exception) {
		System.out.println("Inside Handle Error");
		return product;
	}
	

}
