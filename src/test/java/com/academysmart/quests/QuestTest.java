package com.academysmart.quests;



import static org.mockito.Mockito.*;

import org.	junit.Test;

public class QuestTest {
	
	@Test
	public void superKnightShouldEmbarkQuest() throws Exception{
	
		
		Quest mockQuest =  mock(Quest.class);
		
		SuperKnight knight = new SuperKnight(mockQuest);
		knight.embarkOnQuest();
		verify(mockQuest, times(1)).embark();		
		
	}
}
   
