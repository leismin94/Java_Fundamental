package java_20190722.aa;

public class Notice {
	public int number;
	protected String title;
	int hit;
	private String regdate;

	public static void main(String[] args) {
		Notice n1 = new Notice();
		n1.hit = 1; // 파란세모 - default - 같은 패키지 내에서 접근 가능
		n1.number = 1; // 빈 초록동그라미 - public - 서로 다른 패키지에서도 접근가능
		n1.title = "프로텍트"; // 노랑마름모 - protected - 서로 다른 패키지이면서 상속받은 경우에는 접근 가능
		// n1.regdate = "프라이베이트"; // 안보임 - private - 같은 클래스 내에서만 접근 가능
		// private 는 같은 클래스 내에서만 접근가능하다.
	}
}
