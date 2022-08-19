package com.example.demo.service;

import com.example.demo.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The service component contains business logic.
 * Create a class named CountryService under the com.example.demo.service
 * package and replace the code with the contents below:
 *
 * In Spring, you use @Autowired annotation for instantiating a class object.
 *
 * The @Repository annotation from the CountryRepository class enabled the creation of a bean of this class
 * through the @ComponentScan feature of Spring. This bean is then used in the service class using @Autowired annotation.
 * This is called Dependency Injection in Spring.
 *
 */
@Service
public class CountryService {
    @Autowired
    CountryRepository empRepository;
}
