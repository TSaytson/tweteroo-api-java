package com.tweteroo.apitweteroojava.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/users")
public class UsersController {
  
  @PostMapping
  public String createUser(@RequestBody String body){
    return body;
  }
}
