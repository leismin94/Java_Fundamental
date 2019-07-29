package java_20190729;

public class StringDemo {
	public static void main(String[] args) {
		String s1 = new String("test");
		String s2 = new String("test");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

		String s3 = "test";
		String s4 = "test";
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));

		// 이건 하지마
		String sql = "select id, pwd, email from member"; // 여기부터
		sql += "holyyyyyyyyyyyyyyyyy";// XXXXXXXXXXXXXXXXXXX
		sql += "aaaa";// XXXXXXXXXXXXXXXXXXX
		sql += "aaaa1";// XXXXXXXXXXXXXXXXXXX
		sql += "aaaa2";// XXXXXXXXXXXXXXXXXXX
		sql += "aaaa3";// XXXXXXXXXXXXXXXXXXX
		sql += "aaaa4"; // XXXXXXXXXXXXXXXXXXX 여기까지 sql 은 쓸모없는 문자열이 된다. 버려지는 sql 들
		sql += "aaaa5"; // XXXXXXXXXXXXXXXXXXX 최종의 sql만 남음
		System.out.println(sql);

		String ssn = "123456-7891011";
		char c = ssn.charAt(6);
		System.out.println(c);

		ssn = ssn.concat("abcd");
		System.out.println(ssn);

		String fileName = "asdasdas.asdasd.abc.doc";
		if (fileName.endsWith("zip")) {
			System.out.println("압축파일 입니다.");
		} else if (fileName.endsWith("doc")) {
			System.out.println("워드문서 입니다.");
		} else {
			System.out.println("파일 입니다.");
		}

		System.out.println(fileName.equalsIgnoreCase("Abc.doc")); // 대소문자 구분 X 잘 안쓰지만 equals 는 알고 있어야함

		int index = ssn.indexOf("-");

		System.out.println(index); // 셀 때 0부터셈
		// 파일이름은 라스트 인덱스 오브

		// 이건 꼭 알고 있어야한다.
		String first = ssn.substring(0, ssn.indexOf("-")); // ssn.substring(0,6); (0)포함하고 , (6)포함하지 않는다  // lastIndexOf(~~)로 놔야 파일이름,확장자 나누기 가능
		String second = ssn.substring(ssn.indexOf("-") + 1); // 얘(7)를 포함한 그 이하값 // +1 이 중요하다.
		System.out.println(first);
		System.out.println(second);
	}
}
