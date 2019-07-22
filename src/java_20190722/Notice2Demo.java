package java_20190722;

import java_20190722.aa.Notice; // 서로 다른 패키지일 경우 class를 가져다 쓰려면 import 해줘야함

public class Notice2Demo extends Notice{
	public static void main(String[] args) {
		Notice n1 = new Notice();
		// n1.hit = 1;
		n1.number = 1; // 빈 초록동그라미 - public - 서로 다른 패키지에서도 접근가능
		// n1.title = "프로텍트"; 
		// n1.regdate = "프라이베이트"; 
		// private 는 같은 클래스 내에서만 접근가능하다.
		
		Notice2Demo n2 = new Notice2Demo();   // 부모클래스인 Notice에서 접근할 수 있는 접근 한정자는 public 하고 protected만 가져다 쓸 수 있다. (상속시)
		n2.number = 1;						// 상속 받을 시 모든것을 사용 가능하지만 public & protected 한정	
		n2.title = "공지사항입니다";
	
	}
}


// public 만 접근이 가능하다