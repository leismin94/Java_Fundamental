package java_20190716;
// || = or && = and
public class IfDemo {
	public static void main(String[] args) {
		
		//  Run Configuratios - > Arguments -> Program Arguments 
		
		int month = Integer.parseInt(args[0]);
		String season = null;
		if(month == 12 || month == 1 || month == 2) {
			season = "겨울";
		} else if(month >= 3  && month <=5) { // (month 3 == || month == 4 || month == 5)
			season = "봄";
		} else if(month >= 6  && month <=8) { // (month == 6 || month == 7 || month == 8)
			season = "가을";
		} else if(month >= 9  && month <=11) { // (month == 9 || month == 10 || month == 11)
			season = "겨울";
		} else {
			season = "없는 계절";
		}
		System.out.println(month + "월은 " + season + " 입니다");
		
	}
}


/* 괄호 개념을 확실히 하면 좋음 
 if(조건문){
 	조건문일 때 ~;
 } else if(위에가 아니고 ~일때의 조건문 '~'){
 	괄호안의 조건문일 때 ~~실행;
 } else {
 	위와 같은 모든 경우가 아닐 때 ~~실행
 }
 */
 