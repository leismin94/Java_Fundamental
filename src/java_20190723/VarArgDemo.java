package java_20190723;

public class VarArgDemo {
	//public VarArgDemo() {} 
	public long sum(int... temp){  //더하거나 곱하는건 long이 좋음 // temp는 배열로 취급
		long sum = 0; // 지역변수 - 메서드 안에서만 사용
			
		for(int t : temp) {
			sum += t;
		}
		
		return sum; // 값을 처음으로 할당하는 것
	}
	public static void main(String[] args) {
		VarArgDemo v1 = new VarArgDemo(); // 이거랑 동일한게 있는지 없는지 확인해야함 만드려면
		
		long s1 = v1.sum(1,2);
		System.out.println(s1);
		long s2 = v1.sum(1,2,3,4);
		System.out.println(s2);
		
	}
}
