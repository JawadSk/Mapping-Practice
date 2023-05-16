package com.jawad.MappingPractice.repository;

import com.jawad.MappingPractice.model.Laptop;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILaptopRepository extends ListCrudRepository<Laptop, String> {
}
