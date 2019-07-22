package java_20190719;

public class CustomerDemo {
	public static void main(String[] args) {
		//Customer 객체 생성
		//Customer => object type
		//c1 => reference
		//new Customer()
		Customer c1 = new Customer();
		c1.name = "승민";
		c1.age = 26;
		c1.email = "leismin94@gmail.com";
		c1.phone = "010-9667-9369";
		c1.balance = 71111111111.17;
		c1.isReleased = false;

		System.out.printf("%s,%d,%s,%s,%.2f,%s%n",
				c1.name,c1.age,c1.email,c1.phone,c1.balance,c1.isReleased);
		
		Customer c2 = new Customer();
		c2.name ="손정의";
		c2.age = 60;
		c2.email = "ceo@softbank.com";
		c2.phone = "010-0100-1000";
		c2.balance = 450_000_000_000.1;
		c2.isReleased = true;
		
		System.out.printf("%s,%d,%s,%s,%.2f,%s%n",
				c2.name,c2.age,c2.email,c2.phone,c2.balance,c2.isReleased);
		Customer c3 = c2;
		c3.age = 1000;
		
		System.out.printf("%s,%d,%s,%s,%.2f,%s%n",
				c2.name,c2.age,c2.email,c2.phone,c2.balance,c2.isReleased);
	}
}
