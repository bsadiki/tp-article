package com.sadiki.tparticle.repository;

import com.sadiki.tparticle.domain.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ArticleRepository extends JpaRepository<Article,Long>{
    Page<Article> findByTitreContains(String titre, Pageable pageable);
}
