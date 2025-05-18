package ru.aa.sov.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

@RequiredArgsConstructor
public class AbstractService<T extends CrudRepository> {

    @Autowired
    protected T tRepository;
}
