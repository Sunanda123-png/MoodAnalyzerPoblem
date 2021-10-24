package com.bridgelabz;

public class MoodAnalysisException extends Exception{
    enum ExceptionType{
        ENTERED_EMPTY,ENTERED_NULL
    }
    ExceptionType type;
    public MoodAnalysisException(ExceptionType type,String messgae){
        super(messgae);
        this.type=type;
    }
}
