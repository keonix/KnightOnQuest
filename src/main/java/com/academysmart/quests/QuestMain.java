package com.academysmart.quests;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
public class QuestMain 
{
    public static void main( String[] args ){
    @SuppressWarnings("resource")
	ApplicationContext context = new FileSystemXmlApplicationContext("KnightOnQuest.xml");
    Knight knight = (Knight)context.getBean("knight");
    knight.embarkOnQuest();
}
}