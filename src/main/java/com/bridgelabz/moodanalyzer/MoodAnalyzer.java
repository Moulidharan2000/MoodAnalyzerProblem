package com.bridgelabz.moodanalyzer;

import java.util.Scanner;

public class MoodAnalyzer {
	
	String message;
	Scanner scan = new Scanner(System.in);
	
	MoodAnalyzer() {
		
		message = scan.nextLine();
	}
	
	MoodAnalyzer(String message){
		
		this.message = message;
	}
	
	public void analyzeMood() {
		
		if(message.contains("sad"))
			System.out.println("SAD");
		else
			System.out.println("Happy");
	}
	
	public static void main(String[] args) {
		
		System.out.print("Enter the Message : ");
		MoodAnalyzer analyze = new MoodAnalyzer();
		analyze.analyzeMood();
	}
}
