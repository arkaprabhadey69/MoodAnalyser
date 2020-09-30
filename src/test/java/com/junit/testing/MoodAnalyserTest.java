package com.junit.testing;

//import static org.junit.Assert.*;
import org.hamcrest.CoreMatchers;
import  org.junit.Assert;
import  org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyserTest {
    MoodAnalyser m=new MoodAnalyser();
    @Test
    public void if_sad_message_return_sad() throws Exception
    {
        try {
            String mood = m.analyseMood("'Tis a sad message");

            Assert.assertThat(mood, CoreMatchers.is("SAD"));
        }
        catch (MoodAnalyserException e)
        {

        }
    }
    @Test
    public void if_happy_message_return_happy() throws MoodAnalyserException {
        String mood= m.analyseMood("'Tis a happy message");
        Assert.assertThat(mood, CoreMatchers.is("HAPPY"));
    }
    @Test
    public void given_null_message_return_happy() throws MoodAnalyserException
    {
        String mood;
        try {
            //ExpectedException e= ExpectedException.none();
            //e.expect(MoodAnalyserException.class);
            String valid="";
             mood = m.analyseMood(valid);
            Assert.assertThat(mood, CoreMatchers.is("HAPPY"));
        }
        catch (MoodAnalyserException e)
        {
            System.out.println(e.e);
         Assert.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_EMPTY,e.e);
           Assert.assertEquals("Enter non-empty Mood",e.getMessage());
        }
    }
    @Test
    public void given_empty_message_return_happy() throws MoodAnalyserException
    {
        String mood;
        try {
            mood = m.analyseMood(null);
            Assert.assertThat(mood, CoreMatchers.is("HAPPY"));
        }
        catch (MoodAnalyserException e)
        {
            System.out.println(e.e);
            Assert.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_NULL,e.e);
            Assert.assertEquals("Enter proper Mood",e.getMessage());
        }
    }


}