// 특수문자중에 $,_는 사용 가능하다

package java_20190715;

// 클래스명의 시작은 대문자로 
// 두단어가 합쳐졌을 때는 두번째 단어 첫글자도 대문자 
// (camel case) 언더바를 쓰는것 보다는 이게 낫다.

public class IdentifierDemo {
	public static void main(String[] args) {
		int age = 10;
		String name = "hello";
		
		// 안되는 예시
		// String 1father Name = "John"; // 첫글자가 숫자여서 안됨
		// String mother Name = "Michell"; // 공백을 사용해서 안됨
		// String void = "empty"; // 예약어는 변수(식별자)로 사용할 수 없음
		// 자바는 유니코드를 지원하기에 한글도 식별자로 사용 가능하지만 영어로 사용하자
		
		String 이름 = "이승민";
		System.out.println(이름);
		
	}

}
