package java_20190717;

public class BreakDemo {
	public static void main(String[] args) {
		// 1 부터 5까지의 합 break 사용하여 탈출
		int sum = 0;
		test: for (int i = 1; i <= 10; i++) {
			if (i == 6)
				break test; // i가 6이면 test라는 반복문을 탈출한다 (반복문이 하나이면 의미가 없다)
			sum += i;
		}
		System.out.printf("1부터 5까지의 합은 %d 입니다.%n", sum);

		// 이중 for문 탈출법

		outter: for (int first = 2; first <= 9; first++) {
			for (int second = 1; second <= 9; second++) {
				if (first == 4 && second == 8)
					break outter; // 4*8 일때 탈출이므로 4*8은 출력안함 레이블이 없으면 4*8 4*9 출력안됨
				// 4*8일때 탈출 -> 상위 for문 수행 / 여기선 outter이라는 lable 붙여줬기 때문에 완전탈출 
				// 없었으면 그냥 상위 for문으로 돌아가 4*8 4*9 제외 하고 5단~~ 했을것
				System.out.printf("%d * %d = %d%n", first, second, first * second);
			}
			System.out.println();
		}

	}
}
 