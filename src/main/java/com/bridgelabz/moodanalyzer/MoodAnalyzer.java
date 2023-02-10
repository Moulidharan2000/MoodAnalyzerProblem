package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {
	
	String message;
	
	public MoodAnalyzer() {
		
		message = null;
	}
	
	MoodAnalyzer(String message){
		
		this.message = message;
	}
	
	public String analyzeMood() throws NullPointerException{
		
		try {
			if(message.contains("Sad"))
				return "SAD";
		}catch(NullPointerException e){
			return "HAPPY";
		}
		return null;
	}
}
