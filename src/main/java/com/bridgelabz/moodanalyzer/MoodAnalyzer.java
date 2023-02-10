package com.bridgelabz.moodanalyzer;

import java.util.Scanner;

public class MoodAnalyzer {
	
	String message;
	Scanner scan = new Scanner(System.in);
	
	public MoodAnalyzer() {
		
		message = "I am in Sad Mood";
	}
	
	MoodAnalyzer(String message){
		
		this.message = message;
	}
	
	public String analyzeMood() {
		
		if(message.contains("Sad"))
			return "SAD";
		
		return "HAPPY";
	}
}
