package com.tweteroo.apitweteroojava.models;

import com.tweteroo.apitweteroojava.dto.UserDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="users")
public class UserModel {

  public UserModel(UserDTO body){
    this.username = body.getUsername();
    this.avatar = body.getAvatar();
  }

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(length = 100, nullable = false, unique = true)
  private String username;

  @Column(nullable = false)
  private String avatar;
}
