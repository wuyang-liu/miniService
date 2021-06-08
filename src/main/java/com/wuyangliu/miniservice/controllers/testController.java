package com.wuyangliu.miniservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
  
  @GetMapping("/welcome")
  public String welcome(){
    System.out.println("welcome");
    return "WELCOME TO SPRING BOOT";
  }
}
