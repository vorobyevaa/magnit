package ru.aa.sov.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.aa.sov.dto.Town;
import ru.aa.sov.service.TownsService;

import java.util.List;

@RestController
@RequestMapping("/towns")
@RequiredArgsConstructor
public class TownsController {

    private final TownsService townsService;

    @GetMapping("/")
    public List<Town> items(){
          return townsService.items();
      }
}
