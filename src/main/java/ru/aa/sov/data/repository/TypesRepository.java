package ru.aa.sov.data.repository;

import org.springframework.data.repository.CrudRepository;
import ru.aa.sov.data.entity.FormEntity;
import ru.aa.sov.data.entity.TypeEntity;

public interface TypesRepository extends CrudRepository<TypeEntity, Long>{
}
