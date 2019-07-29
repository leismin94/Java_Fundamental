package java_20190729;

public class MathDemo {
	public static void main(String[] args) {
		double d1 = Math.ceil(4.1); // ceil 천장
		System.out.println(d1);
		
		d1 = Math.floor(4.9); // floor 바닥  - 이것보단 int로 캐스팅하는걸 많이 씀
		System.out.println(d1);
		
		
		int a1 = Math.round(4.3f);  // 없으면 long / f붙여주면 int로 반환
		long a2 = Math.round(3.2);
		System.out.println(a1);

		double d2 = 42.789;

		double aa2 = Math.round(d2*100);
		System.out.println(aa2/100);
		
		double d3 = Math.abs(-4.2);
		System.out.println(d3);
		
		double d4 = Math.sqrt(4);
		System.out.println(d4);
		
		double d5 = Math.pow(2, 50);
		System.out.println(d5);
		
		double d6 = Math.random();
		System.out.println(d6);
	}
}
