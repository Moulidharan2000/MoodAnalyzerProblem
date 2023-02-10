package com.bridgelabz.moodanalyzertest;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.moodanalyzer.MoodAnalyzer;


public class MoodAnalyzerTest {
	
	@Test
	public void analyzeMoodTest() {
		
		MoodAnalyzer analyze = new MoodAnalyzer();
		Assert.assertEquals("Sad", analyze.analyzeMood("I am in Sad Mood"));
	}
}
