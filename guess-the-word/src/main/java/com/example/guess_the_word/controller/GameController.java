package com.example.guess_the_word.controller;

import com.example.guess_the_word.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class GameController {

    @Autowired // Create object of GameService, @Autowired helps inject @Service to gameService
    GameService gameService;

    @GetMapping("/game-home")

    public String showGameHomePage(Model model) { //Model from springframework.ui

        String randomWord = gameService.toString(); //randomWord need to be populated
        model.addAttribute("wordToDisplay", randomWord); // send randomWord to view (return) using model attribute called "model"

        return "game-home-page";
    }

}
