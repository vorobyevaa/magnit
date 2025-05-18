package ru.aa.sov.controller.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.aa.sov.dto.Country;
import ru.aa.sov.service.TownsService;

import java.util.List;

@RestController
@RequestMapping("/countries")
@Api(description = "Страны")
@RequiredArgsConstructor
public class CountryController {

    private final TownsService townsService;

    @GetMapping("/")
    @ApiOperation("Получить все страны")
    public List<Country> items() {
        return townsService.countries();
    }

}
