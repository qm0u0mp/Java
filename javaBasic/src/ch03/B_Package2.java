package ch03;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class B_Package2 {

	public static void main(String[] args) {
		
		// Math 클래스 : 수학 연산과 관련된 다양한 메서드를 제공해주는 클래스
		
		// 절대값 메서드 : abs()
		System.out.println(Math.abs(-10)); // 결과값 : 10
		
		// *올림값 메서드 : ceil()
		System.out.println(Math.ceil(3.14)); // 결과값 : 4.0
		
		// *내림값 메서드 : floor()
		System.out.println(Math.floor(3.14)); // 결과값 : 3.0
		
		// *반올림값 메서드 : round()
		System.out.println(Math.round(3.14)); // 결과값 : 3
		
		// 특정 소수점 자리수에서 올림, 내림, 반올림
		System.out.println(Math.round(3.1415 * 100) / 100.0); // 결과값 : 3.14 => 소수점 세번째 자리에서 반올림
		
		// 최솟값 메서드 : min()
		System.out.println(Math.min(10, 20)); // 결과값 : 10
		
		// 최댓값 메서드 : max()
		System.out.println(Math.max(10, 20)); // 결과값 : 20
		
		// 거듭제곱 값 메서드 : pow()
		System.out.println(Math.pow(10, 3)); // 결과값 : 1000.0
		
		// 제곱근 값 메서드 : sqrt()
		System.out.println(Math.sqrt(100)); // 결과값 : 10.0
		
		// Random 클래스 : 난수를 생성해주는 클래스
		Random random = new Random(); 
		Random random2 = new Random(10); // 씨드값 지정해두고 작성하면 같은 값이 결과로 계속 나옴
		System.out.println(random.nextInt());
		System.out.println(random2.nextInt());
		// 범위제약
		System.out.println(random.nextInt(45)); // 0 ~ 44까지의 값이 결과로 나옴
		System.out.println(random.nextInt() % 45); // -44 ~ 44까지의 값이 결과로 나옴
		
		// Lotto : 1 ~ 45까지의 수를 중복을 허용하지 않고 6개의 숫자가 나오도록 구현
//		Set<Integer> lotto = new HashSet<>(); => Set : 중복 허용 안함 / 결과값이 오름차순으로 정렬되지 않음, ex) [15, 2, 33, 25, 35, 44]
				
//		for (int count = 0; count < 6; count++) {
//			int number = random.nextInt(45) + 1;
//			lotto.add(number);
//		}  => for문을 사용하면 Set을 사용했기 때문에 중복이 되는 값은 출력되지 않음, 그래서 6개가 아닌 1개, 2개, .... 등으로 나타날 수 있음
		
		for (int count = 0; count < 5; count++) {
		
			Set<Integer> lotto = new TreeSet<>(); // 결과값이 오름차순으로 정렬됨, ex) [2, 15, 25, 33, 35, 44]
			
			while (lotto.size() < 6) {
				int number = random.nextInt(45) + 1;
				lotto.add(number);
			}
			
		System.out.println(lotto);
		
		}
		
		// 연금복권 : 1-5조 0-9 중복 허용한 6자리수 5조588526
		List<Integer> annuity = new ArrayList<>();
		
		int jo = random.nextInt(5) + 1; 
		annuity.add(jo);
		
		for (int count = 0; count < 6; count++) {
			int number = random.nextInt(10);
			annuity.add(number);
		}
		
		System.out.println(annuity);
//-------------------------------------------------------------------------------//
		
		// Date 클래스 : 날짜를 다루는 클래스
		// Date 클래스의 대부분의 메서드는 JDK 1.1부터 사용하지 않도록 권장하고 있음
		Date dateNow = new Date();		
		System.out.println(dateNow); // 현재시간 출력
		System.out.println(dateNow.getDate()); // 쓰지마
		
		// LocalDateTime 클래스 : Java 8 버번 이후부터 Date 클래스를 대체하기 위해 만들어진 클래스
		// LocalDate 클래스, LocalTime 클래스, LocalDateTime 클래스
		
		// 현재 날짜 및 시간의 인스턴스 생성
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		// 특정 날짜 및 시간의 인스턴스 생성
		LocalDateTime date1 = LocalDateTime.of(2024, 1, 18, 9, 0, 0);
		System.out.println(date1);
		
		// 특정 요소 가져오기 => getXXX()
		int year = now.getYear();
		System.out.println(year);
		
		int month = now.getMonthValue();
		System.out.println(month);
		
		int day = now.getDayOfMonth();
		System.out.println(day);
		
		// 특정요소 변경하기 => withXXX
		// 변경한 값을 반환
		now = now.withYear(2025).withHour(15);
		System.out.println(now);
		
		// 날짜 계산하기
		// 특정 요소에 값을 더하거나 빼기ㅣ, plusXXX() / minusXXX()
		now = now.plusMonths(2).minusDays(15);
		System.out.println(now);
		
		// LocalDateTime을 Date 클래스로 변경
		Date localToDate = Date.from(now.atZone(ZoneId.systemDefault()).toInstant());
		
		// Date 타입을 String으로 변경
		// SimpleDateFormat 클래스를 사용하여 지정한 포멧으로 문자열로 변경
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
		String dateString = simpleDateFormat.format(localToDate);
		System.out.println(dateString);
		
		// y : 연도, M : 월, d : 일, a : 오전/오후, H : 시간(24시간 형태), h : 시간(12시간 형태), m : 분, s : 초, E : 요일
		simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd a HH:mm:ss");
		dateString = simpleDateFormat.format(localToDate);
		System.out.println(dateString);
		
		// LocalDateTime -> String
		dateString = now.format(DateTimeFormatter.ofPattern("yyyy-mm-dd a HH:mm:ss"));
		System.out.println(dateString);
				
	}
}