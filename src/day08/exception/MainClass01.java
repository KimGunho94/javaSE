package day08.exception;
/*
 * [[ 예외(Exception) ]]
 * 	- 프로그램 실행도중 발생되는 에러에 해당된다.
 * 	- 예회처리 :  예외가 발생되었을 때 이를 처리하는 것
 * 
 * 	처리하는 방법 : 
 * 
 * 	try {
 * 		실행코드
 *   }catch(익셉션클래스명 변수명){
 *  	해당 예외가 발생했을 경우 실행할 코드
 *   } finally {
 *   	정상 또는 예외가 발생해도 실행되는 블럭
 *   }
 * 
 */
public class MainClass01 {
	public static void main(String[] args) {
		// 정수값을 저장할 지역변수 초기화
		int num1 = 10;
		int num2 = 0;
		int result = 0;
		
//		result = num1/num2;
//		if(num2 != 0) {
//			result = num1/num2;
//			System.out.println("실행결과 : " + result);
//		} else {
//			System.out.println("result : " + result);
//		}
		
		try {
			result = num1/num2; // 예외 발생시 아래코드 실행X -> catch 실행
			System.out.println("실행결과 : " + result);
			} catch(Exception e) {
				System.out.println("어떤한 수를 0으로 나눌 수 없습니다.");
			}
	
	
	}

}
