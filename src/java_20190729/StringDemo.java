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
		//charAt(int index) : 문자열중에서 특정 index에 있는 문자를 반환한다.
		// 시작 index는 0부터 시작한다.
		char c = ssn.charAt(6);
		System.out.println(c);
		//concat(String msg) : 문자열 연결
		ssn = ssn.concat("abcd");
		System.out.println(ssn);

		String fileName = "asdasdas.asdasd.abc.doc";
		//endsWith(String msg) msg문자열로 끝나면 true, 그렇지 않으면 false
		
		if (fileName.endsWith("zip")) {
			System.out.println("압축파일 입니다.");
		} else if (fileName.endsWith("doc")) {
			System.out.println("워드문서 입니다.");
		} else {
			System.out.println("파일 입니다.");
		}
		
		//equalsIgnoreCase(String msg) : 대소문자를 구분하지 않고 문자열을 비교하여 같으면 true, or false
		
		System.out.println(fileName.equalsIgnoreCase("Abc.doc")); // 대소문자 구분 X 잘 안쓰지만 equals 는 알고 있어야함
		
		//indexOf(String msg) : msg 문자열의 위치를 반환한다.
		// msg 문자열을 찾을 처음부터 시작은 0에서 시작한다.
		
		//lastIndexOf(String msg) : msg 문자열의 위치를 반환한다
		//msg 문자열을 찾을때 끝에서 찾고 index는 처음부터 시작한다.
		
		int index = ssn.indexOf("-");

		System.out.println(index); // 셀 때 0부터셈
		// 파일이름은 라스트 인덱스 오브
		// 111111-1111118
		// substring(int first, int second)
		// first(포함)부터, second(포함하지않음) 사이의 문자열을 추출한다.
		// substring(int first)
		// first(포함)보다 큰 모든 문자열을 추출한다.
		

		// 이건 꼭 알고 있어야한다.
		String first = ssn.substring(0, ssn.indexOf("-")); // ssn.substring(0,6); (0)포함하고 , (6)포함하지 않는다  // lastIndexOf(~~)로 놔야 파일이름,확장자 나누기 가능
		String second = ssn.substring(ssn.indexOf("-") + 1); // 얘(7)를 포함한 그 이하값 // +1 이 중요하다.
		System.out.println(first);
		System.out.println(second);
		
		String html = "안녕하세요 \n 저는 예 . \n 잘 예예"; 
		html = html.replaceAll("\n","<br>"); // html 에서 개행은 \n이 아니라 <br> 이다. \n을 <br>로 바꿔줄 때 replaceAll 해준다
		// 문자열을 바꿀 떄 replaceall(이것을 , 이걸로 바꾼다);
		// A를 B로 대페한다.
		System.out.println(html);
		
		String url = "http://www.naver.com";
		String path = "/news";
		// startsWith(String msg) msg 문자열로 시작하면 true, or false
		if(path.startsWith("/news")) {
			System.out.println("뉴스 페이지 입니다.");
		}else if(path.startsWith("/sports")) {
			System.out.println("스포츠 페이지 입니다.");
		}else {
			System.out.println("페이지가 존재하지 않습니다.");
		}
		
		String m1 = "hello";
		String m2 = "hello ";
		
		System.out.println(m1);
		System.out.println(m2);
		if(m1.equals(m2.trim())) { // trim 은 공백을 다 잘라서 비교함
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		//toUpperCase() 대문자로 변환
		m1 = m1.toUpperCase();
		System.out.println(m1);
		//toLowerCase() 소문자로 변환
		m2 = m2.toLowerCase();
		System.out.println(m2);
		
		//String.valueOf() : primitive data type 을 문자열로 반환한다.
		int a = 10;
		String str = String.valueOf(a);
		
		char[] c1 = {'a','b','c'};
		String str1 = String.valueOf(c1);
		
		//ssn : 111111-1111118
		// 111#222#333 -> 111,222,333 은 토큰 #은 구분자
		//split(String delimiter) : 문자열을 구분자(delimiter)로 토큰(token)화 시키는 메서드 
		String[] strArray = ssn.split("-"); // -를 기준으로 앞과 뒤를 쪼개달라
		System.out.println(strArray[0]);
		System.out.println(strArray[1]);
		
		String str2 = String.format("%,d",1000000); // 알아서 0 3개마다 , 를 찍어줌
		System.out.println(str2);
		
		String str3 = String.format("%,.2f", 1123.11534); // ,(콤마)를 찍으면서  소수점 2째자리까지 -> .2 알아서 반올림도 해줌
		System.out.println(str3);
		
		
	}
}
