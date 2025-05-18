package ru.aa.sov.controller.api;

import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.aa.sov.dto.Type;
import ru.aa.sov.service.TypesService;


import java.util.List;
@RestController
@Api(description = "Типы магнитиков")
@RequestMapping("/types")
@RequiredArgsConstructor
public class TypesController {
    private final TypesService typesService;

    @GetMapping("/")
    public List<Type> items(){
        return typesService.items();


    }

    @PostMapping("/")
    public void add(@RequestParam("ттттт") String name){
        typesService.add(name);}

    @DeleteMapping("/{id}")
    public void del(@PathVariable("id") Long id){
        typesService.del(id);
    }

    @PatchMapping("/{id}")
    public void update(@PathVariable("id") Long id, @RequestParam("ттттт") String name) {
        typesService.update(id,name);
    }
}
