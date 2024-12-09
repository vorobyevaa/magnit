package ru.aa.sov.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.aa.sov.data.entity.TypeEntity;
import ru.aa.sov.data.repository.TypesRepository;
import ru.aa.sov.dto.Type;
import ru.aa.sov.mapper.TypeMapper;

import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;

@Service
@RequiredArgsConstructor
public class TypesService {

    private final TypesRepository typesRepository;
    private final TypeMapper typeMapper;

    public List<Type> items() {
        return StreamSupport.stream(typesRepository.findAll().spliterator(), false)
                .map(item -> typeMapper.fromEntity(item))
                .toList();
    }

    public void add(String name) {
       Type type = new Type();
        type.setName(name);
        typesRepository.save(typeMapper.toEntity(type));

    }

    public void del(Long id) {
        typesRepository.deleteById(id);

    }

    public void update(Long id, String name) {

        Optional<TypeEntity> typeEntity = typesRepository.findById(id);
        if (typeEntity.isPresent()) {
           typeEntity.get().setName(name);




            typesRepository.save(typeEntity.get());
        }
    
}}
