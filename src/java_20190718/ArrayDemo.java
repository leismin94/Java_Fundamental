package java_20190718;

public class ArrayDemo {
	public static void main(String[] args) {
		//int 배열선언
		int[] a = new int[4]; // a라는 크기가 4인(4개의 방이있는) int배열 
		
		//배열 할당
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		
		int sum =0;
		for(int i=0; i<a.length; i++) {
			int temp = a[i]; // a 라는 배열의 i번째 값을 출력
			sum += temp;
			System.out.println(temp);
		}
		
		System.out.printf("배열의 총합은 %d 입니다.%n",sum); //문자열에 오른쪽 변수넣어서 출력1
		
		// 배열 생성과 동시에 할당도 이루어 진다.
		// 배열의 사이즈가 정해지면 바꿀 수 없다.
		// 늘리려면 새로운 배열을 만들고 기존의 배열을 대입하여 나머지 빈공간에 추가하는 방법이 있다.
		
		int []b = {1000,2000,3000,4000};
		
		// 배열의 값 변경(할당) 하나씩 접근해야함
		
		b[0] = 1010; 
		b[1] = 2; 
		b[2] = 3; 
		b[3] = 1010; 
		
		
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		System.out.println(b[3]);
		
		// a.length ->  배열 a 의 길이 
		
		for(int i=0; i<b.length; i++) {
			System.out.println(b[i]);
		}
		
	}
}
