package java_20190723;

public class AdminDemo {
	public static void main(String[] args) {
		Admin a = new Admin("lemsin94","1234"); // 이걸로 값은 초기화가 되었다. // 2개짜리 생성자가 Admin에 있어서 읽히는것
		// 생성자 0,1,2,3,4 개 중 판단은 본인이 알아서 하는것 
		// public Admin(String id, String pwd) 이게 생성자 (17,25)
		// a.email = ""; // 초기화된 값을 변경하는 작업은 이렇게 하는게 아니라 setter 메서드로 하는것
		// a.setId("leismin94");
		// a.setPwd("1q1q1q1q");
		// a.setEmail("leismin94@gmail.com");
		// a.setLevel(99);
		System.out.printf("%s,%s,%s,%d",a.getId(),a.getPwd(),a.getEmail(),a.getLevel());
	}
}
