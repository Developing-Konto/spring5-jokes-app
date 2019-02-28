package com.butcheer.joke.controllers;

import com.butcheer.joke.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Butcheer on 2019-02-28 14:42
 */
@Controller
public class JokeController {

   private final JokeService jokeService;

   @Autowired
   public JokeController(JokeService jokeService) {this.jokeService = jokeService;}


   @RequestMapping({"/", ""})
   public String showJoke(Model model) {
      model.addAttribute("joke", jokeService.getJoke());
      return "chucknorris"; //view name
   }


}
