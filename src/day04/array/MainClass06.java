package day04.array;

import java.util.Iterator;

public class MainClass06 {
	public static void main(String[] args) {
		int[][] array = new int[7][7];
		
		for (int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				array[i][j] = i * 7 + j + 1;
			}
		}
		
		for (int i = 0; i < 14; i++) {
			if(i < 7) {
				for(int j = 0; j < i+1; j++) {
					if(i % 2 < 1) {
						System.out.print(array[i-j][j] + " ");
					} else {
						System.out.print(array[j][i-j] + " ");
					}
				}
			} else {
				for(int j =1; j < 14 - i; j++) {
					if(i % 2 < 1) {
						System.out.print(array[7-j][i-7+j] + " ");
					}else {
						System.out.print(array[j+i-7][7-j] + " ");
					}
				}
			}
			System.out.println();
		}
	}
}
