package com.sadiki.tparticle.service;

import com.sadiki.tparticle.dto.ArticleDTO;
import org.springframework.data.domain.Page;

public interface ArticleService {
    ArticleDTO addArticle(ArticleDTO articleDTO);
    Page<ArticleDTO> articleByTitre(String titre, int page, int size);
}
