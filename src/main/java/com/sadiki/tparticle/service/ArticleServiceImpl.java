package com.sadiki.tparticle.service;

import com.sadiki.tparticle.domain.Article;
import com.sadiki.tparticle.dto.ArticleDTO;
import com.sadiki.tparticle.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService{
    @Autowired
    ArticleRepository articleRepository;

    @Override
    public ArticleDTO addArticle(ArticleDTO articleDTO) {
        Article article = new Article(articleDTO);
        return new ArticleDTO(articleRepository.save(article));
    }

    @Override
    public Page<ArticleDTO> articleByTitre(String titre, int page, int size) {
        Page<Article> articles = articleRepository.findByTitreContains(titre,new PageRequest(page,size));
        List<ArticleDTO> articleDTOS = new ArrayList<>();
        articles.getContent().forEach(article -> {
            articleDTOS.add(new ArticleDTO(article));
        });
        return new PageImpl<>(articleDTOS, new PageRequest(page,size), articles.getTotalElements());
    }
}
