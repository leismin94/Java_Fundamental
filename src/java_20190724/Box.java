package java_20190724;

public class Box {
	int width;	// instance(멤버) 변수, 초기화 안해도 default 값이 자동으로 부여됨 / boolean = false; 로 초기화 되어있다.
	int height;
	int depth;
	// final 변수명은 대문자롤 하는것이 관례이다.
	// final 변수는 변수의 특성상 인스턴스 변수로 처리하지 않고 static 변수로 처리함
	// final 변수는 값을 할당해주어야 하며 다른곳에서 수정이 불가하다.
	static final String NAME= "BOX";
	public void change(Box b) { // Box b(매개변수) 도 지역변수이다.
		// 매개변수를 포함한 사용자가 정의한 변수를 지역변수라고 한다.
		// 지역변수는 자동으로 초기화되지 않기 때문에 기본값을 저장하고 사용한다.
		// 지역변수의 유효범위는 메서드 내에서만 사용가능
		int test; // local(지역)변수 , 초기화 해줘야함 ex) int test = 0;
		System.out.println(width); // 값이 0으로 초기화 되있어서 오류가 안남
		// System.out.println(test); // 값이 초기화도 안되있고 값도 없어서 오류가 난다. 그래서 int test = 0; 이렇게 초기화 시켜줘야함
		b.depth = 3000;
		
	}

}
