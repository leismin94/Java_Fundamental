package java_20190729;

public class ImplementClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterA i = new ImplementClass(); // 추상때처럼 형변화 해줘야 사용이 가능 - 자식클래스를 이용
		i.mA();
		i.mB();
		i.mC();
		//InterA.PI = 3.15;
		System.out.println(InterA.PI);
	}

}
