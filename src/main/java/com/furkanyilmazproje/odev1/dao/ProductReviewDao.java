package com.furkanyilmazproje.odev1.dao;

import com.furkanyilmazproje.odev1.entity.Product;
import com.furkanyilmazproje.odev1.entity.ProductReview;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductReviewDao extends JpaRepository<ProductReviewDao,Long> {

    List<ProductReview> findAllBy(Product product);
}
