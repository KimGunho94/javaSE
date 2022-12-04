package day07.mypac;

/*
 * 인터페이스 상속 받는 방법
 * 
 * 
 * implements 예약어로 선언한다.
 */
public class AkWeapon implements Weapon, Scope{

	@Override
	public void attack() {
		System.out.println("지상공격을 해요!");
	}

	@Override
	public void attackSky() {
		System.out.println("하늘공격을 해요!");		
	}

	@Override
	public void doSnip() {
		System.out.println("저격을 해요!");
		
	}

}




