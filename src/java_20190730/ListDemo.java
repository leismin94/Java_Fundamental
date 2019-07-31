package java_20190730;

import java.util.ArrayList;
import java.util.Iterator;

class Product {
	int number;
	String name;
	double price;

	Product(int number, String name, double price) {
		this.number = number;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [number=" + number + ", name=" + name + ", price=" + price + "]";
	}
}

public class ListDemo {

	public static void main(String[] args) {
		ArrayList<Product> list = new ArrayList<Product>(); // 생성
		
		Product p1 = new Product(1, "terra", 2500);  //  0 1 2 3  이렇게 있을 때 2를 지우면 0 1 x 2 가 됨 3->2로 된다.
		Product p2 = new Product(2, "신라면", 1000);
		Product p3 = new Product(3, "서울우유", 3000);
		Product p4 = new Product(1, "terra", 2500);

		list.add(p1); // 할당
		list.add(p2); // 할당
		list.add(p3); // 할당
		list.add(p4); // 할당
		
		for(Product product : list) {  // product 정보 바꾸기 
			if(product.number == 3) { // 비교대상이 primitive 이기때문에 == / 문자열 비교면 equals 쓰기
				product.price = 3500;
			}
		}
		
		//list.remove(0); 삭제
		/* 
		for (int i = 0; i < list.size(); i++) {
			list.remove(i--);
		}
		*/
		// 출력 < 무조건 외워야함 개 많이씀 >
		for (int i = 0; i < list.size(); i++) {
			Product temp = list.get(i);
			System.out.println(temp);
		}
		
		// 배열에있는걸 꺼내서 집어넣음
		// enhanced for loop 출력 가능(제너릭으로 선언한 경우에만 가능)
		//for (Product product : list) { 
		//	System.out.println(product);
		//}
		
		
	}
}
