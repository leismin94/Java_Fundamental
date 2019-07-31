package java_20190731;

import java.util.ArrayList;

public class ExceptionDemo {


	public static void main(String[] args) {
		// 1대신 111a 이런 Int가 아닌 다른걸 넣으면 ->NumberFormatException 
		int i = Integer.parseInt("1"); 
		System.out.println(i);
		
		// 있지도 않은 방 a[4] 를 넣으면 에러가 남 ArrayIndexOutOfBoundsException
		int[] a= {1,2,3,4};
		System.out.println(a[1]);
		
		// list.get(4) 있지도 않은것을 넣으면  IndexOutOfBoundsException
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		System.out.println(list.get(2));
		
		// str이 null 이면 NullPointerException
		String str = "";
		System.out.println(str.length());
		
		int b = 0;
		int c = 0;
		//분모가 0 일때 ArithmeticException / by zero
		System.out.println(c+b);
		
	}
}
