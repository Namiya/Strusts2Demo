package org.namiya.service;

public class TutorialFinderService {
	
	public String getBesttutorialSite(String language) {
		
		if (language.equals("java"))
		{
			return "Namiya";
		}
		else {
			return "Unsupported!";
		}
			
	}

}
