package com.mustache.springbootmustache.domain.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity // JPA에서 객체로 다루겠다는 선언
@NoArgsConstructor
@Getter
public class Article {
    @Id // Entity와 꼭 같이 선언해야한다. Primary key를 의미한다.
    @GeneratedValue // 생성의 위임을 맡긴다는 의미
    private Long id;
    private String title;
    private String content;

    public Article(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
