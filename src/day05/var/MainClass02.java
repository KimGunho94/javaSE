package day05.var;

import day05.mypac.Card;

public class MainClass02 {
	// 기본형/전역변수/static
	public static int num = 10;
	// 기본형/전역변수/동적
	public int num2 = 20;
	
	public static void main(String[] args) {
		// 기본형/지역변수/동적 반드시 초기화!
		int num3 = 30;
		
		System.out.println(num);
		
		MainClass02 mc2 = new MainClass02();
		System.out.println(mc2.num2);
		
		System.out.println(num3);
		
		// static : 객체명.정적변수명 생성없이 사용가능 
		System.out.println(Card.width);
		
	}
}



