package com.example.graphql;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
class Author {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @OneToMany(mappedBy = "author", cascade =CascadeType.ALL)
    private List<Books> books;

    public Author(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }



    public String getName() {
        return name;
    }



    public List<Books> getBooks() {
        return books;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBooks(List<Books> books) {
        this.books = books;
    }
}
