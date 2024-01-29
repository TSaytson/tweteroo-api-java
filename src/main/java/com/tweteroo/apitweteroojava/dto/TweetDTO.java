package com.tweteroo.apitweteroojava.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class TweetDTO {

  @NotBlank(message = "Tweet cannot be empty")
  @Size(max = 280)
  private String text;

  @NotNull(message = "An user is required")
  @Positive(message = "Invalid user")
  private Long userId;
}
