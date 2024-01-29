package com.tweteroo.apitweteroojava.models;

import com.tweteroo.apitweteroojava.dto.TweetDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tweets")
public class TweetModel {

  public TweetModel(TweetDTO body){
    this.text = body.getText();
  }
  public TweetModel(TweetDTO body, UserModel user){
    this.text = body.getText();
    this.user = user;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(length = 280, nullable = false)
  private String text;

  @ManyToOne
  @JoinColumn(name="user_id")
  private UserModel user;
}
