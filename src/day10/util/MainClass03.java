package day10.util;

import java.util.Vector;

/*
 * [[ Vector Class ]]
 *  - ArrayList 와 동일하다.
 *  - Thread safe (스레드 동기화 지원)
 *  - ArrayList 보다 무겁다.
 * 
 * 
 */
public class MainClass03 {
	public static void main(String[] args) {
		Vector<String> vec = new Vector<>();
		
		vec.add("피카츄");
		vec.add("라이츄");
		vec.add("파이리");
		
		String str = vec.get(0);
		System.out.println("vec 0인덱스 값: " + str);
		
		// Vector 전체 값 출력
		for (String name : vec) {
			System.out.println("name : " + name);
		}
		
		
	}

}
