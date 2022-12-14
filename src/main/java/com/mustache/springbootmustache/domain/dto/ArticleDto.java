package com.mustache.springbootmustache.domain.dto;

import com.mustache.springbootmustache.domain.entity.Article;
import lombok.Getter;
import lombok.ToString;

import javax.swing.text.html.parser.Entity;

@Getter
@ToString
public class ArticleDto {
    private Long id;
    private String title;
    private String content;

    public ArticleDto(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }
    public Article toEntity() {
        return new Article(title, content);
    }
}
