package com.tweteroo.apitweteroojava.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.tweteroo.apitweteroojava.dto.UserDTO;
import com.tweteroo.apitweteroojava.models.UserModel;
import com.tweteroo.apitweteroojava.services.UserService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/users")
public class UsersController {

  @Autowired
  private UserService userService;

  @PostMapping
  public ResponseEntity<Object> createUser(@RequestBody @Valid UserDTO body){
    try {
      return ResponseEntity.status(201).body(userService.create(body));
    } catch (Exception e) {
      return ResponseEntity.status(422).body(e.getMessage());
    }
  }
}
