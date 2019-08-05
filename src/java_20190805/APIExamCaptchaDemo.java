package java_20190805;

import java.util.Calendar;
import java.util.Scanner;

import bonus.Utility;

public class APIExamCaptchaDemo {
	public static String console(String msg) {
		System.out.print(msg);
		Scanner sc = new Scanner(System.in);
		return sc.next();
	}
	public static void main(String[] args) {
		
		String id = "F5FIcfAtMFnoACHkuMNl";
		String secret = "hIcb4BwgAs";
		String key = Utility.getCaptchaKey(id,secret);
		boolean result = Utility.isCaptchaImage(id,secret,key);
		if(result) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}	
	
	}
}





