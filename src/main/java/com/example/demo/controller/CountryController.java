package com.example.demo.controller;


import com.example.demo.model.Country;
import com.example.demo.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @RequestMapping annotation on the class defines a base URL for all the REST APIs created in this controller.
 * This base URL is followed by individual REST endpoints given to each of the controller methods.
 * @RestController on the class is a combination of:
 * @Controller - tells Spring Boot that this class is a controller.
 * @ResponseBody - indicates that the return value of the methods inside the controller will be returned as the response body for the REST API.
 * CountryService is injected as a dependency using @Autowired annotation.
 *
 *
 * Notice that some methods include @PathVariable, meaning that the API endpoint has a path parameter involved.
 * The @PathVariable will map the path variable provided in the value parameter of the endpoint to the Java method field.
 */
@RestController
@RequestMapping("/api")
public class CountryController {
    @Autowired
    CountryService countryService;

    @RequestMapping(value="/countries", method= RequestMethod.GET)
    public List<Country> readCountry() {
        return countryService.getCountry();
    }

    @RequestMapping(value="/countries/{countryId}", method=RequestMethod.PUT)
    public Country readCountry(@PathVariable(value = "countryId") Integer id, @RequestBody Country countryDetails) {
        return countryService.updateCountry(id, countryDetails);
    }

    @RequestMapping(value="/countries/{countryId}", method=RequestMethod.DELETE)
    public void deleteCountry(@PathVariable(value = "countryId") Integer id) {
        countryService.deleteCountry(id);
    }

}