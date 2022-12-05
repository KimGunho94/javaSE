package day09.lang;
/*
 * [[ java.lang 패키지 ]]
 * 	기본 제공해주는 패키지
 * 	import도 필요없음
 * 	
 * [[ Object 클래스 ]]
 * 	모든 클래스의 최상위 부모이다.
 * 	즉 모든 클래스는 Object 클래스를 상속 받는다.
 * 	extends 생략!
 * 
 * 		equals() 메소드 		: 두 객체가 동인한 객체 true
 * 					    	: 다르면 false
 * 		hashCode() 메소드 	: 객체의 메모리 번지를 이용, 해시코드를 만들어 리턴
 * 		toString() 메소드 	: 객체의 문자 
 * 		clone() 			: 새로운 객체로 복사(깊은 복사)
 * 
 */

public class MainClass01 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Car car1 = new Car();
		Car car2 = new Car();
	//	Car car2 = car1;
		System.out.println(System.identityHashCode(car1));
		System.out.println(System.identityHashCode(car2));
		
		if(car1.equals(car2)) {
			System.out.println("car1 과 car2는 같습니다.");
		}else {
			System.out.println("car1 과 car2는 다릅니다.");
		}
		System.out.println(car1.hashCode());
		System.out.println(car2.hashCode());
		
		System.out.println(car1.toString());
		System.out.println(car2.toString());
		
		String str = "hello"; 
		// String toString() 오버라이딩 문자열 값이 나오게 재정의 했다.
		System.out.println(str.toString());
		System.out.println(str);
		
		// clone 메소드로 객체 깊은복사
		Car car3 = (Car) car1.clone();
		// 주소값 보사 얕은복사
		Car car4 = car1;
		System.out.println(car1);
		System.out.println(car3);
		System.out.println(car4);
		
		
		
		
	}	
}

class Car implements Cloneable{
	String model;
	String color;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}