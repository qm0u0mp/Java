package ch02;

// 상속 : 객체 지향 프로그래밍의 특성 중 하나
// 원래 존재하던 클래스를 확장하여 재사용할 수 있도록 하는 것
// 코드 중복을 제거하며 확작성을 높일 수 있음
// extends 키워드를 사용하여 확장

// 상속 선언 방법 : class SubClass extends SuperClass {}

class Human {
	String name;
	int age;
	
	void sleep() {
		System.out.println(name + "가 잠을 주무십니다.");
	}
}

class Animal {
	
	String species;
	
	void sleep () {
		System.out.println("잠을 잡니다.");
	}	
}

// Java에서는 클래스의 단일 상속만 지원함 => 다이아몬드 문제를 방지하기 위함
// 다이아몬드 문제 : 다중 상속을 했을 때 발생하는 메서드 호출의 모호성 => 다중 상속했을 시 어떤 클래스를 상속해야할지 컴퓨터는 인식을 하지 못함

// 아래 코드에서 'extends Human, Animal' 형태로 다중 상속을 할 수 없음
class Teacher extends Human {	
	String course;	
	
	void teach() {
		System.out.println(name + "가 " + course + "를 가르칩니다.");
	}	
}

class Developer extends Human {
	String position;
	
	void develop() {
		System.out.println(name + "가 " + position + "개발을 합니다.");
	}
}

// 모든 클래스는 'Object'라고 하는 최상위 클래스를 반드시 상속받고 있음
// B_Inheritance 클래스에 teacher1을 입력하고 '.'을 찍었을 때 나오는 리스트 중 '- Object'라고 나오는 것

public class B_Inheritance {

	public static void main(String[] args) {

		Human human1 = new Human();
		human1.name = "홍길동";
		human1.age = 0;
		human1.sleep(); // 결과값 : 홍길동가 잠을 주무십니다.
		
		Teacher teacher1 = new Teacher();
		teacher1.name = "김철수";
		teacher1.age = 10;
		teacher1.course = "국어";
		teacher1.sleep(); // 결과값 : 김철수가 잠을 주무십니다.
		teacher1.teach(); // 결과값 : 김철수가 국어를 가르칩니다.
		
		Developer develop1 = new Developer();
		develop1.name = "이영희";
		develop1.age = 20;
		develop1.position = "백엔드";
		develop1.sleep(); // 결과값 : 이영희가 잠을 주무십니다.
		develop1.develop(); // 결과값 : 이영희가 백엔드 개발을 합니다.

	}
}