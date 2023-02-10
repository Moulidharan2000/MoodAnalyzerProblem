package com.bridgelabz.moodanalyzer;

import java.util.Scanner;

public class MoodAnalyzer {
	
	public void analyzeMood(String mood)throws MoodAnalysisException{
		
		if(mood == null || mood.isEmpty())
			throw new MoodAnalysisException("Mood Cannot be null or empty", MoodAnalysisError.EMPTY_MOOD);
		else if(mood.contains("Happy"))
			System.out.println("HAPPY!!!");
		else
			System.out.println("SAD");
	}
	
	public static void main(String[] args) throws MoodAnalysisException{
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Message : ");
		try{
			MoodAnalyzer analyze = new MoodAnalyzer();
			analyze.analyzeMood(scan.next());
		}catch(MoodAnalysisException e) {
			System.out.println("Invalid Mood");
		}
	}
}
