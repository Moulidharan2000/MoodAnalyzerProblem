package com.bridgelabz.moodanalyzer;

import java.util.Scanner;

public class MoodAnalyzer {
	
	public String analyzeMood(String mood) {
		
		if(mood.contains("sad") || mood.contains("not"))
			return "Sad";
		return "Happy";
	}

	public static void main(String[] args) {
		
		MoodAnalyzer analyse = new MoodAnalyzer();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Any Message : ");
		String mood = scan.nextLine();
		System.out.println(analyse.analyzeMood(mood));
	}
}
