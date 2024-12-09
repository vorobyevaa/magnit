package ru.aa.sov.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import ru.aa.sov.data.entity.FormEntity;
import ru.aa.sov.data.entity.TypeEntity;
import ru.aa.sov.dto.Form;
import ru.aa.sov.dto.Type;

@Mapper(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface TypeMapper extends BaseEntityMapper<TypeEntity, Type> {
}
