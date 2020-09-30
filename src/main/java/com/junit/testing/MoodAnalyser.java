package com.junit.testing;

public class MoodAnalyser {

    public void Display() {
        System.out.println("Welcome to Mood Analyser");
    }

    public String analyseMood(String message) throws MoodAnalyserException {
        try {

            if(message.length()==0)
                throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_EMPTY,"Enter non-empty Mood") ;
            if (message.contains(("sad"))) {
                return "SAD";
            } else
                return "HAPPY";
        } catch (NullPointerException e) {
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_NULL,"Enter proper Mood");
        } catch (IllegalArgumentException e) {
            return "Illegal Exception";
        }
        finally {
            System.out.println("In Finally Block");
            //return  "HAPPY";
        }
    }

    public static void main(String[] args) throws MoodAnalyserException {
       try {
           MoodAnalyser m = new MoodAnalyser();
           System.out.println(m.analyseMood(null));
       }
       catch (MoodAnalyserException e)
       {
           System.out.println(e.getMessage());
       }
    }
}