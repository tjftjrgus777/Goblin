package com.kh.ssh;

import java.util.Random;
import java.util.Scanner;

public class Character {
	Scanner sc= new Scanner(System.in);
	Random random = new Random();
	
	String goblin_Kind;  //종족
	String name;	     //이름	
	String nation;		 //국가
	String gender;		 //성별
	String personality;	 //성격
	int height;		     //신장	
	int weight;	    	 //체중
	int level;		     //레벨
	int exp;		     //경험치
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
		System.out.println("===== 고블린 키우기 =====");
		System.out.println("목표 : 고블린을 100레벨까지 키우기");
		System.out.println("보상 : 소원이 이루어짐");
	}
	
	public void Choose_Goblin() {
		System.out.print("고블린 키우기(1~10사이의 수를 입력하시오) :");
		int input = sc.nextInt();
		switch(input) {
			case 1  :
				System.out.println("고블린");
				goblin_Kind= "고블린";
				break;
			case 2  :
				System.out.println("키가 작은 고블린");
				goblin_Kind= "홉고블린";
				break;
			case 3  :
				System.out.println("지능이 낮은 고블린");
				goblin_Kind= "지능이 낮은 고블린";
				break;
			case 4  :
				System.out.println("운이 안좋은 고블린");
				goblin_Kind= "운이 안좋은 고블린";
				break;
			case 5  :
				System.out.println("고블린 아처");
				goblin_Kind= "고블린 아처";
				break;
			case 6  :
				System.out.println("고블린 검사");
				goblin_Kind= "고블린 검사";
				break;
			case 7  :
				System.out.println("황금 고블린");
				goblin_Kind= "황금 고블린";
				break;
			case 8  :
				System.out.println("힘이 강한 고블린");
				goblin_Kind= "힘이 강한 고블린";
				break;
			case 9  :
				System.out.println("영유아 고블린");
				goblin_Kind= "영유아 고블린";
				break;
			case 10 :
				System.out.println("고블린 로드");
				goblin_Kind= "고블린 로드";
				break;
		}	
			System.out.print("이름을 입력하시오 :");
			String input1 =sc.next();
			name = input1;
			System.out.print("소속 국가를 입력하시오 :");
			String input2 =sc.next();
			nation = input2;
			System.out.print("성별을 입력하시오 :");
			String input3 =sc.next();
			gender = input3;
			System.out.print("신장을 입력하시오 :");
			int input4 =sc.nextInt();
			height = input4;
			System.out.print("체중을 입력하시오 :");
			int input5 =sc.nextInt();
			weight = input5;
			System.out.print("성격을 입력하시오 :");
			String input6 =sc.next();
			personality = input6;

}
	public void Menu() {
		EXIT :
		while(true) {
			
			System.out.println("1. 고블린 정보 ");
			System.out.println("2. 랜덤 행동");
			System.out.println("3. 종료");
			System.out.print("메뉴 입력 :");
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
				System.out.println("종료되었습니다.");
				 break EXIT;
			default : 
				System.out.println("1~3사이의 숫자를 입력하시오");
				break;
			}
		}
		
	}
	
	public void info() {
		System.out.println("종족명 :" +this.goblin_Kind);
		System.out.println("이름 : " + this.name);
		System.out.println("소속 국가 : " + this.nation);
		System.out.println("신장 : " + this.height);
		System.out.println("체중 : " + this.weight);
		System.out.println("성격 : " + this.personality);
		System.out.println("레벨 : "+ this.level + "("+ this.exp + "/100)");
	}
	
	public void getExp(int exp){
		System.out.println(exp + "의 경험치를 획득하였습니다.");
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
		System.out.println("인간 사냥에 성공했다");
		int exp=random.nextInt(100)+1;
		this.getExp(exp);
	}
	public void sleep() {
		System.out.println("잠을 자서 게을러졌다.");
		int exp=(random.nextInt(50)+1);	
		this.getExp(exp);
	}
	public void eat() {
		System.out.println("배가 불러서 게을러졌다.");
		int exp=(random.nextInt(10)+1);	
		this.getExp(exp);
	}
	
	public void bad() {
		System.out.println("사냥을 하다 상처를 입었다");
		int exp=-(random.nextInt(100)+1);	
		this.getExp(exp);
		
	}
	
	public void finish() {
		System.out.println("수고했다");
		System.out.println("소원을 말해라");
		String wish=sc.next();
		System.out.println("소원은 이루어 졌다");
		
		
		
	}
		
		
}
