package com.junit.testing;

//import static org.junit.Assert.*;
import org.hamcrest.CoreMatchers;
import  org.junit.Assert;
import  org.junit.Test;

public class MoodAnalyserTest {
    MoodAnalyser m=new MoodAnalyser();
    @Test
    public void if_sad_message_return_sad() throws Exception
    {
        String mood= m.analyseMood("'Tis a sad message");
        Assert.assertThat(mood, CoreMatchers.is("SAD"));
    }
    @Test
    public void if_happy_message_return_happy() throws Exception
    {
        String mood= m.analyseMood("'Tis a happy message");
        Assert.assertThat(mood, CoreMatchers.is("HAPPY"));
    }
    @Test
    public void if_not_sad_message_return_happy() throws Exception
    {
        String mood= m.analyseMood("'Tis a message");
        Assert.assertThat(mood, CoreMatchers.is("HAPPY"));
    }


}