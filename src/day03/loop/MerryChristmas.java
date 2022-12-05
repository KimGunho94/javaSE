package day03.loop;

public class MerryChristmas {
	public static void main(String[] args) {
		int num = 0;
		for (int i = 0; i < 1; i++) {
			System.out.print(num + ":");
			for (int j = 0; j < 7; j++)
			if (i < 0) {
				if (j + i < 3)
				System.out.print(" ");
			}else if ( j - i > 3) {
				System.out.print(" ");
			}else {
				System.out.print("★");
				
				
			}
		}
	}

}
