package com.tweteroo.apitweteroojava.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroo.apitweteroojava.dto.TweetDTO;
import com.tweteroo.apitweteroojava.models.TweetModel;
import com.tweteroo.apitweteroojava.services.TweetService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/tweets")
public class TweetsController {

  final TweetService tweetService;

  TweetsController(TweetService tweetService){
    this.tweetService = tweetService;
  }
  
  @PostMapping
  public ResponseEntity<TweetModel> createTweet(@RequestBody @Valid TweetDTO body){
    return ResponseEntity.created(null).body(tweetService.create(body));
  }

  @GetMapping
  public ResponseEntity<List<TweetModel>> getTweets(){
    List<TweetModel> tweets = tweetService.findAll();
    return ResponseEntity.ok().body(tweets);
  }

  @GetMapping("/user/{userId}")
  public ResponseEntity<TweetModel> getTweetsByUserId(@PathVariable Long userId){
    
    return ResponseEntity.ok().build();
  }
}
