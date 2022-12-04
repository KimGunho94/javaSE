package day08.mypac;

public class MyUtil {
	// 내부 클래스
	public class HelloPrinter{
		
		public String name = "MyUtil";
		public void printHello() {
			System.out.println("내부 클래스 HelloPrinter 입니다.");
			
			System.out.println("Hello~");
	

		}
	}
	
	// static 내부 클래스
	public static class Calculator{
		//메소드
		public void calc(int a, int b) {
			int result = a + b;
			System.out.println("의 내부 클래스 Calculator");
			System.out.println("전달받은 두 정수의 합: " + result);
		}
	}

}
