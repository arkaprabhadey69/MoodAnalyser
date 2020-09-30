package com.junit.testing;

public class MoodAnalyserException extends  Exception{

enum ExceptionType
{
    ENTERED_NULL,ENTERED_EMPTY;
}
ExceptionType e;
    public MoodAnalyserException(ExceptionType e,String message) {
        super(message);
        this.e=e;
    }
}
