package java_20190730;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("test");
		StringBuffer s2 = new StringBuffer("test");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		// 문자열 비교가 안된다 - why? equals() 를 overriding 안했기 때문에
		// 문자열 연결용이다 StringBuffer 는
		System.out.println(s1.equals(s2));
		// StringBuffer -> String : toString()
		String s3 = s1.toString(); // 문자열 변환
		String s4 = s2.toString(); // 문자열 변환
		System.out.println(s3.equals(s4)); // 그리고 비교하면 잘 된다.
		
		StringBuffer sql = new StringBuffer();
		sql.append("selet name, age ");
		sql.append("from member ");
		sql.append("where name = 행행행 ");
		sql.append("order by name desc ");

		System.out.println(sql);
		// sql의 모든 문자열 지우기
		
		sql.setLength(0);
		
		sql.append("select no, writer from board");
		System.out.println(sql);
	}
}
