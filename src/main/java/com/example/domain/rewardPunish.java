package com.example.domain;

public class rewardPunish {
    private Integer id;
    private String name;
    private Integer category;
    private String content;

    @Override
    public String toString() {
        return "rewardPunish{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category=" + category +
                ", content='" + content + '\'' +
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

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
