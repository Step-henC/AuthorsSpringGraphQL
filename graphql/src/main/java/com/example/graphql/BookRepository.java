package com.example.graphql;

import org.springframework.data.repository.CrudRepository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;


interface BookRepository extends CrudRepository<Books, Long> {




}
