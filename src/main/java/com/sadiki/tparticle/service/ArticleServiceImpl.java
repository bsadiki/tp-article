package com.sadiki.tparticle.service;

import com.sadiki.tparticle.domain.Article;
import com.sadiki.tparticle.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;


@Service
public class ArticleServiceImpl implements ArticleService{
    @Autowired
    ArticleRepository articleRepository;

    @Override
    public Article addArticle(Article article) {
        return articleRepository.save(article);
    }

    @Override
    public Page<Article> articleByTitre(String titre, int page, int size) {
        return  articleRepository.findByTitreContains(titre,new PageRequest(page,size));
    }
    @Override
    public Article deleteArticle(Long id){
        Article article = articleRepository.findOne(id);
        articleRepository.delete(id);
        return article;
    }
}
