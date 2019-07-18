package java_20190717;

public class ForDemo {
	public static void main(String[] args) {
		// 1 부터 10까지 짝수의 합
		int sum = 0;
		for (int i = 1; i<=10; i++) { // 조건을 추가하려면 for문안에 if문으로 조건을 넣어줘야함
			if(i%2 == 0) {
				sum += i ;  // sum = sum + i
			} 
		}
		System.out.printf("부터 10까지의 총 짝수의 합은 %d 입니다." , sum);

		// 구구단
		
		for(int first = 2; first <= 9 ; first ++) {
			for(int second = 1; second <=9; second ++) {
				System.out.printf("%d * %d = %d%n",
						first, second, first*second);
			}
			System.out.println(); // 밑에 for문 실행 후 이것 실행 한 뒤 첫 for문 증감연산자 수행
		}
		
		// 별찍기
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5-i; j++) {
				System.out.print("*"); //print() 는 엔터 안함  println()은 엔터
			}
			System.out.println(); // 엔터
		}
		
		// 구구단 역행
		for(int first = 9; first >= 2 ; first --) {
			for(int second = 1; second <=9; second ++) {
				System.out.printf("%d * %d = %d%n",
						first, second, first*second);
			}
			System.out.println();
		}
		
	}
}


/* 
  
 
if(second == 1) {
	System.out.printf("%n%d 단",first);
}

*/