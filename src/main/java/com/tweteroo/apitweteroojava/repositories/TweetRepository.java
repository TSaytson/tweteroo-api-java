package com.tweteroo.apitweteroojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tweteroo.apitweteroojava.models.TweetModel;

@Repository
public interface TweetRepository extends JpaRepository<TweetModel, Long> {
  
}
