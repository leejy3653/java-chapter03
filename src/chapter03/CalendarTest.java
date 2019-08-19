package chapter03;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); // Calendar->abstract / factory Method
		printDate(cal);

		// 2020/12/25
		cal.set(Calendar.YEAR, 2020);
		cal.set(Calendar.MONTH, 11); // 세팅하려는 Month에 -1
		cal.set(Calendar.DATE, 25);
		printDate(cal);

		// 한큐에 세팅
		cal.set(2007, 10, 18);// 2007년 11월 18일
		printDate(cal);

		// 세팅한 날에 5000일 더하기
		cal.add(Calendar.DATE, 5000);
		printDate(cal);
	}

	public static void printDate(Calendar cal) {
		// final int i = 10; //값 대입이 10에서 끝났다(대입 금지) ->상수
		// final method -> 상속을 받아서 오버라이드를 하지마라(오버라이드 금지)
		// final class -> 상속을 금지

		String[] days = { "일", "월", "화", "수", "목", "금", "토" };

		// 연도
		int year = cal.get(Calendar.YEAR);// +1900 안해도 된다.

		// 월(0~11), +1해줘라
		int month = cal.get(Calendar.MONTH);

		// 일
		int date = cal.get(Calendar.DATE);

		// 요일 : 1(일) ~ 7(토)
		int day = cal.get(Calendar.DAY_OF_WEEK);

		// 시
		int hour = cal.get(Calendar.HOUR);

		// 분
		int minute = cal.get(Calendar.MINUTE);

		// 초
		int second = cal.get(Calendar.SECOND);

		System.out.println(year + "년 " + (month + 1) + "월 " + date + "일(" + days[day - 1] + "요일) " + hour + "시 "
				+ minute + "분 " + second + "초 ");

	}

}
