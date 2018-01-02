package com.sadiki.tparticle.controller;

import com.sadiki.tparticle.domain.Article;
import com.sadiki.tparticle.service.ArticleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@Api(tags = "ArticleController")
public class ArticleRestController {
    @Autowired
    ArticleService articleService;
    @GetMapping(value = "/findByTitre")
    @ApiOperation(value = "Chercher les article par titre")
    Page<Article> findByTitre(@RequestParam(defaultValue = "") String titre,
                                 @RequestParam(defaultValue = "0") int page,
                                 @RequestParam(defaultValue = "5") int size){
        return articleService.articleByTitre(titre,page,size);
    }
    @PostMapping(value = "/addArticle")
    @ApiOperation(value = "Ajouter un nouveau article")
    Article addArticle(@RequestBody Article article){
        return articleService.addArticle(article);
    }
    @DeleteMapping(value = "/delete")
    @ApiOperation(value = "Supprimer un article")
    Article delete(@RequestParam() Long id){
        return articleService.deleteArticle(id);
    }
}
