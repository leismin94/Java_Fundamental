package java_20190716;

public class SsnDemo {
	public static void main(String[] args) {
		int a1 = 1; //2
		int a2 = 1; //3
		int a3 = 1; //4
		int a4 = 1; //5
		int a5 = 1; //6
		int a6 = 1; //7
		
		int b1 = 1; //8
		int b2 = 1; //9
		int b3 = 1; //2
		int b4 = 1; //3
		int b5 = 1; //4
		int b6 = 1; //5
		int b7 = 5;
		
		// 복합연산자 쓰는게 좋다
		// 1. 각 자릿수를 2부터 9까지 곱하고 다시 2부터 2부터 5까지 곱해서 합을 구함
		
		int sum = a1*2 + a2*3 + a3*4 + a4*5 + a5*6 + a6*7 + b1*8 + b2*9 + b3*2 + b4*3 + b5*4 + b6*5;
		
		System.out.println(sum);
		
		// 2. 총합을 11로 나눈 나머지를 구한다.
		int result = 0;
		result = sum % 11;  // sum %= 11 같은 식으로 표현하는게 좋음
		
		System.out.println(result);
		
		// 3. 11에서 나머지를 뺀다.
		result = 11-result; 
		
		System.out.println(result);
		
		// 4. 3의 결과를 10으로 나눈 나머지를 구한다.
		result = result%10; // sum %= 10
		
		// 5. 4의 결과와  마지막 숫자가 같으면 정상적인 주민번호
		
		if(result==b7) {
			System.out.println("정상");
		}else {
			System.out.println("비정상");
		}
		System.out.println("오늘은 그만~~");
	}
}