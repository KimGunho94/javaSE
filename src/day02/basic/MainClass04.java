package day02.basic;

/*
 * [[ 기본 자료형 ]]
 * 
 * 3. 정수형
 * 	- 선언하는 방법
 * 		byte 변수명;		-128~127
 * 		short 변수명;		-32,768 ~ 32,767
 * 		int 변수명;		-2,147,483,648 ~ 2,147,483,647
 * 		long 변수명;
 * 
 * 	- 같은 정수형이지만 표현범위가 다르다.
 * 	byte(1byte) < short(2byte) < int(4byte) < long(8byte)
 * 
 */

public class MainClass04 {
	public static void main(String[] args) {
		// 정수형 변수 선언과 동시에 값 대입하기
		byte iByte = 10;
		short iShort = 100;
		int iInt = 1000;
		long iLong = 10000;
		// 저장된 값을 문자열로 출력해보기
		System.out.println("byte 형:" + iByte);
		System.out.println("iShort 형:" + iShort);
		System.out.println("iInt 형:" + iInt);
		System.out.println("iLong 형:" + iLong);
	}
}









