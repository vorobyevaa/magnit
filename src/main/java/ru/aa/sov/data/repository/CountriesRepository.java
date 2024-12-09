package ru.aa.sov.data.repository;

import org.springframework.data.repository.CrudRepository;
import ru.aa.sov.data.entity.CountryEntity;
import ru.aa.sov.dto.Country;

public interface CountriesRepository extends CrudRepository <CountryEntity, Country> {

}
