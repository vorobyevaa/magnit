package ru.aa.sov.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/towns")
public class TownsController {
    @GetMapping("/")
      String items(){
          return "12345";
      }
}
