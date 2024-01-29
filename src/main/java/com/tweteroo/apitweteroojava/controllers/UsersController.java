package com.tweteroo.apitweteroojava.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException.UnprocessableEntity;

import com.tweteroo.apitweteroojava.dto.UserDTO;
import com.tweteroo.apitweteroojava.services.UserService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
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
      return ResponseEntity.status(HttpStatus.CREATED).body(userService.create(body));
    } catch (DuplicateKeyException e) {
        return ResponseEntity.status(HttpStatus.CONFLICT).body(e.getMessage());
    } catch (Exception e){
        return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).
        body(e.getMessage());
    }
  }
}
