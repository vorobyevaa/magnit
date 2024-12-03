package ru.aa.sov.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import ru.aa.sov.data.entity.FormEntity;
import ru.aa.sov.data.entity.TownEntity;
import ru.aa.sov.dto.Form;
import ru.aa.sov.dto.Town;

@Mapper(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface FormsMapper extends BaseEntityMapper<FormEntity, Form> {
}
