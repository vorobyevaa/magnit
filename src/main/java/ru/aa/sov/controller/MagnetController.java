package ru.aa.sov.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.aa.sov.dto.Magnet;
import ru.aa.sov.dto.Type;
import ru.aa.sov.service.MagnetService;
import ru.aa.sov.service.TypesService;

import java.util.List;

@RestController
@Api(description = "Машнитики сами")
@RequestMapping("/items")
@RequiredArgsConstructor
public class MagnetController {
    private final MagnetService magnetService;

    @GetMapping("/")
    public List<Magnet> items(){
        return magnetService.items();
    }

    @GetMapping("/test")
    public List<Magnet> test(){
        return magnetService.items(1L);
    }

    @PostMapping("/")
    public void add(@RequestBody @Parameter(name = "item", description = "Добавляемый элемент") Magnet magnet){
        magnetService.add(magnet);}

    @DeleteMapping("/{id}")
    public void del(@PathVariable("id") Long id){
        magnetService.del(id);
    }

    /*@PatchMapping("/{id}")
    public void update(@PathVariable("id") Long id, @RequestParam("Название") String name) {
        magnetService.update(id,name);
    }*/
}
