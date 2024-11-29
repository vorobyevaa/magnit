package ru.aa.sov.data.repository;

import org.springframework.data.repository.CrudRepository;
import ru.aa.sov.data.entity.TownEntity;

public interface TownsRepository extends CrudRepository<TownEntity, Long> {
}
