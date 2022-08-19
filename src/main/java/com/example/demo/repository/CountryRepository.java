package com.example.demo.repository;

import com.example.demo.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The service component contains business logic.
 */
@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
