package com.kh.ssh;

import java.util.Random;
import java.util.Scanner;

public class Character {
	Scanner sc= new Scanner(System.in);
	Random random = new Random();
	
	String goblin_Kind;  //����
	String name;	     //�̸�	
	String nation;		 //����
	String gender;		 //����
	String personality;	 //����
	int height;		     //����	
	int weight;	    	 //ü��
	int level;		     //����
	int exp;		     //����ġ
	int choice;
	

	public Character(String goblin_Kind, String name, String nation, String gender, String personality, int height, int weight, int level, int choice, int exp){
		this.goblin_Kind = goblin_Kind;
		this.name = name;
		this.nation = nation;
		this.gender = gender;
		this.personality = personality;
		this.height = height;	 
		this.weight = weight;
		level =1;
		this.level = level;	
		exp=0;
		this.exp = exp;
		this.choice = choice;


	
		
	}
	
	public void  start() {
		System.out.println("===== ��� Ű��� =====");
		System.out.println("��ǥ : ����� 100�������� Ű���");
		System.out.println("���� : �ҿ��� �̷����");
	}
	
	public void Choose_Goblin() {
		System.out.print("��� Ű���(1~10������ ���� �Է��Ͻÿ�) :");
		int input = sc.nextInt();
		switch(input) {
			case 1  :
				System.out.println("���");
				goblin_Kind= "���";
				break;
			case 2  :
				System.out.println("Ű�� ���� ���");
				goblin_Kind= "ȩ���";
				break;
			case 3  :
				System.out.println("������ ���� ���");
				goblin_Kind= "������ ���� ���";
				break;
			case 4  :
				System.out.println("���� ������ ���");
				goblin_Kind= "���� ������ ���";
				break;
			case 5  :
				System.out.println("��� ��ó");
				goblin_Kind= "��� ��ó";
				break;
			case 6  :
				System.out.println("��� �˻�");
				goblin_Kind= "��� �˻�";
				break;
			case 7  :
				System.out.println("Ȳ�� ���");
				goblin_Kind= "Ȳ�� ���";
				break;
			case 8  :
				System.out.println("���� ���� ���");
				goblin_Kind= "���� ���� ���";
				break;
			case 9  :
				System.out.println("������ ���");
				goblin_Kind= "������ ���";
				break;
			case 10 :
				System.out.println("��� �ε�");
				goblin_Kind= "��� �ε�";
				break;
		}	
			System.out.print("�̸��� �Է��Ͻÿ� :");
			String input1 =sc.next();
			name = input1;
			System.out.print("�Ҽ� ������ �Է��Ͻÿ� :");
			String input2 =sc.next();
			nation = input2;
			System.out.print("������ �Է��Ͻÿ� :");
			String input3 =sc.next();
			gender = input3;
			System.out.print("������ �Է��Ͻÿ� :");
			int input4 =sc.nextInt();
			height = input4;
			System.out.print("ü���� �Է��Ͻÿ� :");
			int input5 =sc.nextInt();
			weight = input5;
			System.out.print("������ �Է��Ͻÿ� :");
			String input6 =sc.next();
			personality = input6;

}
	public void Menu() {
		EXIT :
		while(true) {
			
			System.out.println("1. ��� ���� ");
			System.out.println("2. ���� �ൿ");
			System.out.println("3. ����");
			System.out.print("�޴� �Է� :");
			int choice = sc.nextInt();
			switch(choice){
			case 1 : 
				info();
				break;
			case 2 : 
				int rand=random.nextInt(3)+1;
				switch(rand) {
				case 1 :
					this.hunt();
					if(level ==100) {
						break EXIT;
					}
					break;
				case 2 :
					this.eat();
					if(level ==100) {
						break EXIT;
					}
					break;
				case 3 :
					this.sleep();
					if(level ==100) {
						break EXIT;
					}
				case 4 :
					this.bad();
					break;
				}
					break;
			case 3 : 
				System.out.println("����Ǿ����ϴ�.");
				 break EXIT;
			default : 
				System.out.println("1~3������ ���ڸ� �Է��Ͻÿ�");
				break;
			}
		}
		
	}
	
	public void info() {
		System.out.println("������ :" +this.goblin_Kind);
		System.out.println("�̸� : " + this.name);
		System.out.println("�Ҽ� ���� : " + this.nation);
		System.out.println("���� : " + this.height);
		System.out.println("ü�� : " + this.weight);
		System.out.println("���� : " + this.personality);
		System.out.println("���� : "+ this.level + "("+ this.exp + "/100)");
	}
	
	public void getExp(int exp){
		System.out.println(exp + "�� ����ġ�� ȹ���Ͽ����ϴ�.");
			this.exp += exp;
			while(100 <= this.exp){
				this.levelUp();
				this.exp -= 100;
			}	
		
			
	}
	
	
	
	public void levelUp(){
		this.level++;
		System.out.println("LEVEL UP!!");
		if(level ==100) {
			this.finish();
			
		}
	}
	public void hunt() {
		System.out.println("�ΰ� ��ɿ� �����ߴ�");
		int exp=random.nextInt(100)+1;
		this.getExp(exp);
	}
	public void sleep() {
		System.out.println("���� �ڼ� ����������.");
		int exp=(random.nextInt(50)+1);	
		this.getExp(exp);
	}
	public void eat() {
		System.out.println("�谡 �ҷ��� ����������.");
		int exp=(random.nextInt(10)+1);	
		this.getExp(exp);
	}
	
	public void bad() {
		System.out.println("����� �ϴ� ��ó�� �Ծ���");
		int exp=-(random.nextInt(100)+1);	
		this.getExp(exp);
		
	}
	
	public void finish() {
		System.out.println("�����ߴ�");
		System.out.println("�ҿ��� ���ض�");
		String wish=sc.next();
		System.out.println("�ҿ��� �̷�� ����");
		
		
		
	}
		
		
}
