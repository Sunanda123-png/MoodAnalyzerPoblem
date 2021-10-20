package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoodAnalysisTest {
    @Test
    public void testMoodAnalyse() {
        MoodAnalysis md = new MoodAnalysis();
        String mood = md.analyseMood("This is a sad message");
        assertEquals("SAD", mood);
    }

    @Test
    public void testHappyMood() {
        MoodAnalysis md = new MoodAnalysis();
        String mood = md.analyseMood("This is a happy message");
        assertEquals("HAPPY", mood);
    }
}
