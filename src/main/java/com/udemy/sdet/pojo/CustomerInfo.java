package com.udemy.sdet.pojo;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "student")
public class CustomerInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", length = 12, nullable = false, unique = true)
    private Integer id;

    @Column(name = "courseName", length = 50)
    private String courseName;

    @Column(name = "purchasedDate")
    private Date purchasedDate;

    @Column(name = "amount", length = 50)
    private Integer amount;

    @Column(name = "location", length = 50)
    private String location;
}
