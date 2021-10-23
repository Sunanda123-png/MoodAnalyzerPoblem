package com.bridgelabz;

/**
 * author:-Sunanda Shil
 */

public class MoodAnalysis {
    String message;
    //creating default constructor for null message
    public void MoodAnalysis(){
        message=" ";
    }
    //creating parametarize constructor for initialize
    public void MoodAnalysis(String message){
        this.message=message;
    }
    //created method to check Mood
    public String analyseMood(String message) {
        try {
            if (message.contains("SAD")) {
                return "SAD";
            }
            return "HAPPY";
        }catch (NullPointerException e){
            return "HAPPY";
        }


    }
}
