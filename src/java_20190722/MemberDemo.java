package java_20190722;

// get은은 가져오는것 , set는 재설정하는것

public class MemberDemo {
	public static void main(String[] args) {
		Member m = new Member();
		// m.name = "a"; 안됨
		m.setName("ABC");
		// System.out.println(m.name); 안됨
		m.setZipcode("서울");
		m.setAddr1("123123-1231233");
		m.setAddr2("27");
		m.setSsn1("1234-13-22");
		m.setSsn2("1234-13-22");
		m.setAge(31);
	}
}
