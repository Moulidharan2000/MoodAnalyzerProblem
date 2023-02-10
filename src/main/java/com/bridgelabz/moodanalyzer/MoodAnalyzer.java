package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {
	
	public String analyzeMood(String mood)throws MoodAnalysisException{
		
		try {
			if(mood == null || mood.isEmpty())
				throw new MoodAnalysisException("Mood Cannot be null or empty", MoodAnalysisError.EMPTY_MOOD);
			else if(mood.contains("Happy"))
				return "HAPPY!!!";
		}catch(MoodAnalysisException e) {
			return "Invalid Mood";
		}
		return "SAD";
	}
	
	public static void main(String[] args) throws MoodAnalysisException{
		
			MoodAnalyzer analyze = new MoodAnalyzer();
			analyze.analyzeMood(null);
	}
}
