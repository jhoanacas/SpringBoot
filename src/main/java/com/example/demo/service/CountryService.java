package com.example.demo.service;

import com.example.demo.model.Country;
import com.example.demo.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The service component contains business logic.
 * Create a class named CountryService under the com.example.demo.service
 * package and replace the code with the contents below:
 * <p>
 * In Spring, you use @Autowired annotation for instantiating a class object.
 * <p>
 * The @Repository annotation from the CountryRepository class enabled the creation of a bean of this class
 * through the @ComponentScan feature of Spring. This bean is then used in the service class using @Autowired annotation.
 * This is called Dependency Injection in Spring.
 */
@Service
public class CountryService {
    @Autowired
    CountryRepository countryRepository;

    // CREATE
    public Country createCountry(Country country) {
        return countryRepository.save(country);
    }

    // READ
    public List<Country> getCountry() {
        return countryRepository.findAll();
    }

    // DELETE
    public void deleteCountry(Integer id) {
        countryRepository.deleteById(id);
    }

    // UPDATE

    /**
     * The updateCountry method accepts two parameters - a country ID (primary key)
     *  and the country object containing the new country details.
     * To update an existing country, you’ll first retrieve the country object where
     * country ID in the database equals countryId and store it in the country variable.
     * After getting the old country object, you’ll use the setters defined in Country.
     * java to update the fields with new values stored in countryDetails.
     * Lastly, the countryRepository.save(country) function will save the updated country object to the database
     * @param countryId
     * @param countryDetails
     * @return
     */
    public Country updateCountry(Integer countryId, Country countryDetails) {
        Country country = countryRepository.findById(countryId).get();
        country.setName(countryDetails.getName());
        return countryRepository.save(country);
    }
}
