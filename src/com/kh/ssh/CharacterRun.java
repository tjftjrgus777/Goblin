package com.kh.ssh;

public class CharacterRun {
	static String goblin_Kind;   //종족
	static String name;	     //이름	
	static String nation;		 //국가
	static String gender;		 //성별
	static String personality;	 //성격
	static int height;		     //신장	
	static int weight;	    	 //체중
	static int level;		     //레벨
	static int exp;		     //경험치
	static int choice;

	
	public static void main(String []args) {
		Character character = new Character(goblin_Kind, name, nation, gender, personality, height, weight, level, choice, exp);
		character.start();
		character.Choose_Goblin();
		character.Menu();
		
	}

	
}
