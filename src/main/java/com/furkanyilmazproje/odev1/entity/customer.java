package com.furkanyilmazproje.odev1.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.Date;

@Entity
@Table(name = "CUSTOMER")
@Getter
@Setter
public class customer {

    @Id
    @GeneratedValue(generator = "Customer")
    @SequenceGenerator(name = "Customer", sequenceName = "CUSTOMER_ID_SEQ")
    private Long id;

    @Column(name = "NAME", length = 50, nullable = false)
    private String name;

    @Column(name = "SURNAME", length = 50, nullable = false)
    private String surname;


    @Column(name = "PHONE_NUMBER", length = 15)
    private String phoneNumber;

    @Email
    @Column(name = "EMAIL", length = 50)
    private Date email;


}
