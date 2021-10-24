package com.bridgelabz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class MoodAnalysisTsest {
    @Test
    public void givenEmptyMoodShouldThrowException(){
        MoodAnalysis moodAnalyser = new MoodAnalysis();
        try{
                moodAnalyser.analyseMood(null);
        }catch (MoodAnalysisException e){
            Assertions.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL,e.type);
        }
    }
}
