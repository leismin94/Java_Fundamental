package java_20190801;
//Window - Preferences - editor - Templates
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamDemo2 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream("c:\\dev\\test\\jdk.exe"); // 얘가 에러날 땐 파일이 없으면 에러가 나는게 아니라 경로가 없으면 에러가 난다
			fos = new FileOutputStream("c:\\dev\\test\\2019\\8\\1\\jdk.exe"); 
			int readByteCount = 0;
			byte[] b = new byte[1024*8];
			//fis.read(b) -> FileInpuStream에 1024바이트를 읽어서 b에 저장하고
			// 읽은 바이트수를 반환한다.
			while((readByteCount = fis.read(b))!=-1) {  // 외우ㅓ
				fos.write(b,0,readByteCount); // 외 우 ㅓ
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fis != null) fis.close();
				if(fos != null) fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
