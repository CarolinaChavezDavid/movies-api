package com.academy.moviesapi.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

public class Ulises {
    @Entity
    @Table(name = "foos")
    public class FooModel {
        @Id
        private Long id;
        private String fooName;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getFooName() {
            return fooName;
        }

        public void setFooName(String fooName) {
            this.fooName = fooName;
        }
    }
}
