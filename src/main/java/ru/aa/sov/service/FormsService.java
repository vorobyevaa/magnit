package ru.aa.sov.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.aa.sov.data.entity.FormEntity;
import ru.aa.sov.data.repository.FormsRepository;
import ru.aa.sov.dto.Form;
import ru.aa.sov.mapper.FormMapper;

import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;

@Service
@RequiredArgsConstructor
public class FormsService {

    private final FormsRepository formsRepository;
    private final FormMapper formMapper;

    public List<Form> items() {
        return StreamSupport.stream(formsRepository.findAll().spliterator(), false)
                .map(item -> formMapper.fromEntity(item))
                .toList();
    }

    public void add(String name) {
        Form form = new Form();
        form.setName(name);
        formsRepository.save(formMapper.toEntity(form));

    }

    public void del(Long id) {
        formsRepository.deleteById(id);

    }

    public void update(Long id, String name) {

        Optional<FormEntity> formEntity = formsRepository.findById(id);
        if (formEntity.isPresent()) {
            formEntity.get().setName(name);




            formsRepository.save(formEntity.get());
        }


    }

}
