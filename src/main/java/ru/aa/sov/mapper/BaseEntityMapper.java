package ru.aa.sov.mapper;

import org.mapstruct.MappingTarget;

import java.util.Collection;
import java.util.List;

public interface BaseEntityMapper<Entity, Model> {

    Entity toEntity(Model model);

    List<Entity> toEntityList(Collection<Model> model);

    Entity mergeToEntity(Model model, @MappingTarget Entity entity);

    Model fromEntity(Entity entity);

    List<Model> fromEntityList(Collection<Entity> entity);

    void update(@MappingTarget Entity target, Model source);
}
