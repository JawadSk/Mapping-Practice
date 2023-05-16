package com.jawad.MappingPractice.repository;

import com.jawad.MappingPractice.model.Course;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourseRepository extends ListCrudRepository<Course, String> {
}
