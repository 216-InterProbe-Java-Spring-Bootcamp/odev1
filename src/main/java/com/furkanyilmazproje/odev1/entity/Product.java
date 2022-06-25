package com.furkanyilmazproje.odev1.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "PRODUCT")
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue(generator = "Product")
    @SequenceGenerator(name = "Product", sequenceName = "PRODUCT_ID_SEQ")
    private Long id;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PRODUCT-REVIEW",nullable = false,foreignKey = @ForeignKey)
    private ProductReview productReview;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "Price", length = 50, nullable = false)
    private int price;

    @Column(name = "EXPİRATİON_DATE")
    @Temporal(TemporalType.DATE)
    private Date expirationDate;

}
