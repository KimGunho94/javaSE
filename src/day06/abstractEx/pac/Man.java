package day06.abstractEx.pac;

public class Man extends Human{

	
	@Override
	public void say() {
		System.out.println("굵은 목소리로 말해요!");		
	}

	@Override
	public void useFire() {
		System.out.println("장작 펴요!");
	}

}
