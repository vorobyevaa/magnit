package ru.aa.sov.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.aa.sov.service.TownsService;

@RestController
@RequestMapping("/towns")
@RequiredArgsConstructor
public class TownsController {

    private final TownsService townsService;

    @GetMapping("/")
    public   String items(){
          return "townsService.items();";
      }
}
