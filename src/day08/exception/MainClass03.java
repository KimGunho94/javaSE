package day08.exception;

import java.util.Random;

/*
 *  finally - 정상 또는 예외가 발생해도 실행되는 블럭
 *  
 */

public class MainClass03 {
	public static void main(String[] args) {
		Random ran = new Random();
		
		try {
			System.out.println("DB를 연결합니다.");
			System.out.println(ran.nextInt()/0);
			System.out.println("DB 관련 작업을 합니다.");
		} catch (Exception e) {
			System.out.println("예회가 발생했습니다.");
		} finally { // 반드시 실행이 보장되는 블럭
			System.out.println("DB 연결을 해제합니다.");
		}
	}
}
