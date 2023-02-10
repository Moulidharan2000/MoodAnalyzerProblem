package com.bridgelabz.moodanalyzertest;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.moodanalyzer.MoodAnalysisException;
import com.bridgelabz.moodanalyzer.MoodAnalyzer;



public class MoodAnalyzerTest {
	
	@Test
	public void analyzeMoodTest() throws MoodAnalysisException{
		
		MoodAnalyzer analyze = new MoodAnalyzer();
		Assert.assertEquals("Invalid Mood", analyze.analyzeMood(null));
	}
}
