package ru.aa.sov.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import ru.aa.sov.data.entity.TypeEntity;
import ru.aa.sov.data.repository.MagnetRepository;
import ru.aa.sov.data.repository.TypesRepository;
import ru.aa.sov.dto.Magnet;
import ru.aa.sov.dto.Type;
import ru.aa.sov.mapper.MagnetMapper;
import ru.aa.sov.mapper.TypeMapper;

import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;

@Service
@RequiredArgsConstructor
public class MagnetService {

    private final MagnetRepository magnetRepository;
    private final MagnetMapper magnetMapper;

    public Page<Magnet> getAll(Pageable pageable) {
        return magnetRepository.findAll(pageable).map(magnetMapper::fromEntity);
    }

    public List<Magnet> items() {
        return StreamSupport.stream(magnetRepository.findAll().spliterator(), false)
                .map(item -> magnetMapper.fromEntity(item))
                .toList();
    }

    public List<Magnet> items(Long locatiionId) {
        return StreamSupport.stream(magnetRepository.findAllByLocalId(locatiionId).spliterator(), false)
                .filter(item -> item.getLocal().getId().equals(locatiionId))
                .map(item -> magnetMapper.fromEntity(item))
                .toList();
    }

    public void add(Magnet magnet) {
        magnetRepository.save(magnetMapper.toEntity(magnet));
    }

    public void del(Long id) {
        magnetRepository.deleteById(id);

    }

    /*public void update(Long id, String name) {

        Optional<TypeEntity> typeEntity = typesRepository.findById(id);
        if (typeEntity.isPresent()) {
            typeEntity.get().setName(name);




            typesRepository.save(typeEntity.get());
        }

    } */

}

