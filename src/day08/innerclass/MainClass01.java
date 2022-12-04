package day08.innerclass;
/*
 * [[ 내부클래스(InnerClass) ]]
 * 	
 * 	클래스 안에 또 다른 클래스 정의
 * 
 */
public class MainClass01 {
	public static void main(String[] args) {
		new MainClass01.InnerClass().doSomething();
		new InnerClass().doSomething();
	
	}	// Main 메소드 End
	
	static class InnerClass {
		private void doSomething() {
			System.out.println("무언가를 해요!");
			}
		}
	} // MainClass01 End

	



