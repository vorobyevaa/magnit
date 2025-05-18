package ru.aa.sov.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.ReportingPolicy;
import ru.aa.sov.data.entity.MagnetEntity;
import ru.aa.sov.data.entity.TownEntity;
import ru.aa.sov.dto.Magnet;
import ru.aa.sov.dto.Town;

@Mapper(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface MagnetMapper extends BaseEntityMapper<MagnetEntity, Magnet> {

    @Mapping(source = "entity", target = "name", qualifiedByName = "formName")
    Magnet fromEntity(MagnetEntity entity);

    @Named("formName")
    public default String formName(MagnetEntity entity) {
        if (entity.getTown().getIsNotSpecified()) {
            return entity.getTown().getRegion().getName();
        }
        return entity.getTown().getName();
    }
}
