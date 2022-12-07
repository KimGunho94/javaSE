package day10.util;

import java.util.Calendar;

/*
 * 	[[ Calendar Class ]]
 * 
 * 	- 날짜 관련 객체
 * 
 */
public class MainClass07 {
	public static void main(String[] args) {
		// Calendar 객체 참조값 얻어오기 
		// getInstanec 메소드를 통해서만 객체 생성
		Calendar calNow = Calendar.getInstance(); 
		
		int year = calNow.get(Calendar.YEAR); // 년도
		System.out.println("올 해 : " + year);
		
		int month = calNow.get(Calendar.MONTH)+1; // 월
		System.out.println("월 : " + month);
		
		int day = calNow.get(Calendar.DAY_OF_MONTH); // 일
		System.out.println("일 : " + day);
		
		int hour = calNow.get(Calendar.HOUR); // 시
		int min = calNow.get(Calendar.MINUTE); // 분
		int sec = calNow.get(Calendar.SECOND); // 초
		
		System.out.println(hour+":"+min+":"+sec);
		
		
		
	}

}
