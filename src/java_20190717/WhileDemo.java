package java_20190717;

public class WhileDemo {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		while(i<=10) {  // i<=10 이 false 가  될 때까지 실행함 밑에 조건문을
			sum += i;
			i++;
		}
		System.out.printf("1부터 10까지의 합은 %d 입니다.%n", 
				sum);
		
		int first = 2;
		while (first <=9) {
			int second = 1;
			while (second <=9) {
				System.out.printf("%d * %d = %d%n" , 
						first , second, first*second);
				second++;
			}
			first++;
		}
		
	}
}