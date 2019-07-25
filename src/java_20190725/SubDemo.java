package java_20190725;

public class SubDemo {
	public static void main(String[] args) {
		Sub s1 = new Sub();  // s1이름을가진 Sub() 라는 클래스 참조하는걸 생성
		s1.makeMoney();  // 부모의 기능
		s1.gotoSchool(); 
		s1.play("starscraft");  // 부모의 메서드를 overriding(재정의)
		
		// s1으로는 부모의 play 호출 불가능하고 재정의한 play 호출가능
		// overriding 시에는 super.~~(~~); 을 써줘서 사용해야함
		
		s1.money = 1000000;
		s1.chicken = "황금올리브";
		
		
		// 부모의 멤버변수, 메서드 접근가능
		// 자식의 멤버변수 접근 불가, 메서드 접근불가
		// 자식의 메서드중에서 오버라이딩된 메서드 접근가능
		Super s2 = new Sub(); // 자식사용 불가
		
		s2.makeMoney();  
		// s2.gotoSchool(); 
		s2.play("starscraft");
		
		s2.money = 1000000;
		// s2.chicken = "황금올리브";
	}
}
