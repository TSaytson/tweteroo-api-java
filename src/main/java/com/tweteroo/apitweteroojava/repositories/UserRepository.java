package com.tweteroo.apitweteroojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tweteroo.apitweteroojava.models.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {
  
}
