package com.wes.springcloud.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wes.springcloud.model.Product;

public interface ProductRepo extends JpaRepository<Product, Long>{

}
