package ru.aa.sov.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.aa.sov.data.entity.LocalEntity;
import ru.aa.sov.data.repository.LocalRepository;
import ru.aa.sov.dto.Local;
import ru.aa.sov.mapper.LocalMapper;

import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;

@Service
@RequiredArgsConstructor
public class LocalService {

    private final LocalRepository localRepository;
    private final LocalMapper localMapper;

    public List<Local> items() {
        return StreamSupport.stream(localRepository.findAll().spliterator(), false)
                .map(item -> localMapper.fromEntity(item))
                .toList();
    }

    public void add(String name) {
        Local local = new Local();
        local.setName(name);
        localRepository.save(localMapper.toEntity(local));

    }

    public void del(Long id) {
        localRepository.deleteById(id);

    }

    public void update(Long id, String name) {

        Optional<LocalEntity> localEntity = localRepository.findById(id);
        if (localEntity.isPresent()) {
            localEntity.get().setName(name);
            localRepository.save(localEntity.get());
        }

    }
}

