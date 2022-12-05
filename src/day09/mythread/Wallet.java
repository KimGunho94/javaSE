package day09.mythread;

public class Wallet {
	public int totalMoney;
	
	public Wallet() {
		this.totalMoney = 10000;
	}
	// Thread safe 메소드 
	public synchronized int getMoney() {
		
		if(totalMoney == 0) 
			return 0;
		
		totalMoney = totalMoney - 1;
		System.out.println("현제 지갑의 금액: "+ totalMoney);
		return 1;
	}
	
}
