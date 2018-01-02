package com.sadiki.tparticle.domain;

import com.sadiki.tparticle.dto.ArticleDTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.io.IOException;
import java.io.Serializable;
@Entity
public class Article implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String titre;
    private String description;
    @Lob
    private byte[] photo;
    private boolean selected;


    public Article() {
    }
    public Article(String titre, String description, byte[] photo, boolean selected) {
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
    @Lob
    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}
