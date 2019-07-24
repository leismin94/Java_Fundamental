package java_20190724.aa;

public class Test { // 다른 패키지에서 공개 안하려면 public으로 말고 다른 접근한정자 쓰면됨
	Test(){} // 이렇게 되면 TestDemo 에서 Test t = new Test(); 가 오류남 -> 생성자의 접근한정자 오류
	// 아무것도 입력을 안하고 public class Test{} 라면  compiler는 자동으로 디폴트 생성자를 만들어준다.
	// 이때 생성자의 접근 한정자는 클래스의 접근한정자와 동일하게 만들어 줌.
	// -> public Test(){} 를 만들어준 상태! 비어있으면 그래서 오류가 TestDemo에서 안나는것
	
}
// Test1, Test2 클래스는 Test.java 파일안에서 선언은 가능하나
// 서로 다른 패키지에서 사용할 수 없다.
// Test1, Test2 클래스를 서로 다른 패키지에서 사용하기 위해서는 
// 각각 별도의 파일을 만들어 접근 한정자를 public으로 선언하여 사용해야 한다.
class Test1{ 
	
}
class Test2{
	
}