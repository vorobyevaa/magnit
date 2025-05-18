package ru.aa.sov.controller.api;

import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.aa.sov.dto.Local;
import ru.aa.sov.dto.Type;
import ru.aa.sov.service.LocalService;
import ru.aa.sov.service.TypesService;

import java.util.List;



@RestController
@Api(description = "Локация")
@RequestMapping("/locations")
@RequiredArgsConstructor
public class LocalController {
    private final LocalService localService;

    @GetMapping("/")
    public List<Local> items(){
        return localService.items();


    }

    @PostMapping("/")
    public void add(@RequestParam("ттттт") String name){
        localService.add(name);}

    @DeleteMapping("/{id}")
    public void del(@PathVariable("id") Long id){
        localService.del(id);
    }

    @PatchMapping("/{id}")
    public void update(@PathVariable("id") Long id, @RequestParam("ттттт") String name) {
        localService.update(id,name);
    }
}
