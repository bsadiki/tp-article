package com.sadiki.tparticle.controller;

import com.sadiki.tparticle.domain.Article;
import com.sadiki.tparticle.dto.ArticleDTO;
import com.sadiki.tparticle.repository.ArticleRepository;
import com.sadiki.tparticle.service.ArticleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@Api(tags = "ArticleController")
public class ArticleRestController {
    @Autowired
    ArticleService articleService;
    @GetMapping(value = "/findByTitre")
    @ApiOperation(value = "Chercher les article par titre")
    Page<ArticleDTO> findByTitre(@RequestParam(defaultValue = "") String titre,
                                 @RequestParam(defaultValue = "0") int page,
                                 @RequestParam(defaultValue = "5") int size){
        return articleService.articleByTitre(titre,page,size);
    }

}
