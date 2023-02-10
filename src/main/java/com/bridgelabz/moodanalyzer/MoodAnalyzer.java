package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {
	
	public String analyzeMood(String mood) {
		
		if(mood.contains("sad") || mood.contains("not good"))
			return "Sad";
		return "Happy";
	}
}
