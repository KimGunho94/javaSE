package day06.accessmodifier;

import day06.mypac.MemberVO;

public class MainClass02 {
	
	public static void main(String[] args) {
		/*
		 * 아이디 : pika
		 * 비밀번호 : pika1234
		 * 이름 : 피카츄
		 * 전화번호 : 010-1234-5678
		 * 주소 : 서울시 서대문구 신촌동
		 * 생년월일 : 96.02.27
		 */
		MemberVO memberVO = new MemberVO();
		memberVO.setId("pika");
		memberVO.setPassword("pika1234");
		memberVO.setName("피카츄");
		memberVO.setPhoneNumber("010-1234-5678");
		memberVO.setAddress("서울시 서대문구 신촌동");
		
		String id = memberVO.getId();
		String password = memberVO.getPassword();
		String name = memberVO.getName();
		String phoneNumber = memberVO.getPhoneNumber();
		String address = memberVO.getAddress();
		
		System.out.println(id);
		System.out.println("****");
		System.out.println(name);
		System.out.println(phoneNumber);
		System.out.println(address);
		
	}

	
	
	
	
}
