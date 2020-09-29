package com.junit.testing;

public class MoodAnalyser {

    public void Display()
    {
        System.out.println("Welcome to Mood Analyser");
    }
    public String analyseMood(String message)
    {
        if(message.contains(("sad")))
        {
            return "SAD";
        }
        else
            return "HAPPY";
    }
}
