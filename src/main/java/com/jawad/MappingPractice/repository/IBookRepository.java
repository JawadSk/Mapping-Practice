package com.jawad.MappingPractice.repository;

import com.jawad.MappingPractice.model.Book;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookRepository extends ListCrudRepository<Book, String> {
}
