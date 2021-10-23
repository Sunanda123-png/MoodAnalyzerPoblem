package com.bridgelabz;

/**
 * author:-Sunanda Shil
 */

public class MoodAnalysis {
    //created method to check Mood
    public String analyseMood(String message) {
        //message=message.toLowerCase();
        if (message.contains("I am in Happy Mood")){
            return "SAD";
        }
        return "HAPPY";

    }
}
