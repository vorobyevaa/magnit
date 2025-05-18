package ru.aa.sov.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.aa.sov.data.repository.CountriesRepository;
/*import ru.aa.sov.data.repository.RegionsRepository;*/
import ru.aa.sov.data.repository.RegionsRepository;
import ru.aa.sov.data.repository.TownsRepository;
import ru.aa.sov.dto.Country;
import ru.aa.sov.dto.Region;
import ru.aa.sov.dto.Town;
import ru.aa.sov.mapper.CountryMapper;
import ru.aa.sov.mapper.RegionMapper;
import ru.aa.sov.mapper.TownMapper;

import java.util.List;
import java.util.stream.StreamSupport;

@Slf4j
@Service
@RequiredArgsConstructor
public class TownsService extends AbstractService<TownsRepository> {
    private final RegionsRepository regionsRepository;
    private final CountriesRepository countriesRepository;
    private final TownMapper townMapper;
    private final RegionMapper regionMapper;
    private final CountryMapper countryMapper;

    public List<Town> items() {
        return StreamSupport.stream(tRepository.findAll().spliterator(), false)
                .map(item -> townMapper.fromEntity(item))
                .toList();
    }

    public List <Region> regions() {
        return StreamSupport.stream(regionsRepository.findAll().spliterator(), false)
                .map(item -> {
                    Region region = regionMapper.fromEntity(item);
                    region.setTowns(
                            tRepository.findByRegionId(region.getId()).stream()
                                .map(town -> townMapper.fromEntity(town))
                                .toList()
                    );
                    return region;
                })
                .toList();
    }

    public List <Country> countries() {
        return StreamSupport.stream(countriesRepository.findAll().spliterator(), false)
                .map(item -> countryMapper.fromEntity(item))
                .toList();
    }
}