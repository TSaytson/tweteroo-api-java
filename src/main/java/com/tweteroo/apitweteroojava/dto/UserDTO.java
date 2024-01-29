package com.tweteroo.apitweteroojava.dto;

import org.hibernate.validator.constraints.URL;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserDTO {

  @NotBlank(message = "Username is required")
  @Size(max = 100)
  private String username;

  @NotBlank(message = "Avatar is required")
  @URL(message = "Avatar must be an URL")
  private String avatar;
}
