package com.butcheer.joke.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Butcheer on 2019-02-28 14:36
 */
@Service
public class JokeServiceImpl implements JokeService {

   private final ChuckNorrisQuotes chuckNorrisQuotes;


   public JokeServiceImpl() {
      this.chuckNorrisQuotes = new ChuckNorrisQuotes();
   }

   @Override
   public String getJoke() {
      return chuckNorrisQuotes.getRandomQuote();
   }
}
