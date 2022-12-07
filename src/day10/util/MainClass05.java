package day10.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 * [[ HashMap Class ]]
 * 
 * 	- Map 인터페이스를 구현한 클래스이다.
 * 	- key 값, Value 값을 쌍으로 저장한다. (사전 형태)
 * 	- key 값은 중복이 불가능하다. 
 * 
 */
public class MainClass05 {
	public static void main(String[] args) {
		// HashMap 객체 생성
		HashMap<String, String> map1 = new HashMap<>();
		
		// 데이터 저장하기
		map1.put("HELLO", "안녕하세요");
		map1.put("CAR", "자동차");
		map1.put("TIGER", "호랑이");
		
		// 데이터 얻어오기
		String value = map1.get("HELLO"); // 키값으로 값 가져오기
		
		System.out.println("value: " + value);
		
		// Map에 있는 키값을 불러오기 (Set으로 반환)
		Set<String> set = map1.keySet();
		
		// set -> 반복자 객체
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String keyValue = it.next(); // 키값을 하나씩 읽어온다.
			
			// 해당 키값에 할당되어있는 value값을 읽어온다.
			String value2 = map1.get(keyValue);
			
			// value 값 출력해보기
			System.out.println(value2);	
		}
		
		
		
	}

}
