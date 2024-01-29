package com.tweteroo.apitweteroojava.services;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tweteroo.apitweteroojava.dto.TweetDTO;
import com.tweteroo.apitweteroojava.models.TweetModel;
import com.tweteroo.apitweteroojava.models.UserModel;
import com.tweteroo.apitweteroojava.repositories.TweetRepository;
import com.tweteroo.apitweteroojava.repositories.UserRepository;

@Service
public class TweetService {
  final TweetRepository tweetRepository;
  final UserRepository userRepository;

  TweetService(TweetRepository tweetRepository, UserRepository userRepository){
    this.tweetRepository = tweetRepository;
    this.userRepository = userRepository;
  }

  public List<TweetModel> findAll(){
    return tweetRepository.findAll();
  }

  public TweetModel create(TweetDTO body) throws FileNotFoundException {
    Optional<UserModel> user = userRepository.findById(body.getUserId());
    if (!user.isPresent()){
      throw new FileNotFoundException("User does not exists");
    }
    TweetModel tweet = new TweetModel(body, user.get());
    return tweetRepository.save(tweet);
  }

  public List<TweetModel> findByUserId(Long userId){
    List<TweetModel> tweets = tweetRepository.findByUserId(userId);
    return tweets;
  }
}
