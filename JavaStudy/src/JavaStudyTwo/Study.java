package JavaStudyTwo;

import java.util.Arrays;

public class Study {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i = 0; i <= 100; i++) {
			if(i % 2 == 0) {
				sum = sum + i;
			}
		}
		
//		for (int i = 0; i <= 100; i++) {
//			if(sum % 2 == 0) {
//				sum = sum + i;
//			}
//		} => sum % 2 == 0인 조건을 걸면 결과값으로 sum의 값 중에 짝수인 값이 나오는 것이 아니라 sum의 값 중에 나눠서 나머지가 0인 sum의 값이 출력됨
		
		System.out.println(sum);
		
		
		for (int i = 0; i < 7; i++) { // i가 7보다 작을 때까지 반복
			
			for (int j = 0; j < (7-i); j++) { // j가 7-i보다 작을 때까지 반복
				System.out.println(" ");
			}
			
			for (int z = 0; z < (i+1); z++) { // z가 i+1보다 작을 때까지 반복
				System.out.println("*");
			}
			
		}
		
		int[] arr = {1, 2, 3, 4, 5};
		
		System.out.println(arr); // 결과값 : [I@1eb44e46
		System.out.println(Arrays.toString(arr)); // 결과값 : {1, 2, 3, 4, 5}
		
		
	}

}
