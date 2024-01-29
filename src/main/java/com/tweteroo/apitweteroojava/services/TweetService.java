package com.tweteroo.apitweteroojava.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tweteroo.apitweteroojava.dto.TweetDTO;
import com.tweteroo.apitweteroojava.models.TweetModel;
import com.tweteroo.apitweteroojava.repositories.TweetRepository;

@Service
public class TweetService {
  final TweetRepository tweetRepository;

  TweetService(TweetRepository tweetRepository){
    this.tweetRepository = tweetRepository;
  }

  public List<TweetModel> findAll(){
    return tweetRepository.findAll();
  }

  public TweetModel create(TweetDTO body){
    TweetModel tweet = new TweetModel(body);
    return tweetRepository.save(tweet);
  }
}
