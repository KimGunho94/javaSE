package day08.innerclass;

import day08.mypac.Weapon;

/*
 * [[ 익명클래스(AnonyMous Class) ]]
 * 	클래스 선언과 객체생성을 동시에 하는 이름없는 클래스
 * 	일회용 클래스
 * 
 * 
 */
public class MainClass03 {
	public static void main(String[] args) {
		
		Weapon w = new Weapon() { // 익명클래스
			
			int damage = 10;
			@Override
			public void attack() {
				System.out.println(damage+ "데미지로 공격!!");
				
			}
		
		};
		
		w.attack();
	
	}
}
