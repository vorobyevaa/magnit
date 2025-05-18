package ru.aa.sov.controller.api;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.aa.sov.dto.Form;
import ru.aa.sov.service.FormsService;

import java.util.List;

@RestController
@RequestMapping("/forms")
@RequiredArgsConstructor
public class FormsController {

    private final FormsService formsService;

    @GetMapping("/")
    public List<Form> items(){
        return formsService.items();


    }

    @PostMapping ("/")
    public void add(@RequestParam("ттттт") String name){
        formsService.add(name);}

    @DeleteMapping("/{id}")
           public void del(@PathVariable("id") Long id){
        formsService.del(id);
    }

@PatchMapping("/{id}")
public void update(@PathVariable("id") Long id, @RequestParam("ттттт") String name) {
    formsService.update(id,name);
}

}
