package com.tweteroo.apitweteroojava.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tweets")
public class TweetsController {
  
  @PostMapping
  public String createTweet(@RequestBody String body){
    return "This route creates a tweet";
  }

  @GetMapping
  public String getTweets(){
    return "This returns all tweets";
  }

  @GetMapping("/user/{userId}")
  public String getTweetsByUserId(@PathVariable Long userId){
    return "This route gets tweets by userId: " + userId;
  }
}
