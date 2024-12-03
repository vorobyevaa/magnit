package ru.aa.sov.controller;


import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.aa.sov.dto.Form;
import ru.aa.sov.dto.Town;
import ru.aa.sov.service.FormsService;
import ru.aa.sov.service.TownsService;

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
}
