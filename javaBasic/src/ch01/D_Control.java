package ch01;

import java.util.Scanner;

public class D_Control {

	public static void main(String[] args) {
		
		// 제어문 : 조건에 따라서 코드의 흐름을 결정하는 것
		
		Scanner scanner = new Scanner(System.in);
		
		// 조건문 : 특정 조건이 만족하면 코드를 실행하는 것, 만족하지 않으면 실행하지 않는 것
		
		// if : 주어진 조건이 true이면 코드를 실행하도록 하는 것
		// 사용 방법 : if(조건 - 논리표현식) { 실행할 코드 }
		int age = 15;
		
		// age는 17보다 크거나 같으면서 19보다 작거나 같아야한다. (AND)
		// age >= 17 && age <= 19
		
		// age는 17보다 크거나 같거나 19보다 작거나 같아야한다. (OR)
		// age >= 17 || age <= 19
		
		if(age >= 17 && age <= 19) { 
			System.out.println("고등학생입니다.");
		} // if문 중괄호 뒤에 ';' 안 넣어도 됨
		System.out.println("프로그램 종료");
		
		if(age < 17 || age > 19) { 
			System.out.println("고등학생이 아닙니다.");
		}
		System.out.println("프로그램 종료");
		
		// 부정연산자 : 논리 표현식을 부정하는 연산
		// !논리 : true면 false, false면 true를 반환
		// !isHighSchool => 만약 isHighSchool이 true가 아니면
		boolean isHighSchool = age >= 17 && age <= 19;
		
		if(isHighSchool) {
			System.out.println("고등학생입니다.");
		} 
		System.out.println("프로그램 종료");		
		
//---------------------------------------------------------------------------------------------//
		
		// else문 : if문의 조건-논리표현식이 false면 코드를 실행하도록 하는 것
		// 사용 방법 : if(조건 - 논리표현식) { true이면 실행할 코드 } else { false이면 실행할 코드 }
		
		// 1. else문은 반드시 if문 이후에 와야함 (else 단독으로 사용 불가능)
		// 2. else문에는 조건을 작성하지 않음
		age = 10;
		
		if(age > 19) {
			System.out.println("성인입니다.");
		} else {
			System.out.println("미성년자입니다.");
		}
		System.out.println("프로그램 종료");
				
		// else if문
		String fruit = "수박";
		
		if(fruit.equals("사과")) {
			
		} else if(fruit.equals("바나나")) {
				
		} else if(fruit.equals("귤")) {
					
		} else {
					
		}
		
//---------------------------------------------------------------------------------------------//
		
		// switch : 특정 변수 또는 값에 따라 실행할 코드 블록의 범위를 결정하는 것, 특정 변수가 일치하면 실행
		
//		 switch(변수 - 일반표현식) { 
//		 case 값1 : 
//				변수 - 일반표현식이 값1과 같을 때 시작할 코드위치 
//		 case 값2 : 
//				변수 - 일반표현식이 값2와 같을 때 시작할 코드위치
//		 		switch 내부에서 break문을 만나면 switch문을 종료
//		 		break; => case 구문의 마침표
//		 case 값3 : 
//				변수 - 일반표현식이 값3과 같을 때 시작할 코드위치
//		 default : 
//				조건이 모두 만족하지 않을 때 실행되는 코드
//				변수 - 일반 표현식이 case의 값과 일치하는 것이 없거나
//		 		바로 위에서 break문을 만나지 않으면 실행되는 코드
//				break 작성 안해도됨
//		 }
		
		int input = 5;
		
		// input이 0이면 ABC를 출력
		// input이 1이면 BC를 출력
		// input이 2이면 C
		// input이 3이면 DEF
		// input이 4이면 EF
		// input이 0~4가 아면 F			
		switch(input) {
		case 0:	
			System.out.println("A"); // break가 없으면 구문이 끝나지 않고 break가 있는 구문까지 실행됨 즉, case2까지 실행된다는 말
		case 1:
			System.out.println("B");
		case 2:
			System.out.println("C");
			break;
		case 3:
			System.out.println("D");
		case 4:	
			System.out.println("E");
		default:
			System.out.println("F");
		}
				
		// input이 0이면 A를 출력
		// input이 1이면 B를 출력
		// input이 2이면 C
		// input이 3이면 D
		// input이 4이면 E
		// input이 0~4가 아면 F		
		switch(input) {
		case 0:	
			System.out.println("A");
			break;
		case 1:
			System.out.println("B");
			break;
		case 2:
			System.out.println("C");
			break;
		case 3:
			System.out.println("D");
			break;
		case 4:	
			System.out.println("E");
			break;
		default:
			System.out.println("F");
		}
				
//---------------------------------------------------------------------------------------------//
		
		// 반복문 : 특정 조건에 부합하면 지정한 코드를 여러번 실행하도록 하는 것
		
		// for문 : 일반적 반복 횟수가 정해져있을 때 사용하는 반복문
		// 사용 방법 : for(조건에 사용할 변수 초기화; 조건; 조건에 사용할 변수 증감) { 반복할 코드 }
		// for(;;){ 반복할 코드 } => 무한루프, while(true)랑 똑같음
				
//		System.out.println("안녕하세요.");
//		System.out.println("안녕하세요.");
//		System.out.println("안녕하세요.");
//		System.out.println("안녕하세요.");
//		System.out.println("안녕하세요.");
//		System.out.println("안녕하세요.");
//		System.out.println("안녕하세요.");
//		System.out.println("안녕하세요.");
//		System.out.println("안녕하세요.");
//		System.out.println("안녕하세요.");
//		System.out.println("안녕하세요.");
//		... * 100
		for(int count = 1; count <= 100; count++) {
			System.out.println(count);
			System.out.println("안녕하세요.");
		}
		
//		System.out.println("1번 안녕하세요.");
//		System.out.println("2번 안녕하세요.");
//		System.out.println("3번 안녕하세요.");
//		System.out.println("4번 안녕하세요.");
//		System.out.println("5번 안녕하세요.");
				
		for(int count = 1; count <= 5; count++) {
			System.out.println(count + "번 안녕하세요.");
		}
		
//		System.out.println("-1번 안녕하세요.");
//		System.out.println("2번 안녕하세요.");
//		System.out.println("5번 안녕하세요.");
//		System.out.println("8번 안녕하세요.");
//		System.out.println("11번 안녕하세요.");
		
		for(int count = 1; count <= 5; count++) {
			System.out.println((3*count-4) + "번 안녕하세요.");
		}
		
//		System.out.println("2 * 1 = 2");
//		System.out.println("2 * 2 = 4");
//		System.out.println("2 * 3 = 6");
//		System.out.println("2 * 4 = 8");
//		System.out.println("2 * 5 = 10");
//		System.out.println("2 * 6 = 12");
//		System.out.println("2 * 7 = 14");
//		System.out.println("2 * 8 = 16");
//		System.out.println("2 * 9 = 18");
		
//		// 구구단 2단
//		for(int count = 1; count <= 9; count++) {
//			System.out.println("2 * " + count + " = " + (2 * count));
//		}
//		
//		// 구구단 3단
//		for(int count = 1; count <= 9; count++) {
//			System.out.println("3 * " + count + " = " + (3 * count));
//		}
//		
//		// 구구단 4단
//		for(int count = 1; count <= 9; count++) {
//			System.out.println("4 * " + count + " = " + (4 * count));
//		}
//		
//		//.....
//		
//		// 구구단 4단
//		for(int count = 1; count <= 9; count++) {
//			System.out.println("9 * " + count + " = " + (9 * count));
//		}
		
//		// 구구단 2단 ~ 9단
//		for(int dan = 2; dan <= 9; dan++) {
//			for(int n = 1; n <= 9; n++) {
//				System.out.println(dan + " * " + n + " = " + (dan * n));
//			}
//		}
		
		// 중첩 for문 사용시 시스템 상의 문제 발생 가능성 높음

//---------------------------------------------------------------------------------------------//
		
		int[] numbers = new int[5];
		
//		numbers[0] = 1;
//		numbers[1] = 2;
//		numbers[2] = 3;
//		numbers[3] = 4;
//		numbers[4] = 5;
		
//		for(int index = 0; index <= 4; index++) {
//			numbers[index] = index + 1;
//		}
		
//		System.out.println(numbers[0]);
//		System.out.println(numbers[1]);
//		System.out.println(numbers[2]);
//		System.out.println(numbers[3]);
//		System.out.println(numbers[4]);
		
		for(int index = 0; index <= 4; index++) {
			numbers[index] = index + 1;
			System.out.println(numbers[index]); // 결과값 : 1 2 3 4 5
		}
		
//		for(int index = 0; index <= 4; index++) {
//			System.out.println("numbers[" + index + "] = " + (index + 1)); // 결과값 : numbers[0] = 1 .... numbers[4] = 5
//		}
//		
//		for(int index = 0; index < numbers.length; index++) {
//			System.out.println(numbers[index]); // 결과값 : 1 2 3 4 5
//		}
		
//---------------------------------------------------------------------------------------------//

		// foreach : 컬렉션(배열)의 각 요소를 하나씩 변수에 '복사'하여 사용하는 반복문				
		
		//numbers : {1, 2, 3, 4, 5}
		for (int number : numbers) {
			System.out.println(number); // numbers에 들어있는 값들을 선언 {1, 2, 3, 4, 5}
		}
		
		for (int number : numbers) { 
			number = 1; // number를 1로 변경했을 때 numbers의 각 요소에 재할당되는 것이 아니기 때문에 numbers의 값들은 1로 바뀌지 않음
			// System.out.println(numbers); // 결과값 : [I@71be98f5 ...
		}
		
		for (int number : numbers) {
			System.out.println(number); // 결과값 : 1 2 3 4 5 => numbers에 0,1,2,3,4 주소에 0의 주소에서 1을, 1의 주소에서 2를 가져와서 값을 넣는거기 때문에 출력했을 때 1,2,3,4,5가 출력됨
		}
		
		for(int index = 0; index < numbers.length; index++) {
			numbers[index] = 0; // index : 0, 1, 2, 3, 4 => numbers 배열의 각 요소(index)에 0을 재할당하여 0의 주소에 0을, 1의 주소에 1을 가져와서 값을 넣는거기 때문에 출력했을 때 0,0,0,0,0이 출력됨 
		}
				
		for (int number : numbers) {
			System.out.println(number); // 결과값 : 0 0 0 0 0
		}
		
//---------------------------------------------------------------------------------------------//
		
		// while문 : 반복할 횟수가 정해져있지 않을 때 사용하는 반복문
		// 조건이 true인 동안 반복, 조건이 false가 되면 반복 종료
		// 외부에서 입력을 받아 사용할 때 사용
		
		input = 1;
				
//		while(input != 0) {
//			System.out.println("while 반복문 실행중..."); // input이 0이 아니기 때문에 true, "while 반복문 실행중..."이 출력됨
//			input = scanner.nextInt();
//		}
//		System.out.println("while 반복문 종료!"); // 사용자가 0을 입력하면 "while 반복문 종료!"가 출력되면서 반복문 종료됨
				
//		while(input != 0) {
//			input = scanner.nextInt(); // 홀수 입력 시 처음으로 돌아가라, scanner 함수 작동
//			
//			if(input % 2 != 0) {
//				// continue : 반복문에서 continue문을 만나면 조건 검사로 넘어감
//				continue; // System.out.println("while 반복문 실행중...");
//			}
//			if(input == 0) {
//				//break : 반복문에서 break문을 만나면 반복문 종료
//				break; // System.out.println("while 반복문 종료!");
//			}
//				System.out.println("입력 값 : " + input);
//				System.out.println("while 반복문 실행중...");
//		}
//		System.out.println("while 반복문 종료!"); 
		
		for (int index = 0; index < 10; index++) {
			if (index % 3 == 0) { // index를 3으로 나누었을 때 나머지가 0이면 계속 진행
				continue;
			}
			if (index == 8) {
				break;
			}
			System.out.println(index); // 결과값 : 1, 2, 4, 5, 7 => index를 3으로 나누었을 때 0이 아닌 값
		}
	}
}