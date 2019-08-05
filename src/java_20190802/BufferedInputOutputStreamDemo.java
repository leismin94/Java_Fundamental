package java_20190802;
// 멤버변수 잡고 - 트라이 캐치문 만들고 ~
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInputOutputStreamDemo {	
	public static void main(String[] args) {
		FileInputStream fis = null; // 한줄한줄 임포트하는 습관을 들이자
		FileOutputStream fos = null;
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			
			/* 
			 * 1. FileInputStream과 FileOutputStream을 이용하여
			 *    1바이트 읽어서 1바이트 출력한 예제이고 경과시간은 15초
			fis = new FileInputStream("C:\\dev\\test\\java-pdf.zip");
			fos = new FileOutputStream("C:\\dev\\test\\java-pdf-copy.zip");
			int readByte = 0;
			long start = System.currentTimeMillis();
			while((readByte = fis.read())!= -1) {
				fos.write(readByte);
			}
			long end = System.currentTimeMillis();
			System.out.printf("경과시간 %d%n",end-start);
			
			*/
			
			/*
			// 2. BufferedInputStream과 BufferedOutputStream을 이용하여
			//    1바이트 읽어서 1바이트 출력한 예제이고 경과 시간은 0.018초
			//	  BufferedInputStream의 read() 메서드는 1바이트 읽어서
			//    BufferedInputStream의 버퍼(byte[])공간에 저장한다.
			//	  BufferedInputStream의 write() 메서드는 1바이트를 출력하는
			//    것이 아니라 BufferedOutputStream의 버퍼(byte[]) 공간에
			//    가득 차 있으면 출력한다. 만약 다 채워지지 않으면 출력하지 않음.
			//    이런 경우 flush()메서드를 이용하여 출력해야 함.
			//    다 채워지지 않으면 결과는 내지않고 돌고 있다.
			
			fis = new FileInputStream("C:\\dev\\test\\java-pdf.zip");
			fos = new FileOutputStream("C:\\dev\\test\\java-pdf-copy.zip");
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			
			int readByte = 0;
			long start = System.currentTimeMillis();
			while((readByte = bis.read())!= -1) {
				bos.write(readByte);
			}
			// BufferedOutputStream의 버퍼(byte[])는 다 채워지면 자동으로
			// 전송하지만 다 채워지지 않으면 전송하지 않는다. 따라서 다 채워지지
			// 않더라도 버퍼를 비우기 위해서는 flush()메서드를 사용해야 한다.
			// flush()를 안해주면 파일 크기가 달라진다. 나머지가 살아있기떄문
			// while문이 끝나고 해줘야함
			
			bos.flush(); // 꼭 해야한다. 
			long end = System.currentTimeMillis();
			System.out.printf("경과시간 %d%n",end-start);
			*/
			
			/*3. FileInputStream과 FileOutputStream을 이용하여
			     8192바이트 읽어서 8192바이트 출력한 예제이고 경과시간은 0.002초
			*/
			fis = new FileInputStream("C:\\dev\\test\\java-pdf.zip");
			fos = new FileOutputStream("C:\\dev\\test\\java-pdf-copy.zip");
			
			int readByteCount = 0; // 이게 세상 제일 빠름
			byte[] readBytes = new byte[8192];
			long start = System.currentTimeMillis();
			while((readByteCount = fis.read(readBytes))!= -1) { // fis대신 bis를 넣으면 버퍼의 기능을 못쓴다. byte배열을 쓰는순간 못쓴다
				fos.write(readBytes,0,readByteCount);
			}
			long end = System.currentTimeMillis();
			System.out.printf("경과시간 %d%n",end-start);
			
		
			
		} catch (IOException e) { // try catch 문 안에 ioexception이 일어날 리 없는것을 쓰면 에러가 난다 . throw를 못해
			e.printStackTrace();
		} finally {
			try {
				if(fis != null) fis.close();
				if(fis != null) fos.close();
				if(fis != null) bis.close();
				if(fis != null) bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
