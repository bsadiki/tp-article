package com.sadiki.tparticle.service;

import com.sadiki.tparticle.domain.Article;
import org.springframework.data.domain.Page;

public interface ArticleService {
    Article addArticle(Article article);
    Page<Article> articleByTitre(String titre, int page, int size);
    Article deleteArticle(Long id);
}
