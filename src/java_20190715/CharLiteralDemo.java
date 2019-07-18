package java_20190715;

public class CharLiteralDemo {
	public static void main(String[] args) {
		
		// char literal의 유니코드 표현 -> '\u0000'
		
		char c1 = '\uc774';
		char c2 = '\uc2b9';
		char c3 = '\ubbfc';
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

		// char literal의 ** 아스키코드 표현 ** -> 65  // 그냥 숫자임
		
		char c4 = 65;
		System.out.println(c4);
		
		// char literal의 문자표현 -> ' '
		
		char c5 = 'q';
		System.out.println(c5);
		
		char c6 = '\'';
		
		String path = "C:\\\"dev\"\\eclipse"; // 문자로 인식시켜주려면 \ 역슬래쉬를 넣어주면 된다 \\ 를 \ 로 이해하면 편하다.
		
		// 특수문자
		// \n -> 개행
		// \t -> tab
		// \\ -> back slash
		// \' -> single quotation
		// \" -> doublt quotation

		String path2 = "aa\'bb";
		
		System.out.println(path2);
		
		
				
	}
}
