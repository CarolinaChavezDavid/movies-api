package com.academy.moviesapi.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="series")
public class Serie {
    @Id
    private Long id;
    private String title;
    private String poster;
    private Double rating;
    private Integer gender;
    /**
     * GENDER
     * 1 romance
     * 2 accion
     * 3 comedia
     * 4 animes
     * 5 dramas
     * 6 HOSTORICAL*/

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }
}
