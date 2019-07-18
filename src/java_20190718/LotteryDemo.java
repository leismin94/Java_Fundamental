package java_20190718;

// 로또

public class LotteryDemo {
	public static void main(String[] args) {
		
		// Math.random() -> 0보다 크거나 같고 1보다 작은 양수를 Double 값으로 반환한다.
		
		for (int k = 0; k < 5; k++) { // 5번을 전체 문장 실행하고 55번째줄 문장 실행 하며 증감시킴
		
		int[] lotto = new int[6];
		
		for (int i = 0; i < lotto.length; i++) {
			double random = Math.random(); // 새로운 값을 뽑아야 하기때문에 밑에를 수행해서 빠져나온위치에 있어야함
			int temp = (int)(random * 45) +1;  // 0부터 44까지이므로 +1을 해주어야 1~45가 나온다.
			
			if(i==0) { // 첫번째 방은 무조건 임의의 값 temp를 저장한다.
				lotto[i] = temp;
			}else {
				// is는 임의의 값 temp와 이전 배열의 값을 비교했을 때 같으면 true 아니면 false
				boolean isExisted = false; 
				// i==1 아래의 for loop 1번 반복
				// i==2 아래의 for loop 2번 반복
				// i==3 아래의 for loop 3번 반복
				for(int j=0; j<i; j++) { // -> 이 for문은 lotto[j]와 temp 값이 같은지 아닌지 확인할겨 만든 것
					if(lotto[j]==temp) {
						//새로 생성한 temp와 이전 배열의 값을 비교해서 같은 값이 존재하면 
						isExisted = true;
						break;
					}
				}
				
				if(!isExisted) { // 존재하지 !(않으면)
					lotto[i] = temp; // 집어넣고
				}else {
					i--; // 이전위치로 변경하면 for문에서 i++로 증가하기에 원위치로 돌아가서 중복되는 값이 아닌 새로운 값으로 다시시도할 수 있음
				}
			}
			
		}	
		// 순서 정렬
		for(int i=0;i<lotto.length;i++) {
			for (int j = 0; j < lotto.length-(i+1); j++) {
				if(lotto[j]>lotto[j+1]) { // 왼쪽이 더 크면                            // temp는 값이 사라지지 않기위해서 넣어놓는 창고느낌
					int temp = lotto[j]; // j번째의 값을 temp에 넣고
					lotto[j] = lotto[j+1]; // j+1 (뒤에꺼) 를 j에 넣고
					lotto[j+1] = temp; // temp 의 값을 j+1에 넣는다
				}
			}
		}
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + "\t");
		}
		System.out.println(); // 한줄 띄기
		}
	}
}
