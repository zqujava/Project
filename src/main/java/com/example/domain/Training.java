package com.example.domain;

import lombok.Data;

import java.sql.Date;

@Data
public class Training {
    private Integer id;
    private Date time;
    private String site;
    private String content;
    private Integer amount;
}
