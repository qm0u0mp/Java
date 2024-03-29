package javaPlusStudy;

// JVM
// 1. 메서드 영역 : 클래스나 인터페이스의 구조 정보, 정적 데이터(static)가 저장되는 메모리 공간
// 2. 힙 영역 : 인스턴스에 데이터(new 연산자로 생성된 데이터)가 저장되는 메모리 공간
// 3. 스택 영역 : 하나의 스레드(= 호출된 메서드, 실행되고 있는 메서드)에서 사용되는 변수에 대한 데이터가 저장되는 메모리 공간 

class Class { // 선언된 Class1에 대한 정보가 메모리에 저장됨
	int variable1;
	double variable2;
	
	void method1() {
		
	}
	
	static void method2(int basic) {
		basic++;
	}
	
	static void method2(Ref instance) {
		instance.number++;
	}
}

class Ref {
	int number;
	
	static void method2(Ref instance) {
		instance.number++;
	}
}

public class B_JVM {

	public static void main(String[] args) {
		
		// 스택영역에 저장
		int localVariable;
		localVariable = 99;
		
		// 힙 영역에 저장
		Class refVariable;
		refVariable = new Class();
		
		refVariable.variable1 = 55;
		
		System.out.println(refVariable.variable1); // 결과값 : 55
		
		int[] array;
		array = new int[5];
		
		array[0] = 123;
		System.out.println(array[2]); // 결과값 : 0
		
//---------------------------------------------------------------------------------------------//
		
		int number = 0; // 값이 복사되어 number로 넘어감
		Class.method2(number);
		System.out.println(number); // 결과값 : 0 
		// => 기본 데이터 타입 int로 number를 정의하고 Class.method2(number)를 호출하여도 number의 값이 복사되어 넘어간 것이기 때문에 basic++를 계산하여 1이 되어도 결과값은 0으로 반환함
		
		Ref instance = new Ref();
		instance.number = 0; // instance.number 값을 0으로 선언
		Ref.method2(instance); // Ref 클래스 안의 method2값을 instance에 정의했을 때, 처음엔 0이었는데 instance.number++; 이 코드로 인해서 1 증가했음
		System.out.println(instance.number); // 결과값 : 1
		
	}
}