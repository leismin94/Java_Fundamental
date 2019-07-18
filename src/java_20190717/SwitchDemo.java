package java_20190717;

public class SwitchDemo {
	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		String season = null;

		switch (month) {
		
		// default: season = "없는계절"; break; (default를 맨 위에 하려면 break;를 써주어야한다.)
		// case의 값이 겹치면 에러가 나옴 유일해야함
		
		case 12: // break 없어서 밑으로
		case 1:  // **
		case 2:  // **
			season = "겨울"; 
			break;
		case 3:
		case 4:
		case 5:
			season = "봄";
			break;
		case 6:
		case 7:
		case 8:
			season = "여름";
			break;
		case 9:
		case 10:
		case 11:
			season = "가을";
			break;

		default:
			season = "없는계절";

		}
		System.out.printf("%d월은 %s 입니다.", month, season);

	}

}

// 10 진수 %d
// 소수점 %f
// 문자 %s