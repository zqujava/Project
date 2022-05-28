package com.example.domain;

import lombok.Data;

/**
 * @author luo
 */
@Data
public class Candidate {
    private Integer id;
    private String name;
    private String sex;
    private Integer age;
    private String phone;
    private String degree;
    private String experience;
    private String site;
}
