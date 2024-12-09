package ru.aa.sov.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import ru.aa.sov.data.entity.FormEntity;
import ru.aa.sov.dto.Form;

@Mapper(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface FormMapper extends BaseEntityMapper<FormEntity, Form> {
}
