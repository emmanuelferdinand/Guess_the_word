package com.example.guess_the_word.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service //So that the service object can be created in controller
public class GameService {

    private String[] randomWords = {"dog", "cat", "bird", "pig", "cow"}; //Create list of words to use (word bank)
    Random random = new Random(); //Random class object using Java random generator

    @Override
    public String toString() {
        System.out.println(randomWords.length);
        // return random words based on random number index
        // use the array length of the word bank 0-4 since the length is exclusive
        return randomWords[random.nextInt(randomWords.length)];
    }
}
