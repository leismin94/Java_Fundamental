package java_20190730;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberManagementDemo {
	private ArrayList<Member> list; // 인스턴스로 객체 생성

	public MemberManagementDemo() { // 생성자에서 초기화
		list = new ArrayList<Member>();
		// TODO Auto-generated constructor stub
	}

	public void print() {
		System.out.println("*************************************************");
		System.out.println("*1. insert 2. update 3. delete 4. search 5. exit*");
		System.out.println("*************************************************");
	}

	public String console(String msg) {
		System.out.print(msg);
		Scanner sc = new Scanner(System.in);
		return sc.next();

	}

	// 1. 아이디를 입력받는다
	// 2. 이름을 입력 받는다.
	// 3. ArrayList에 고객을 추가한다.
	// 4. ArrayList에 있는 고객을 모두 출력한다.
	// 5. print() 메서드를 호출한다.
	// 6. 번호를 선택하세요> 메세지를 출력한 후 키보드 입력을 받게한다.
	private void insert() { // 아래는 생성자에서 나온 내용
		String id = console("아이디를 입력하세요");
		String name = console("이름을 입력하세요");

		// 위에서 받은 id와 name 을 바로 밑에서 넣어줌
		Member m = new Member(id, name);
		list.add(m);

		common();

	}

	// 1. 수정할 아이디를 입력받는다.
	// 2. ArrayList에 있는 고객정보중에서 수정할 아이디를 찾아서 있으면 수정할 이름을 입력받고,
	// ArrayList에서 수정하고, 없으면 수정할 아이디가 없습니다. 메시지를 출력한다.
	// 3. ArrayList에 있는 모든 고객을 출력한다.
	// 4. print() 메서드 호출

	private void update() {
		String updateId = console("수정할 아이디를 입력하세요 : "); // 수정할 아이디 받아옴
		boolean isExisted = false; // 부리언으로 수정할 아이디와 같은게 있는지 없는지 판단하려 변수선언
		for (Member member : list) {
			if (updateId.equals(member.getId())) {
				isExisted = true;
				break;
			}
		}
		if (isExisted) { // 같으면
			String updateName = console("수정할 이름 입력하세요.");
			for (Member member : list) {
				if (updateId.equals(member.getId())) { // 멤버 객체에 있는 아이디 비교
					member.setName(updateName);
					break;
				}
			} // else 삭제한다 -> 이렇게 하면 for문때문에 메시지가 계속 출력된다 / 그래서 for문 밖으로 메시지를 빼주는것
		}
		if (!isExisted) { // 같지 않으면
			System.out.println("수정할 아이디가 없습니다");
		}

		common();

	}
	// 1. 삭제할 아이디를 입력받는다.
	// 2. ArrayList의 Member 객체중에서 삭제할 아이디를 찾아서 있으면 삭제하고
	// 없으면 삭제할 아이디가 없습니다. 메세지 출력
	// 3. ArrayList에 있는 모든 고객을 출력한다.
	// 4. Print() 호출
	// 번호를 선택하세요> 메시지 출력한 후 키보드 입력을 받게한다.

	private void delete() {
		String deleteId = console("삭제할 아이디를 입력하세요 : "); // 수정할 아이디 받아옴
		boolean isExisted = false; // 부리언으로 수정할 아이디와 같은게 있는지 없는지 판단하려 변수선언
		for (Member member : list) { // enhanced for문 -> 안에 있는걸 다 꺼내봄
			if (deleteId.equals(member.getId())) {
				isExisted = true;
				break;
			}
		}
		if (isExisted) {
			for (Member member : list) {
				if (deleteId.equals(member.getId())) {
					list.remove(member);
					break;
				}
			}
		} else {
			System.out.println("삭제할 아이디가 없습니다");
		}

		common();
	}

	private void common() {
		for (Member member : list) {
			System.out.println(member);
		}
		print();
		String index = console("번호를 선택하세요>");
		run(index);
	}

	// 1. 검색할 아이디를 입력받는다.
	// 2. ArrayList에 Member 객체에 검색할 아이디를 찾아서 있으면 출력하고
	// 없으면 검색할 아이디가 없습니다 .출력
	// 3. ArrayList에 있는 모든 고객을 출력한다.
	// 4. Print() 호출
	// 번호를 선택하세요> 메시지 출력한 후 키보드 입력을 받게한다.
	private void search() {
		String searchId = console("검색할 아이디를 입력하세요.");
		System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
		boolean isExisted = false;
		for(Member member : list) {
			if(searchId.equals(member.getId())) {
				System.out.println(member);
				isExisted = true;
				break;
			}
		}
		if(!isExisted) {
			System.out.println("검색할 결과가 없습니다.");
		}
		System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
		print();			
		String index = console("번호를 선택하세요>");
		run(index);
	}

	private void run(String selectedIndex) {
		if (selectedIndex.equals("1")) {
			insert();
		} else if (selectedIndex.equals("2")) {
			update();
		} else if (selectedIndex.equals("3")) {
			delete();
		} else if (selectedIndex.equals("4")) {
			search();
		} else if (selectedIndex.equals("5")) {
			System.out.println("exit!");
		} else {
			System.out.println("다시 입력하세요");
			print();
			String index = console("번호를 선택하세요>");
			run(index);
		}
	}

	public static void main(String[] args) {
		MemberManagementDemo m1 = new MemberManagementDemo();
		m1.print();
		String selectedIndex = m1.console("번호를 선택하세요>");
		m1.run(selectedIndex);
	}

}
