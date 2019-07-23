package java_20190723;

public class Admin { // instance 변수는 감춰야함 안그러면 사람들이 나쁜마음을 먹고 조작하는 일이 발생함.
	private String id;
	private String pwd;
	private String email;
	private int level;
	
	//디폴트 생성자(default constructor)
	public Admin() {
		super(); //부모 클래스의 디폴트 생성자 호출 - 모든 생성자엔 이게 숨겨져 있음
	}
	
	//생성자 (constructor)
	//생성자는 반환값이 없고, 이름은 클래스 이름과 동일하게  Admin=Admin
	//역할은 인스턴스 변수 초기화 ( 값을 처음으로 할당하는것)
	public Admin(String id, String pwd, String email, int level) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.email = email;
		this.level = level;
	}
	
	public Admin(String id, String pwd) {
		// this.id = id;
		// this.pwd = pwd;
		this(id,pwd,null,0); // 다른 생성자 호출 String - null
		// this 용법 2가지
		// 1. 자기 자신 객체 = this.
		// 2. 다른 생성자 호출 = this(~~)
	}
	
	// instance 변수의 getter setter 생성방법 단축키
	// alt + shift + s -> r
	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getPwd() {
		return pwd;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getLevel() {
		return level;
	}

}
