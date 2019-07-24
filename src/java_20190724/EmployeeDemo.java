package java_20190724;

public class EmployeeDemo {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.name = "스짜";
		e1.phone1 = "010";
		e1.phone2 = "1111";
		e1.phone3 = "2222";
		// name~phone3 은 부모것인데 상속받았기 때문에 사용가능하다
		e1.zipcode = "1313";
		e1.address1 = "12";
		e1.address2 = "34";
		e1.id = "leismin";
		e1.pwd = "1234567";
		}
}
