package org.namiya.action;

import org.namiya.service.TutorialFinderService;

public class TutorialAction {
	
	private String bestTutorialSite;
	
	public String execute() {
		TutorialFinderService tutorialFinderService = new TutorialFinderService();
		setBestTutorialSite(tutorialFinderService.getBesttutorialSite());
		
		return "success";
		
	}

	public String getBestTutorialSite() {
		return bestTutorialSite;
	}

	public void setBestTutorialSite(String bestTutorialSite) {
		this.bestTutorialSite = bestTutorialSite;
	}

}
