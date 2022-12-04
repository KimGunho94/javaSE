package day06.abstractEx;

import day06.abstractEx.pac.Human;
import day06.abstractEx.pac.Man;
import day06.abstractEx.pac.Woman;

/*
 * [[ 추상클래스 (Abstract Class) ]]
 * 
 * 	구현되지 않은 추상 메소드가 존재한다.
 * 	정의만 하고 구현 X
 * 	미완성 클래스
 * 	미완성 메소드를 가지고 있다.
 * 	상속을 받고 반드시 오버라이딩 해야한다.	
 * 
 */

public class MainClass01 {
	public static void main(String[] args) {
		// 추상메소드 오버라이딩 반드시 해야한다.
		// Human h1 = new Human();
		
		Woman w1 = new Woman();
		
		w1.say();
		w1.useFire();
		
		Man m1 = new Man();
		m1.say();
		m1.useFire();
		
		
	}
	

}











