package com.jawad.MappingPractice.repository;

import com.jawad.MappingPractice.model.Student;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepository extends ListCrudRepository<Student, String> {
}
