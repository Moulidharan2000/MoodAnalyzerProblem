package com.bridgelabz.moodanalyzertest;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.moodanalyzer.MoodAnalyzer;



public class MoodAnalyzerTest {
	
	@Test
	public void analyzeMoodTest() {
		
		MoodAnalyzer analyze = new MoodAnalyzer();
		Assert.assertEquals("SAD", analyze.analyzeMood());
	}
}