package day04.array;
/*
다음주까지 숙제!!

 1  2  3  4  5  6  7
 8  9  10 11 12 13 14
 15 16 17 18 19 20 21
 22 23 24 25 26 27 28
 29 30 31 32 33 34 35
 36 37 38 39 40 41 42
 43 44 45 46 47 48 49
 
 1. 2중배열선언하고 
 2. for 문으로 값을 1~49까지 위모양으로 넣으세요
 3. 출력은 지그재그 
출력순서는 
1    
2 8 
15 9 3 
4 10 16 22 
29 23 17 11 5 
6 12 18 24 30 36 
43 37 31 25 19 13 7 
14 20 26 32 38 44 
45 39 33 27 21 
28 34 40 46 
47 41 35 
42 48 
49 


 
 */

public class MainClass05 {
	public static void main(String[] args) {
		int[][] nums = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
				{10,11,12}
				
		};
		
		for(int i=0; i < nums.length; i++) {
			for(int j=0; j< nums[i].length; j++) {
				System.out.print(nums[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
