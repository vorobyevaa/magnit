package ru.aa.sov.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.aa.sov.data.repository.CountriesRepository;
/*import ru.aa.sov.data.repository.RegionsRepository;*/
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
public class TownsService {

    private final TownsRepository townsRepository;
/*    private final RegionsRepository regionsRepository; */
    private final CountriesRepository countriesRepository;
    private final TownMapper townMapper;
    private final RegionMapper regionMapper;
    private final CountryMapper countryMapper;

    public List<Town> items() {
        return StreamSupport.stream(townsRepository.findAll().spliterator(), false)
                .map(item -> townMapper.fromEntity(item))
                .toList();
    }

    public List <Region> regions() {
       /* return StreamSupport.stream(regionsRepository.findAll().spliterator(), false)
                .map(item -> {
                    Region region = regionMapper.fromEntity(item);
                    region.setTowns(
                        townsRepository.findByRegionId(region.getId()).stream()
                                .map(town -> townMapper.fromEntity(town))
                                .toList()
                    );
                    out(region);
                    return region;
                })
                .toList(); */
        return null;
    }

    public List <Country> countries() {
        return StreamSupport.stream(countriesRepository.findAll().spliterator(), false)
                .map(item -> countryMapper.fromEntity(item))
                .toList();
    }

    private void out(Object o) {
        String s = "-> " + o;
        System.out.println(s);
    }
}