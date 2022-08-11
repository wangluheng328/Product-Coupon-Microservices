package com.wes.springcloud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wes.springcloud.model.Coupon;
import com.wes.springcloud.repos.CouponRepo;

@RestController
@RequestMapping(value = "/couponapi")
public class CouponRestController {
	
	@Autowired
	CouponRepo repo;
	
	@PostMapping(value = "/coupons")
	public Coupon create(@RequestBody Coupon coupon) {
		return repo.save(coupon);
	}
	
	@GetMapping(value = "/coupons/{code}")
	public Coupon getCoupon(@PathVariable("code") String code) {
		System.out.println("Server 2");
		return repo.findByCode(code);
	}

}
