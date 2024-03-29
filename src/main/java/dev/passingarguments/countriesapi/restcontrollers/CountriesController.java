package dev.passingarguments.countriesapi.restcontrollers;

import dev.passingarguments.countriesapi.entity.Country;
import dev.passingarguments.countriesapi.service.CountryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/countries")
public class CountriesController {

    private CountryService countryService;

    public CountriesController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("")
    public List<Country> getCountries() {
        return countryService.findAll();
    }

    @GetMapping("/{id}")
    public Country getCountry(@PathVariable int id) {
        return countryService.findById(id);
    }

    @GetMapping("/name/{countryName}")
    public Country getCountryByName(@PathVariable String countryName) {
        return countryService.findByName(countryName);
    }

    @GetMapping("/name/firstletter")
    public List<Country> getCountriesByFirstLetter(
            @RequestParam(value = "firstLetter",
            required = false)
            String firstLetter) {
        return countryService.findAllCountriesWithFirstLetter(firstLetter);
    }

    @GetMapping("/population")
    public List<Country> getCountriesByPopulation() {
        return countryService.findAllByPopulation();
    }

    @GetMapping("/population/{numberOfCountries}")
    public List<Country> getLargestCountriesByPopulation(@PathVariable int numberOfCountries) {
        return countryService.findLargestCountriesByPopulation(numberOfCountries);
    }

    @GetMapping("/capital")
    public List<Country> getCountriesByCapital() {
        return countryService.findAllByCapital();
    }

    @GetMapping("/capital/{capital}")
    public Country getCountryByCapital(@PathVariable String capital) {
        return countryService.findByCapital(capital);
    }

    @GetMapping("/capital/firstletter")
    public List<Country> getCapitalsByFirstLetter(
            @RequestParam(value = "firstLetter",
            required = false)
            String firstLetter) {
        return countryService.findAllCapitalsWithFirstLetter(firstLetter);
    }

}