package ru.aa.sov.data.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import ru.aa.sov.data.entity.MagnetEntity;

import java.util.List;

public interface MagnetRepository extends PagingAndSortingRepository<MagnetEntity, Long> {

    List<MagnetEntity> findAllByLocalId(Long locationId);
}
