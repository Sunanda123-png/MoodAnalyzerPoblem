package com.bridgelabz;

/**
 * author:-Sunanda Shil
 */

public class MoodAnalysis {
    String message;
    //creating parametarize constructor for initialize
    public void MoodAnalysis(String message){
        this.message=message;
    }
    //created method to check Mood
    public String analyseMood (String message) throws MoodAnalysisException {
        try {
            if (message.contains("SAD")) {
                return "SAD";
            }
            return "HAPPY";
        }catch (NullPointerException e){
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_NULL,"Please enter a valid Message");
        }
    }
}
