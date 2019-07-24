
package java_20190723;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalenderDemo {
	public static String console() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // system.in 이 입력받는것
		return br.readLine();
	}

	public static void main(String[] args) throws IOException {
		Calender c = new Calender();
			
		while (true) {
			System.out.print("날짜를 입력하세요>");
			String readLine = console(); // 커서가 깜빡임
			if(readLine.contentEquals("exit")) break; // exit 를 누르면 break 
			
			String[] data = readLine.split(" "); // 공백으로 문자열을 쪼개겠다
			
			int dataLength = data.length; // 변수처리 해주는게 좋음
			if(dataLength == 1) {		
				// String syear = data[0]; // syear 이라는 변수를 다시 안쓸거기때문에 Integer.parseInt(data[0]); 해주는것이 더 좋다
				// int year = Integer.parseInt(syear); //  문자열로 처리하면 숫자로 계산을 못하기에 int로 바꿔줘야한다.
				int year = Integer.parseInt(data[0]);
				c.print(year);
			}else if(dataLength == 2) {
				// String syear = data[0];
				// String smonth = data[1];
				int year = Integer.parseInt(data[0]); 	// syear 을 int인 year로 바꿔주는 메서드,
				int month = Integer.parseInt(data[1]);
				c.print(year,month);
			}else if(dataLength == 3) {
				// String syear = data[0];
				// String smonth = data[1];
				// String sday = data[2];
				int year = Integer.parseInt(data[0]);
				int month = Integer.parseInt(data[1]);
				int day = Integer.parseInt(data[2]);
				c.print(year,month,day);
			}else {
				
			}
			
		}
	}
}
