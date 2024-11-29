package ru.aa.sov.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.aa.sov.data.repository.TownsRepository;
import ru.aa.sov.dto.Town;
import ru.aa.sov.mapper.TownMapper;

import java.util.List;
import java.util.stream.StreamSupport;

@Service
@RequiredArgsConstructor
public class TownsService {

    private final TownsRepository townsRepository;
    private final TownMapper townMapper;

    public List<Town> items() {
        return StreamSupport.stream(townsRepository.findAll().spliterator(), false)
                .map(item -> townMapper.fromEntity(item))
                .toList();
    }
}