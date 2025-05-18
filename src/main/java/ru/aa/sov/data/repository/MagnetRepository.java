package ru.aa.sov.data.repository;

import org.springframework.data.repository.CrudRepository;
import ru.aa.sov.data.entity.MagnetEntity;

import java.util.List;

public interface MagnetRepository extends CrudRepository<MagnetEntity, Long> {

    List<MagnetEntity> findAllByLocalId(Long locationId);
}
