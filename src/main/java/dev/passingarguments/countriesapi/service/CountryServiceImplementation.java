package dev.passingarguments.countriesapi.service;

import dev.passingarguments.countriesapi.dao.CountryDAO;
import dev.passingarguments.countriesapi.entity.Country;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImplementation implements CountryService {

    private CountryDAO countryDAO;

    public CountryServiceImplementation(CountryDAO countryDAO) {
        this.countryDAO = countryDAO;
    }

    @Override
    public List<Country> findAll() {
        return countryDAO.findAll();
    }

    @Override
    public Country findById(int id) {
        return countryDAO.findById(id);
    }

    @Override
    public Country findByName(String countryName) {
        return countryDAO.findByCountryName(countryName);
    }

    @Override
    public List<Country> findAllCountriesWithFirstLetter(String firstLetter) {
        return countryDAO.findAllCountriesWithFirstLetter(firstLetter);
    }

    @Override
    public List<Country> findAllByPopulation() {
        return countryDAO.findAllByPopulation();
    }

    @Override
    public List<Country> findLargestCountriesByPopulation(int numberOfCountries) {
        return countryDAO.findLargestCountriesByPopulation(numberOfCountries);
    }

    @Override
    public List<Country> findAllByCapital() {
        return countryDAO.findAllByCapital();
    }

    @Override
    public Country findByCapital(String capital) {
        return countryDAO.findByCapital(capital);
    }

    @Override
    public List<Country> findAllCapitalsWithFirstLetter(String firstLetter) {
        return countryDAO.findAllCapitalsWithFirstLetter(firstLetter);
    }

}
