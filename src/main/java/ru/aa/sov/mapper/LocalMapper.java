package ru.aa.sov.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import ru.aa.sov.data.entity.LocalEntity;
import ru.aa.sov.data.entity.TypeEntity;
import ru.aa.sov.dto.Local;
import ru.aa.sov.dto.Type;


@Mapper(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface LocalMapper extends BaseEntityMapper<LocalEntity, Local> {
}