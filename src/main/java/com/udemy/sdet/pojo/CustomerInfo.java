package com.udemy.sdet.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class CustomerInfo {
    private String courserName;
    private Date purchaseDate;
    private Integer amount;
    private String location;
}
