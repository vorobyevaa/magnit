package ru.aa.sov.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.aa.sov.data.repository.FormsRepository;
import ru.aa.sov.data.repository.TownsRepository;
import ru.aa.sov.dto.Form;
import ru.aa.sov.dto.Town;
import ru.aa.sov.mapper.FormsMapper;
import ru.aa.sov.mapper.TownMapper;

import java.util.List;
import java.util.stream.StreamSupport;

@Service
@RequiredArgsConstructor
public class FormsService {

    private final FormsRepository formsRepository;
    private final FormsMapper formMapper;

    public List<Form> items() {
        return StreamSupport.stream(formsRepository.findAll().spliterator(), false)
                .map(item -> formMapper.fromEntity(item))
                .toList();
    }

   public void add(String name) {
        Form form=new Form();
        form.setName(name);
        formsRepository.save(formMapper.toEntity(form));

    }
}
