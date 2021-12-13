package com.example.firstproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity //DB가 해당 객체를 인식 가능
public class Article {

    @Id //대표값을 지정!
    @GeneratedValue //자동 생성 어노테이션;
    private Long id;

    @Column
    private String email;
    @Column
    private String password;

    public Article(Long id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
