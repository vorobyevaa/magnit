package ru.aa.sov.data.repository;

import org.springframework.data.repository.CrudRepository;
import ru.aa.sov.data.entity.MagnetEntity;

public interface MagnetRepository extends CrudRepository<MagnetEntity, Long> {
}
