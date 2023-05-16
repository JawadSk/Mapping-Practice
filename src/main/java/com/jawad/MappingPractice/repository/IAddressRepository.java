package com.jawad.MappingPractice.repository;

import com.jawad.MappingPractice.model.Address;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepository extends ListCrudRepository<Address, Long> {
}
