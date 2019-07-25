package java_20190725.step1;
// 1.요구사항 밀리 세컨드로 경과 시간을 만들어주세요...
// 2.
public class FootStopWatch {
	long startTime;
	long endTime;
	
	public double getElapsedTime() {
		return (double)(endTime - startTime)/1000 ;
	}
	
	public static void main(String[] args) {
		FootStopWatch f1 = new FootStopWatch();
		f1.startTime = System.currentTimeMillis(); // 1970년 1월 1일부터 지금까지 시간을 밀리세컨드로 반환한다.
		
		for(long i = 0; i < 30_000_000_000l; i++) {
		
		}

		f1.endTime = System.currentTimeMillis();
		
		double elapsedTime = f1.getElapsedTime();
		System.out.printf("경과시간 : %.3f", elapsedTime); //.숫자  - 숫자번째 자리 까지 출력
	}
}
