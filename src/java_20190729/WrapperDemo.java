package java_20190729;

// ctrl + shift + o -> 임포트
import java.util.ArrayList;

public class WrapperDemo {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();

		// 자바 1.4 이전 버전에서는 primitive data type을 collection에 저장
		// 할 수 없었기 때문에 primitive data type을 객체화 할 수 있는
		// Wrapper 으로 변환하여 저장해야 한다. 아래와 같이 1을 add 할 수 없음.
		// list.add(1);
		list.add(new Integer(1)); // primitive data를 담을 수 없어 -> 객체화, 클래스화

		// 1. primitive data type => wrapper calss (생성자 -> new Integer(10)) - collection
		// 에 담으려고
		Integer i2 = new Integer(10); // auto-boxing
		Integer i3 = new Integer(20);

		// 2. String => wrapper class(Integer.valueOf("10"))
		String s1 = "10";
		String s2 = "20";
		Integer i1 = Integer.valueOf(s1);

		// 3. wrapper class -> primitive data type
		int temp = i2.intValue() + i3.intValue(); // auto-unboxing

		// 4.* 중요 * String -> primitive data type(Integer.parseInt("10"))
		// Double.parseDouble / Long.parseLong
		temp = Integer.parseInt(s1) + Integer.parseInt(s2);
		System.out.println(temp);

		// 5. primitive data type을 String로 바꾸어 줄 때 -> String.valueOf(a1);
		int a1 = 10;
		String s3 = String.valueOf(a1); // 이렇게 쓰자

		// auto-boxing : primitive data type 자동으로 wrapper 해준다.
		Integer i4 = 10;

		// auto-unboxing : wrappeer 을 자동으로 primitive data type 으로 해준다
		int a2 = i2 + i3;

		System.out.println(i2); // 
		System.out.println(i2.equals(i3)); // equals 를 쓰면 안에있는 내용물을 비교하도록 overriding 되있다.
		
		String s4 = "12.34";
		double d1 = Double.parseDouble(s4);
		System.out.println(d1);
	}
}
