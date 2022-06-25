package com.furkanyilmazproje.odev1.dao;

import com.furkanyilmazproje.odev1.entity.Product;
import com.furkanyilmazproje.odev1.entity.ProductReview;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductDao extends JpaRepository<Product,Long> {
    List<Product> findAllBy(Product product);
}
