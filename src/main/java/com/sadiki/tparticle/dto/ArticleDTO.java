package com.sadiki.tparticle.dto;

import com.sadiki.tparticle.domain.Article;

import java.io.*;

public class ArticleDTO implements Serializable{
    private Long id;
    private String titre;
    private String description;
    private BASE64DecodedMultipartFile photo;
    private boolean selected;

    public ArticleDTO(Article article) {
        this.id = article.getId();
        this.titre = article.getTitre();
        this.description = article.getDescription();
        this.photo = new BASE64DecodedMultipartFile(article.getPhoto());
        this.selected = article.isSelected();
    }

    public ArticleDTO(String titre, String description, BASE64DecodedMultipartFile photo, boolean selected) {
        this.titre = titre;
        this.description = description;
        this.photo = photo;
        this.selected = selected;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BASE64DecodedMultipartFile getPhoto() {
        return photo;
    }

    public void setPhoto(BASE64DecodedMultipartFile photo) {
        this.photo = photo;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}
