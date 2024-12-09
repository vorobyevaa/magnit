package ru.aa.sov.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import ru.aa.sov.data.entity.CountryEntity;
import ru.aa.sov.dto.Country;

@Mapper(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface CountryMapper extends BaseEntityMapper <CountryEntity, Country> {
}
