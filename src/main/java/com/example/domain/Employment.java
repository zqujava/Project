package com.example.domain;

public class Employment {
    private Integer id;
    private String position;
    private String salary;
    private Integer num;
    private String content;
    private String phone;

    @Override
    public String toString() {
        return "employment{" +
                "id=" + id +
                ", position='" + position + '\'' +
                ", salary='" + salary + '\'' +
                ", num=" + num +
                ", content='" + content + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
