package ru.aa.sov.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import ru.aa.sov.data.entity.TownEntity;
import ru.aa.sov.dto.Town;

@Mapper(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface TownMapper extends BaseEntityMapper<TownEntity, Town> {
}
