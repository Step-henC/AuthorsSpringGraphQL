package com.example.graphql;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class AuthorController {

    private final AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @QueryMapping //grapql annotation
    Iterable<Author> authors(){   //name of method must match what is in the graphql schema if not match provide diff name in queryMapping annotation

        return authorRepository.findAll();
    }
}
