package java_20190715;
// 리터럴
public class LiteralDemo {
	public static void main(String [] args) {
		
		// byte a1 = (byte)128;				// byte 범위를 넘어가면 컴파일 에러발생
		int a1 = 128;	// 10진수	 표기법		// 범위를 넘어가면 다른걸 써주면 좋음
		int a2 = 076;	// 8 진수  표기법
		int a3 = 0x123; // 16진수 표기법
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		long a4 = 2200000000l; // long 리터럴은 숫자뒤에 l,L을 붙여줘야한다.
		
		float f1 = 1234.43f; // float 리터럴은 소숫점 뒤에 f,F를 붙여줘야한다.
		
		double d1 = 123455.56d; // double 리터럴은 소숫점뒤에 d,D를 붙여줘야한다.
		
		boolean inExisted = false; // boolean 리터럴은 true, false 
		
		a1 = 10;
		d1 = 10.0d;
		
		System.out.println(a1==d1); // primitive data type의 == 연산자는 값만 비교한다. 
		
		int b1 = 10;
		int b2 = b1; // b1에 있는 10을 할당하라는것, b1에는 영향을 주지 않는다.
		b2 = 20;
		System.out.println(b1);
		System.out.println(b2);
		
	}
}
