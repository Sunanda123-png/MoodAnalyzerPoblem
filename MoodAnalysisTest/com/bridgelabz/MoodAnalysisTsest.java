package com.bridgelabz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class MoodAnalysisTsest {
    @Test
    void givenMessage_WhenSad_ShouldReturnSad() {
        MoodAnalysis moodAnalyser = new MoodAnalysis();
        String mood = moodAnalyser.analyseMood("I am in any Mood");
        Assertions.assertEquals("HAPPY", mood);
    }
}
