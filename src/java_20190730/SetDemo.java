package java_20190730;

import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		// 자동 import ctrl + shift + o
		// HashSet는 데이터(객체)의 중복을 허용하지 않고, 순서가 없음 <특징>
		//HashSet set = new HashSet(); // 선언
		//TreeSet = 데이터(객체)의 중복을 허용하지 않고, 오름차순으로 정렬
		TreeSet<Integer> set = new TreeSet<Integer>(); // 데이터를 중복하지 않고(set이기 때문) 오름차순 정렬
		
		while(true) {
			int random = (int)(Math.random()*45) +1;
			set.add(random); // 할당 primitive 값인 integer가 아니라 wrapper 클래스로 들어감 -> 오버라이딩 되있다 / auto-boxing 일어남
			// auto-boxing - > primitive data type을 자동으로 wrapper 값으로 변환해주는것
			// HashSet 크기 -> size
			if(set.size()==6) break; 
		}
		
		// set 을 Iterator 라는 반복자로 변형해서 출력시켜야함
		Iterator<Integer> i = set.iterator();
		while(i.hasNext()) { // hasNext() -> HashSet에 출력할 객체가 존재하는지 판단하는 메서드
			// autp-unboxing 이 발생 : wrapper -> primitive 를 자동으로
			int temp = (Integer)i.next(); //next() 해당 객체를 가져온다. / (int) 로 하면 안됨 / (Integer)로 해줘야함
			System.out.print(temp + "\t");
		}
	}
}
