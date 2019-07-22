package java_20190722;

import java_20190719.Customer; // Customer을 사용하려하니 임포트 해줘야함

public class CustomerStaticDemo {
	public static void main(String[] args) {
		// static 변수는 클래스 이름으로 접근하는것이 좋다
		// static 변수는 보통 이자율 , 은행전화번호 처럼 다수가 같은 값을 가지는 경우엔 static 변수를 사용하는 것이 좋다.
		Customer.interestRate = 3.5; // 이렇게 맨위에 static 변수를 한번에 바꿔줄 수 있다. (일일히 관리하는 개념이 아님)
		
		Customer c1 = new Customer();
		c1.name = "홍길동";
		c1.age = 40;
		c1.email = "kdhong@naver.com";
		c1.phone = "010-0101-1010";
		c1.balance = 012.22;
		c1.isReleased = false;
		// c1.interestRate = 3.5; 
		// 이렇게 static 인 interestRate 는 instance 변수 같이 관리하면 안됨
		// Customer.BANKNAME = "국민은행";
		// final 변수는 재할당 할 수 없음
		// c1.interestRate = 3.5;
		// static 변수는 클래스 이름으로 접근하는 것이 관례이지만 reference 로도
		// 접근이 가능하다.(권장하지 않음)
		
		
		Customer c2 = new Customer();
		c2.name = "슴비라";
		c2.age = 50;
		c2.email = "gdg@naver.com";
		c2.phone = "010-4441-1010";
		c2.balance = 012.2442;
		c2.isReleased = false; 
		
		System.out.println(Customer.interestRate);
		
		Customer c3 = new Customer();
		c3.name = "배조스";
		c3.age = 62;
		c3.email = "jaws.amazon.com";
		c3.phone = "01";
		c3.balance = 1111111111111122.22;
		c3.isReleased = false;
		c3.interestRate = 3;
		
		System.out.println(Customer.interestRate);
		
	}
}
