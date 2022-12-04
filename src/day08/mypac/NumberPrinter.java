package day08.mypac;

public class NumberPrinter {
	public static void printNumber() throws InterruptedException {
		for(int i=0; i<10; i++) {
			System.out.println(i);
			Thread.sleep(1000); // 1000 -> 1초 밀리세컨즈
		}
		
	}
	

}
