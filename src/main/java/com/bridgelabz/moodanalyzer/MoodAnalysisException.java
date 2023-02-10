package com.bridgelabz.moodanalyzer;

public class MoodAnalysisException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	MoodAnalysisError error;
	
	public MoodAnalysisException(String message, MoodAnalysisError error) {
		super(message);
		this.error = error;
	}
	
	public MoodAnalysisError getError() {
		return error;
	}
}
