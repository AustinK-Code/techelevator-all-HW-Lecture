package com.techelevator.countrylanguage;

import java.util.List;

public interface CountryLanguageDAO {
    public List<CountryLanguage> getLanguageForCountry(String countryCode);
        void updateLanguage(CountryLanguage cl);
    }



