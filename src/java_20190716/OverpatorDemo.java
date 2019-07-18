package java_20190716;

// ctrl + shift + f -> 자동 줄 맞춤(Tab)

public class OverpatorDemo {
	public static void main(String[] args) {
		int a = 10, b = 22;
		int c = 0;
		double d = 0;
		System.out.println(c);
		
		c = a - b;
		System.out.println(c);
		
		c = a * b;
		System.out.println(c);
		
		d = (double)b / (double)a; // c는 double이라 소수로 나오지만 a,b는 int라 정수임 그래서 double로 캐스팅 해줌
		System.out.println(d);
	
		c = b % a;
		System.out.println(c);
		
		a += b; // a = a + b;
		System.out.println(a);
		
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		// ++a 는 1증가후 a a++은 a후 1증가 ++a하면 1증가한a가출력 되지만 a++ 하면 그냥 a가출력됨
		
		a++;
		b++;
		
		// 코딩은 압축하는게 좋다.
		
		// 대입 후 증가
		c = a++;	
		System.out.println(c);  
		
		// 증가 후 대입
		c = ++b;
		System.out.println(c);
		
		a = 10;
		b = 20;
		
		boolean isSuccess = false;
		
		isSuccess = a > b;
		System.out.println(isSuccess);
		
		isSuccess = a < b;
		System.out.println(isSuccess);

		isSuccess = a >= b;
		System.out.println(isSuccess);
		
		isSuccess = a <= b;
		System.out.println(isSuccess);

		isSuccess = a == b;
		System.out.println(isSuccess);
		
		isSuccess = a != b;
		System.out.println(isSuccess);
		
		// a&&b -> a가 false 이면 뒤에 b 연산을 하지 않음 short circuit 이라고 한다
		// a||b -> a가 true 이면 뒤에 b 연산을 하지 않음 이것 또한 short circuit 이다.
		
		isSuccess = (a==b) && (a++ == b++); // 비교한다음에 증가 하라는 의미 a++
		
		System.out.println(isSuccess);
		System.out.println(a);
		System.out.println(b);  // 앞에가 false 이면 숏서킷 발생하기 때문에 뒷연산을 안해서 b = 20으로 ++의 연산이 안된상태로 결과 도출
		
		isSuccess = (a==b) || (a++ == b++);
		
		System.out.println(b);
		System.out.println(a);
		System.out.println(isSuccess);
		
		// 논리연산은 T,F 이지만 비트연산은 값이 나온다.
		// 7&5 이면 7을 2진수로바꾼값과 5를 2진수로 바꾼값을 & 한것
		// *** and 연산 >> or 연산 (우선순위)
		// +는 연결연산으로 상수+문자 이면 연결연산으로 해결  
		// ex) (1+2+3+"4"+5+6) 이면 6 +"4" 이후로는 연결연산이 되어 6456 으로 출력됨
		// 5+6을 11로 하고싶으면 대괄호 해주면 됨
		
		System.out.println(1+2+3+"4"+(5+6));
		
		
	}

}
