package com.kh.ssh;

public class CharacterRun {
	static String goblin_Kind;   //����
	static String name;	     //�̸�	
	static String nation;		 //����
	static String gender;		 //����
	static String personality;	 //����
	static int height;		     //����	
	static int weight;	    	 //ü��
	static int level;		     //����
	static int exp;		     //����ġ
	static int choice;

	
	public static void main(String []args) {
		Character character = new Character(goblin_Kind, name, nation, gender, personality, height, weight, level, choice, exp);
		character.start();
		character.Choose_Goblin();
		character.Menu();
		
	}

	
}
