package java_20190723; // 중복되는 코딩은 하나로 하는게 좋음

public class Calender {
	public static final int SUNDAY = 0; // final 변수는 변수명이 대문자이며 서로 공유해야하기에 static 쓴다. 어차피 바꿀수 없으므로 public으로 공개함
	public static final int MONDAY = 1;
	public static final int TUESDAY = 2;
	public static final int WHENSDAY = 3;
	public static final int THURSDAY = 4;
	public static final int FRIDAY = 5;
	public static final int SATURDAY = 6;

	private int getCount(int year, int month, int day) {
		int preYear = year - 1;
		int preMonth = month - 1;
		int totalCount = 0;

		totalCount = preYear * 365 + (preYear / 4 - preYear / 100 + preYear / 400);

		int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			monthArray[1] = 29;
		}

		for (int i = 0; i < preMonth; i++) {
			totalCount += monthArray[i];
		}

		totalCount += day;
		return totalCount;
	}

	private int getLastDay(int year, int month) {
		int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			monthArray[1] = 29;
		}

		return monthArray[month - 1]; // 배열의 처음은 0 이니까 month -1 해줘야됨
	}	
	
	// 위는 private 아래는 public인 이유
	// 위의 private 식들은 내가 프린트 하기위해 쓰는 공식들을 만든 메소드이기 때문에 다른사람들에게 
	// 알려줄 필요가 없다.
	// 밑에는 CalenderDemo 에서 사용하는 프린트 식이기 때문에 public으로 해줘야함.

	public void print(int year) {
		for (int i = 1; i <= 12; i++) {
			print(year, i);
		}

	}
	
	public void print2year(int year) { // 2년치 달력
		for (int j = year; j <= year+1; j++) {
			for (int i = 1; i <= 12; i++) {
				print(j, i);
			}
		}
	}
	
	public void print135(int year) { // 홀수인 달만
		for(int i=1; i<= 12; i++){
			if(i%2 ==1) {
				print(year,i);
			}i++;
		}
	}

	public void print(int year, int month) {
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		// 들여쓰기 기능
		// 2019 7 1 의 나머지

		int totalCount = getCount(year, month, 1);
		int rest = totalCount % 7;
		for (int i = 1; i <= rest; i++) {
			System.out.print("\t"); // 내여쓰기
		}

		for (int i = 1; i <= getLastDay(year, month); i++) {
			System.out.print(i + "\t");
			if (rest % 7 == Calender.SATURDAY) {
				System.out.println();
			}
			rest++;
		}
		System.out.println();
	}

	public void print(int year, int month, int day) {

		int totalCount = getCount(year, month, day);

		int dayOfWeek = totalCount % 7;
		String message = null;
		if (dayOfWeek == Calender.MONDAY) { // dayOfWeek == 1 보단 좌측의 표현이 훨씬 다른 사람들이 알아보기에 쉽다.
			message = "월요일";
		} else if (dayOfWeek == Calender.TUESDAY) {
			message = "화요일";
		} else if (dayOfWeek == Calender.WHENSDAY) {
			message = "수요일";
		} else if (dayOfWeek == Calender.THURSDAY) {
			message = "목요일";
		} else if (dayOfWeek == Calender.FRIDAY) {
			message = "금요일";
		} else if (dayOfWeek == Calender.SATURDAY) {
			message = "토요일";
		} else if (dayOfWeek == Calender.SUNDAY) {
			message = "일요일";
		}

		System.out.println(year + "년 " + month + "월" + day + "일은  " + message);
	}
}
