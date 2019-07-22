package java_20190722;

public class StaticMethodDemo {
	String name; // instance 변수
	static double interestRate; // static 변수
	
	public void m1() {
		System.out.println("m1() 메서드 호출");
	}
	
	public void m2() {
		// instance method 에서는 instance 변수, static 변수 사용 가능
		// instance 메서드, static 메서드 호출 가능
		this.name = "이";
		StaticMethodDemo.interestRate = 0.1;
		this.m1();
		StaticMethodDemo.m3();
	}
	
	public static void m3() {
		System.out.println("m3() 메서드 호출");
	}
	
	public static void m4() {
		// 중 static method 에서는 instance 변수 사용할 수 없음, static 변수 호출가능
		// 요 static method 에서는  instance 메서드 호출 불가능, static만 메서드 호출 가능
		
		// name = "가나";
		interestRate = 0.2; // static 변수와 변수만 호출가능
		// this.interestRate 불가능 static method 이기 때문에
		// m1();
		m3();
	}
	public static void main(String[] args) {
		StaticMethodDemo.m3();
		StaticMethodDemo.m4();
		StaticMethodDemo.interestRate = 2.2;
		StaticMethodDemo s1 = new StaticMethodDemo(); // this. 을 못쓰니까 객체생성해서 s1 붙여준것이다.
		s1.m1();
		s1.m2();
		s1.name = "wtckfkck"; 
	}
	
}

// instance 메서드는 객체생성을 하지 않으면 쓸 수 없다.


