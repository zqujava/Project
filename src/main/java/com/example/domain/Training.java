package com.example.domain;

public class Training {
    private Integer id;
    private String time;
    private String site;
    private String content;
    private Integer amount;

    @Override
    public String toString() {
        return "Training{" +
                "id=" + id +
                ", time='" + time + '\'' +
                ", site='" + site + '\'' +
                ", content='" + content + '\'' +
                ", amount=" + amount +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
