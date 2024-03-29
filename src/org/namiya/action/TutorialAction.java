package org.namiya.action;

import org.namiya.service.TutorialFinderService;

public class TutorialAction {
	
	private String bestTutorialSite;
	private String language="";
	
	public String execute() {
		TutorialFinderService tutorialFinderService = new TutorialFinderService();
		setBestTutorialSite(tutorialFinderService.getBesttutorialSite(getLanguage()));
		
		return "success";
		
	}
	
	public String getTutorial(){
		System.out.println("getTutorial() method called");
		return "success";
	}

	public String addTutorial(){
		System.out.println("addTutorial() method called");
		return "success";
	}
	
	public String getBestTutorialSite() {
		return bestTutorialSite;
	}

	public void setBestTutorialSite(String bestTutorialSite) {
		this.bestTutorialSite = bestTutorialSite;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

}
