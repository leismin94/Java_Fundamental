package java_20190801;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamDemo { // IO는 연결한뒤에 끊어줘야한다.
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("C:\\dev\\test\\jdk.exe"); // son - source (출발지)
			FileDemo f = new FileDemo(); // 파일 경로 만들어주고 밑에서 새로운파일 만들자
			f.mkdirs("C:\\dev\\test\\2019\\8\\1");
			// FileOutputStream(String path) 생성자에서 FileNotFoundException
			// 에러의 의미는 경로가 없기 때문에 발생한다
			// 따라서 FileOutPutStream 객체를 생성할 때는 경로가 있는지 체크한 후에 객체를 생성하자
			// 경로가 있어야만 파일아웃풋스트림이 파일을 만들어 준다.
			fos = new FileOutputStream("C:\\dev\\test\\2019\\8\\1\\jdk.exe"); // 해당 경로가 없으면 에러가 난다
																				// son1-destination(도착지)
			int readByte = 0;
			// fis.read() 메서드는 한 바이트 읽어 반환한다.
			// 만약 더 이상 읽을 바이트가 없으면 -1을 반환한다.
			while ((readByte = fis.read()) != -1) { // -1 -> 더이상 읽을것이 없다.
				// fos.write(readByte)는 한 바이트 쓰기
				fos.write(readByte);
			}

		} catch (FileNotFoundException e) { // 이게 하위개념
			e.printStackTrace();

		} catch (IOException e) { // 이게 위에꺼보다 상위개념
			e.printStackTrace();
		} finally {
			try {
				if (fis != null)
					fis.close();
				if (fos != null)
					fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
