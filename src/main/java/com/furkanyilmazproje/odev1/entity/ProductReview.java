package com.furkanyilmazproje.odev1.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.Date;

@Entity
@Table(name = "PRODUCT_REVİEW")
@Getter
@Setter
public class ProductReview {

    @Id
    @GeneratedValue(generator = "ProductReview")
    @SequenceGenerator(name = "ProductReview", sequenceName = "PRODUCT-REVIEW_ID_SEQ")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PRODUCT",nullable = false,foreignKey = @ForeignKey)
    private Product product;

    @Column(name = "COMMENT", length = 500, nullable = false)
    private char comment;

    @Column(name = "COMMENT_DATE")
    @Temporal(TemporalType.DATE)
    private Date expirationDate;


    @Column(name = "PRODUCT_ID", length = 15)
    private String phoneNumber;

    @Column(name = "CUSTOMER_ID", length = 50)
    private String customerId;
}
