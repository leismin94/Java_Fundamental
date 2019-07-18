package java_20190717;

public class ContinueDemo {
	public static void main(String[] args) {
		
		
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			if (i == 6) continue; // i가 6일때는 그냥 바로 조건문으로 가라 
				sum += i;
		}
		System.out.printf("1부터 10까지 6을 제외한 합은 %d 입니다.%n", sum);
		
		// if(true) return; // 리턴을 만나면 이 밑으로는 실행이 안된다
			
		 for (int first = 2; first <= 9; first++) {
			 outter: for (int second = 1; second <= 9; second++) {
				if (second==5) continue outter; // second가 5이면 second를 멈춤 outter 이라는 lable 탈출
				System.out.printf("%d * %d = %d%n", first, second, first * second);
			}
			System.out.println();
		}

	}
}
