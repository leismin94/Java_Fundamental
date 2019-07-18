package java_20190716;

public class CalenderDemo {
	public static void main(String[] args) {
		/* 
		달력 만들기
		1. 1년 1월 1일은 월요일
		2. 1년은 365일, 윤년일때는 366일 - 2월 29일
		3. 윤년은 4년마다 발생하고 그중에서 100의 배수는 제외, 400의 배수는 제외하지 않는다.
		4. 2019년 12월 25일 
		5. 2018년 총 일수, 11월까지 총 일수, 25일 더하고, 7로 나눈 나머지로 요일 계산
		6. 1 - 월 2 - 화 ... 6 - 토 0 - 일
		*/
		
		int year = 2020;
		int month = 3;
		int day = 15;
		
		int preYear = year - 1; // 전년도
		int preMonth = month - 1; // 2019년 11월 (구하려는 월 전월)
		int totalCount = 0;
		
		// 2018년도까지 총 일수
		totalCount = preYear*365 + (preYear/4 - preYear/100 + preYear/400) ; // preyear 을 (year-1) 로 대체할 수 있다.
		
		// ~~년도 ~월까지 합
		totalCount += 31+29;
		// 일수 totalCount = totalCount + day 보다 아래식이 복합연산자를 사용함으로써 더 간결해짐.
		totalCount += day;
		
		int dayOfWeek = totalCount%7;
		String message = null; // 출력할 메시지의 변수를 초기화 시켜줌
		if(dayOfWeek == 1) {
			message = "월요일";
		} else if(dayOfWeek == 2) {
			message = "화요일";
		} else if(dayOfWeek == 3) {
			message = "수요일";
		} else if(dayOfWeek == 4) {
			message = "목요일";
		} else if(dayOfWeek == 5) {
			message = "금요일";
		} else if(dayOfWeek == 6) {
			message = "토요일";
		} else if(dayOfWeek == 0) {
			message = "일요일";
		}
		System.out.println(year+"년 \n"+month+"월\n"+day+"일은 \n"+message);
	}
}


