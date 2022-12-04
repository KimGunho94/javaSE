package day07.interfaceEx;

import day07.mypac.AkWeapon;

/*
 * [[ 인터페이스 (interface) ]]
 * 	추상메소드만 있다.
 * 	변수선언을 해도 변수가아닌 상수가 된다.
 * 
 *  뼈대를 만들어준다.
 *  
 *  !인터페이스 변수는 final이 생략된 상수이다.
 * 
 */

public class MainClass01 {
	public static void main(String[] args) {

		AkWeapon ak = new AkWeapon();
		ak.attack();
		System.out.println(ak.NAME); 
		
	}

}







