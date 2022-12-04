package day07.polymorphism;

import day07.mypac.AkWeapon;
import day07.mypac.M4A1Weapon;
import day07.mypac.Scope;
import day07.mypac.Weapon;

/*
 * [[ 다형성 (polymorphism) ]]
 * 	하나의 객체가 여러가지 타입을 가질 수 있는 것을 의미.
 * 
 * instanceof 연산자 
 * 	객체가 어떤클래스를 상속받고 있는지 확인용으로 사용.
 * 
 */


public class MainClass01 {
	public static void main(String[] args) {
		// 일반 객체 선언 및 생성
		AkWeapon ak = new AkWeapon();
		ak.attack();
		ak.doSnip();
		
		// 다형성을 이용한 
		// 부모타입선언 자식객체 생성
		
		/*
		  Weapon w1 = new AkWeapon();
	  	  		-> Stack Area 저장
          		-> Weapon 클래스 코드 알고있다.
	  			-> Heap 영역의 생성된 
             	new AkWeapon() 참조하고 있다
	                 -> 주소값을 가지고있다.
				결론 : Weapon 의 정의된 멤버만 사용가능
	       		Weapon을 상속받은 객체는 모두 참조할수 있다.
		 */
		Weapon w1 = new AkWeapon();
		w1.attack();
//		w1.doSnip();
		
		AkWeapon ak2 = (AkWeapon) w1;	// 주소값 복사 -> 얕은 복사
		Scope s1 = ak2;
				
		System.out.println(System.identityHashCode(w1));
		System.out.println(System.identityHashCode(ak2));
		System.out.println(System.identityHashCode(s1));
		
		classifyWeapon(ak2);
		
		M4A1Weapon m4 = new M4A1Weapon();
		
		classifyWeapon(m4);
		
	}
	
	public static void classifyWeapon(Object obj) {
		if(obj instanceof Scope) {
			System.out.println("저격소총 입니다.");
		}else {
			System.out.println("일반소총 입니다.");
		}
		
	}

}









