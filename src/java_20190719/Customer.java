package java_20190719;

public class Customer { // 이 안에는 고객에 대한 정보만 앞으로 실행의 main은 별도로 만들예정
	public String name;		// 8종의 변수 제외하면 속성변수이므로 String은 속성변수
	public String email;
	public String phone; // 031 ~~ int로 하면 이상한 숫자가 나와서 문자로 둬야합니다.
	public int age;
	public double balance;
	public boolean isReleased;
	public static double interestRate; // 객체가 생성될 때 존재하는것이 아니라 따로 존재함 , 객체들이 이것을 참조함
	public static final String BANKNAME = "신한은행"; // 이렇게 고객들이 다 같은 값을 가지는 것은 static 해주면 좋다 / final은 한번 해놓으면 변경 불가능하다
	
}
