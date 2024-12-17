package ru.aa.sov.data.repository;

import org.springframework.data.repository.CrudRepository;

import ru.aa.sov.data.entity.LocalEntity;


public interface LocalRepository extends CrudRepository<LocalEntity, Long>{
}