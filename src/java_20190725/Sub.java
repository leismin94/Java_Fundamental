package java_20190725;

public class Sub extends Super{
	String chicken; // 멤버변수
	
	public void gotoSchool() {
		System.out.println("Sub gotoSchool");
	}
	
	//overriding 부모의 메서드를 재정의하는 것
	// 1. 반환형 (void) , 메서드이름 (play), 매개변수(String)
	// 2. 접근한정자는 부모보다 자식이 상위이거나 같으면 됨

	public void play(String starscraft) {
		super.play("omok"); // 부모의 기능도 쓰고
		System.out.println("Sub play()"); // 재정의 해서 쓰고 나는 오목말고 스타하고싶어 
	}
}
