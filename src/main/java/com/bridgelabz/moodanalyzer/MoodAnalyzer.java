package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {
	
	String message;
	
	public MoodAnalyzer() {
		
		message = null;
	}
	
	MoodAnalyzer(String message){
		
		this.message = message;
	}
	
	public String analyzeMood() {
		
		if(message.contains("Sad"))
			return "SAD";
		
		return "HAPPY";
	}
	
	public static void main(String[] args) throws NullPointerException{
		
		try {
			MoodAnalyzer analyze = new MoodAnalyzer();
			analyze.analyzeMood();
		}catch(NullPointerException e) {
			System.out.println("Invalid Message");
		}
	}
}
