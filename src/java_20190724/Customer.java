package java_20190724;

// import java.lang.*; 생략중
public class Customer /* extends Object - 부모를 지정하지 않은 최상위이므로 생략되어있다 */ {
	String name;
	String phone1;
	String phone2;
	String phone3;
	
	public Customer(String name, String phone1, String phone2, String phone3) {
		super();
		this.name = name;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.phone3 = phone3;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	/*
	 * public Customer() {
	 *  super(); 생략되있는중
	 } */
}
