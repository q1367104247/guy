package com.caiquan.pojo;

import java.util.Scanner;

public class Person {
	
	String name="A";
	int score=0;
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	//出拳
	public int chuQuan(){
		System.out.println("请出拳，1：剪刀，2：石头 3：布");
		Scanner in =new Scanner(System.in);
		int choice = in.nextInt();
		if(choice==1) {
			System.out.println("剪刀");
		}else if(choice==2){
			System.out.println("石头");
		}else if(choice==3){
			System.out.println("布");
		}else{
			System.out.println("错误");
			choice=0;
		}
		return choice;
	}
	
	

}
