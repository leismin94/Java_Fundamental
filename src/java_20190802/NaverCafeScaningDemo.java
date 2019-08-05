package java_20190802;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;

public class NaverCafeScaningDemo {
	public static void main(String[] args) throws IOException{
		URL url = new URL("https://blog.naver.com/PostView.nhn?blogId=harloveysj&logNo=221460034406&redirect=Dlog&widgetTypeCall=true&directAccess=false");
		// 1. InputStream을 InputStreamReader로 바꾼다(1byte를 2byte로 바꾼다)
		// 2. BufferedReader을 BufferedReader 바꾼다/stream chaining
		// 3. BufferedReader로 읽은 정보(html)를 
		//    c:\\dev\\test\\navercafe.html 파일로 저장하기
		
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		
		
		try {
			InputStream is = url.openStream();
			
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			
			fw = new FileWriter("c:\\dev\\test\\navercafe.html");
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw,true);
			
			String readLine = null;
			while((readLine = br.readLine())!= null) {
				pw.println(readLine);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(isr != null)isr.close();
				if(br != null)br.close();
				if(fw != null)fw.close();
				if(bw != null)bw.close();
				if(pw != null)pw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
