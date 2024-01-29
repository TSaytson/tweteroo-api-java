package com.tweteroo.apitweteroojava.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class TweetDTO {

  @NotBlank(message = "Tweet cannot be empty")
  @Size(max = 280)
  private String tweet;
}
