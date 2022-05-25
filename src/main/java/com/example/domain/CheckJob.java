package com.example.domain;

public class CheckJob {
    private Integer id;
    private String name;
    private Integer day;

    @Override
    public String toString() {
        return "CheckJob{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", day=" + day +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }
}
