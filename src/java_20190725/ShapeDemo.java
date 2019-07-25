package java_20190725;

public class ShapeDemo {
	// 추상 클래스 다형성
	public static void run(Shape s) {
		s.draw();
	}
	
	public static void main(String[] args) {
		// Shape s = new Shape();  - shape 는 추상이므로 객체생성 못하므로 new shape 못함
		
		// Rectangle r = new Rectangle();
		
		// Shape s1 = new Rectangle();
		// Shape s1 = r;    // 렉탱글 안에 Shape가 있는지 확인
		// s1.draw(); // 렉텡글의 드로우 불러옴
		
		run(new Rectangle());  //?
		
		// Shape s2 = new Circle();
		// s2.draw(); // 서클의 드로우 불러옴
		
		run(new Circle());
	}
}
