package day10.util;

import java.util.ArrayList;
import java.util.List;

/*
 * [[ ArrayList Class ]]
 * 	- 가변 배열이다.
 * 	- 인덱스 값이 있다.
 * 
 */
public class MainClass02 {
	public static void main(String[] args) {
		// ArrayList 객체 생성하기
		ArrayList<String> list = new ArrayList<>();
		
		// 데이터 저장하기
		list.add("피카츄"); // 0 (index)
		list.add("라이츄"); // 1
		list.add("파이리"); // 2
		
		// 저장된 데이터의 특정 인덱스 값 얻어오기
		String str = list.get(0);
		System.out.println("list 0 인덱스 값: " + str);
		
		// 저장된 데이터에서 특정 인덱스 내용 삭제하기
		list.remove(2);
		
		System.out.println("저장된 데이터의 개수: " + list.size());
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println("list["+i+"]:" + list.get(i));
		}
		for(String name : list) {
			System.out.println("name : " + name);
		}
		List<String> list2 = new ArrayList<>();
		List<String> list3 = (List<String>)list.clone();
		
		System.out.println(System.identityHashCode(list));
		System.out.println(System.identityHashCode(list3));
		
		// list 객체 깊은 복사한 list3
		for(String name : list3) {
			System.out.println("list3 name : " + name);
		}	
	}
}
