package com.example.firstproject.dto;

import com.example.firstproject.entity.Article;

public class ArticleForm {

    private String email;
    private String password;

    public ArticleForm(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return "ArticleForm{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Article toEntity() {
        return new Article(null, email, password);
    }
}
