package java_20190724;


public class BoxDemo {
	int a; // 인스턴스 변수 생성하고 static 메서드 에서 쓰고싶어 ? ->11.
	static int b;
	public static void main(String[] args) { // args 실행시킬 때
		b = 20; // static 변수 이기 때문에 사용가능
		// Box.NAME = "box2"; - final 변수라 변경 불가 
		
		BoxDemo b = new BoxDemo(); // 이렇게 instance 를 객체생성후 올려주면 가능하다.
		b.a = 10; 
		
		Box b1 = new Box();
		b1.width = 10;
		b1.height = 20;
		b1.depth = 30;
		
		Box b2 = new Box();
		b2.width = 10;
		b2.height = 20;
		b2.depth = 30;
		System.out.println(b1 == b2); 
		
		// == 연산자 reference 일때는 같은 object를 참조하는지 아닌지 여부를 판단하는것
		// But == 연산자 primitive 라면 값만비교
		// false 가 나오는이유?????
		// 같은 object 를 참조하지 않기 때문이다.
		
		Box b3 = b2;
		System.out.println(b3 == b2);
		
		// 위의 b3 = b2; 로 인해 같은 object를 참조하는 b3,b2는 true가 나옴.
		
		
		System.out.printf("width : %d , height : %d, depth : %d%n" , b1.width,b1.height,b1.depth);
		
		b1.change(b1); // call by reference 
		
		System.out.printf("width : %d , height : %d, depth : %d%n" , b1.width,b1.height,b1.depth);
	}
}
