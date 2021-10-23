package com.bridgelabz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class MoodAnalysisTsest {
    @Test
    void givenMessage_WhenSad_ShouldReturnSad() {
        MoodAnalysis moodAnalyser = new MoodAnalysis();
        String mood = moodAnalyser.analyseMood("NULL");
        Assertions.assertEquals("HAPPY", mood);
    }
}
