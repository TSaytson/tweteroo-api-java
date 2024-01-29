package com.tweteroo.apitweteroojava.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tweteroo.apitweteroojava.dto.UserDTO;
import com.tweteroo.apitweteroojava.models.UserModel;
import com.tweteroo.apitweteroojava.repositories.UserRepository;

@Service
public class UserService {
  
  @Autowired
  private UserRepository userRepository;

  public UserModel create(UserDTO body){
    UserModel user = new UserModel(body);
    return userRepository.save(user);
  }
}
