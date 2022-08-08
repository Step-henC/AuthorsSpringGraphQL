package com.example.graphql;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
interface AuthorRepository extends CrudRepository<Author, Long> {

    List<Author> getAuthorsById(long id);

    List<Author> getAuthorsByName(String name);
}
