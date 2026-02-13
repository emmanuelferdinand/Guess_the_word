package com.example.guess_the_word.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class GameController {

    @GetMapping("/game-home")
    public String showGameHomePage(){
        return "game-home-page";
    }

}
