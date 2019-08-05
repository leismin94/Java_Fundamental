package java_20190805;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import bonus.Utility;

public class APIExamShortenURL {
	public static void main(String[] args) {
        String clientId = "bBAakOHLDzkXmpJNbkwQ";//애플리케이션 클라이언트 아이디값";
        String clientSecret = "2ep2dGg_hM";//애플리케이션 클라이언트 시크릿값";
        String oriURL = "https://docs.google.com/spreadsheets/d/1AEbbhYgDMouucbzE4OOxLUXoYLMr2nNyWqE4wq3rTeU/edit#gid=0";
        String url = Utility.getShortenURL(clientId, clientSecret, oriURL);
        // System.out.println(url);
        if(Utility.isQRCode(url, 300, 300)) {
        	System.out.println("QR코드 이미지 생성");
        }else {
        	System.out.println("QR코드 이미지 실패");
        }
    }
}
