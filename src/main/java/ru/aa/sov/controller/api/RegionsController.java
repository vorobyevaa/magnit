package ru.aa.sov.controller.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.aa.sov.dto.Region;
import ru.aa.sov.service.TownsService;

import java.util.List;

@RestController
@RequestMapping("/regions")
@Api(description = "Регионы")
@RequiredArgsConstructor
public class RegionsController {

    private final TownsService townsService;

    @GetMapping("/")
    @ApiOperation("Получить все регионы")
    public List<Region> items() {
        return townsService.regions();
    }
}
