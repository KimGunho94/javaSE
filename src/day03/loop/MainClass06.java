package day03.loop;

/*
 * break 문
 * 	반복문 종료.
 * 
 */

public class MainClass06 {
	public static void main(String[] args) {
		for(int i=0; i < 5; i++) {
			if(i == 3) {
				break;
			}
			System.out.println("i : " +i);
		}
		
	}

}
