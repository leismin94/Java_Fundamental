package java_20190724;
// i18n-> 국제화 Internatonalizatio 18 n // i 18 n
// l10n-> Localization // l 10 n
public class InitializationDemo {
	// static 초기화 블럭 // 1번
	static {
		System.out.println("static area");
		b = 100;
	}
	// instance 초기화 블럭
	// 이렇게 해주면 모든 a 가 10으로 되기 때문에 좋은 방법이 아님
	{
		System.out.println("instance area"); //4번
		a = 10 ;
	}
	
	
	int a;
	static int b;
	static final int C=10; // final변수는 여기서만 가능해 다른데서는 못해
	
	// 메인 메서드가 위에있고 스태틱 초기화가 밑에 있지만
	// 실행문이 static area 먼저 실행되는것으로 보아 메인보다
	// static 초기화문이 먼저 실행되는 것을 알 수 있다.
	
	public static void main(String[] args) { // 2번
		System.out.println("main area");
		InitializationDemo i = new InitializationDemo(1000); //3번
		System.out.println(i.a);
		System.out.println(b);
		System.out.println(C);
	}
	
	// 생성자에서 초기화 할 수 있는 변수는 instance 변수만 가능하다.
	public InitializationDemo(int a) {
		// super();
		System.out.println("생성자"); //5번
		this.a = a;
	}
	
	
}
