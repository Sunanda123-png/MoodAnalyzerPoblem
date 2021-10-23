package com.bridgelabz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class MoodAnalysisTsest {
    @Test
    void givenMessage_WhenSad_ShouldReturnSad() throws MoodAnalysisException {
        try{
            MoodAnalysis moodAnalyser = new MoodAnalysis();
            String mood = moodAnalyser.analyseMood(null);
            Assertions.assertEquals("HAPPY", mood);
        }catch (Exception e){

        }
    }
}
