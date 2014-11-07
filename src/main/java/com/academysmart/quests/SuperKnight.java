package com.academysmart.quests;

public class SuperKnight implements Knight {

	private Quest quest;

	public SuperKnight(Quest quest) {
		
		this.quest = quest;
	}

	public void embarkOnQuest() {
		quest.embark();
	}

}
