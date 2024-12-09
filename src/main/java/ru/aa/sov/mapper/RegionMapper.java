package ru.aa.sov.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import ru.aa.sov.data.entity.RegionEntity;
import ru.aa.sov.dto.Region;

@Mapper(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface RegionMapper extends BaseEntityMapper <RegionEntity, Region> {
}
