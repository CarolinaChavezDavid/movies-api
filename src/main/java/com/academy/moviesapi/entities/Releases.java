package com.academy.moviesapi.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="releases")
public class Releases {
    @Id
    private Long id;
    private String title;
    private String poster;
    private Double rating;
    private String description;
}
