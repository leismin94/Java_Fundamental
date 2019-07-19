package java_20190719;

public class ArrayCopyDemo {
	public static void main(String[] args) {
		String[] fruits =
			{"apple","banana","watermelon","bluebery"};
		
		String[] temp = new String[6];
		// fruits -> 원본배열
		// 0 -> 원본배열의 위치, 원본배열의 어디서부터 복사할 위치
		// temp -> 카피할 배열
		// 0 -> 카피할 배열의 위치
		// 4 -> 원본배열의 4개요소를 카피
		System.arraycopy(fruits, 0, temp, 0, 4);  // fruits 라는 배열에서  0번째 부터 temp라는 배열의 0번째부터 4개 집어넣는다
		temp[4] = "peach";
		temp[5] = "rasberry";
		
		for(String str : temp) {
			System.out.println(str);
		}
	}
}
