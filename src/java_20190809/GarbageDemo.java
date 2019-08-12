package java_20190809;

import java.util.Calendar;
import java.util.GregorianCalendar;

class A extends Thread{
	public void run() {
		System.out.println("스레드 11");
	}
}

class B implements Runnable {
	public void run() {
		System.out.println("스레드 22");
	}
}

public class GarbageDemo {
	public static void main(String[] args) {
		A a = new A();
		a.start();
		
		B b = new B();
		Thread t1 = new Thread(b);
		t1.start();

		System.out.println("aaa");
		
		// 둘다 같은 코드지만 위에가 더 좋은 코드다 밑에처럼 건방지게 하지 마라
		Calendar c = Calendar.getInstance();
		Calendar c1 = new GregorianCalendar(); 
		
	}
	
	// Calenadar 클래스의 메서드만 사용할 수 있음
	// 단 GregorianCalendar 클래스에서 overriding된 메서드는 사용가능
	
	public static Calendar getInstance() {
		Calendar c = new GregorianCalendar();
		return new GregorianCalendar();
	}
	
	
}
