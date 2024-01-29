package com.tweteroo.apitweteroojava.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tweteroo.apitweteroojava.models.TweetModel;

@Repository
public interface TweetRepository extends JpaRepository<TweetModel, Long> {
  @Query(value = "SELECT * FROM tweets WHERE userId=:userId", nativeQuery = true)
  List<TweetModel> findByUserId(@Param("userId") Long userId);
}
