package java_20190730;

import java.util.ArrayList;

public class GenericDemo {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(); // <변수타입> 변수타입이 아닌것을 선언하면 에러가 나옴
		list.add(1);
		list.add(2);
		list.add(3);
		// list.add("4"); Integer가 아니라서 에러가 나옴 (제너릭)해주었기때문
		for (int i = 0; i < list.size(); i++) {
			Integer temp = (Integer)list.get(i); // 제너릭을 해주면 (Integer) (캐스팅) 을 안해줘도 된다.
			System.out.println(temp);
		}
	}
}
