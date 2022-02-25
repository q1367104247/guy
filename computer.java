package com.caiquan.pojo;

import java.util.Random;

public class Computer {
	
	String name="Z";
	int score=0;
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	//出拳
	
	public int chuQuan(){
		Random r = new Random();
		int choice = r.nextInt(3)+1;
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
