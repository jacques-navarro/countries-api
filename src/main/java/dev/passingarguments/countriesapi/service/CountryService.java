package dev.passingarguments.countriesapi.service;

import dev.passingarguments.countriesapi.entity.Country;

import java.util.List;

public interface CountryService {

    List<Country> findAll();

}
