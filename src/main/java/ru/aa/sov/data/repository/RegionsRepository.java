package ru.aa.sov.data.repository;

import org.springframework.data.repository.CrudRepository;
import ru.aa.sov.data.entity.RegionEntity;

public interface RegionsRepository extends CrudRepository <RegionEntity, Long> {
}
