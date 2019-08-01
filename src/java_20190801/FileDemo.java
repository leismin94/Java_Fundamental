package java_20190801;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileDemo {
	public void mkdirs(String path) {
		File f1 = new File("C:\\dev\\test\\01\\02");
		boolean isExisted = f1.isDirectory();
		if (!isExisted) {
			f1.mkdirs();
		}
	}

	public String getComma(long name) {
		return String.format("%,d", name);
	}

	public String getComma(double name, int precision) {
		return String.format("%,f" + precision + "f", name);
	}

	public void changeFile(String path) {
		// path-> c:\\dev\\tst.jdk.exe -> c:\\deiv\test\123123.exe
		File f1 = new File(path);
		// f1.getPath -> 전체경로+파일이름
		String fileName = f1.getName();
		String name = fileName.substring(0, fileName.lastIndexOf("."));
		String extension = fileName.substring(0, fileName.lastIndexOf(".") + 1);
		name = String.valueOf(System.currentTimeMillis());
		fileName = name + " " + extension;
		// f1 디렉토리를 반환 -> C:\dev\test
		String parent = f1.getParent();
		File f2 = new File(parent, fileName);
		f1.renameTo(f2);
	}

	public static void main(String[] args) {
		/*
		FileDemo f1 = new FileDemo();
		f1.mkdirs("C:\\dev\\test\\01\\02");
		
		File f2 = new File("c:\\dev\\test\\jdk-11.0.3_windows-x64_bin.exe");
		// File f2 = new File("c:\\dev\\test","jdk-11.0.3_windows-x64_bin.exe");
		long fileSize = f2.length();
		System.out.println(f1.getComma(fileSize)+"KB");
		boolean isFile = f2.isFile();
		if(isFile) {
			String path = f2.getPath(); //f2의 전체 파일경로를 반환한다.
			System.out.println(path);
			if(path.endsWith("pdf")) {
				System.out.println("PDF 파일");
			}else if(path.endsWith("exe")) {
				System.out.println("응용프로그램");
			}else if(path.endsWith("txt")) {
				System.out.println("텍스트문서");
			} 
		}else {
			System.out.println("파일폴더");
		}
		
		File f3 = new File("c:\\dev\\test\\jdk.exe");
		f2.renameTo(f3); // f2파일을  f3파일 이름으로 변경
		
		f1.changeFile("c:\\dev\\test\\jdk.exe");
		
		*/
		
		File f4 = new File("c:\\dev\\test","jdk");
		String fileName = f4.getName();
		String path = f4.getPath();
		String Parent = f4.getParent();
		System.out.println(fileName);
		System.out.println(path);
		System.out.println(Parent);
		System.out.println(f4.lastModified());
		
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(f4.lastModified());
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int day = c.get(Calendar.DATE);
		System.out.println(year+"-"+month+"-"+day);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM월-dd일 a hh:mm E요일");
		String date = sdf.format(c.getTime());
		System.out.println(date);
		
		File f5 = new File("c:\\dev\\test");
		String[] lists = f5.list();
		for (String list : lists) {
			File f6 = new File(f5,list); // 앞에는 파일이름 전 모든 경로 뒤는 파일
			String name = f6.getName();
			if(f6.isDirectory()) {
				System.out.println(name+"-디렉토리");
			}else {
				long fileSize = f6.length()/1024;
				c.setTimeInMillis(f6.lastModified());
				String lastModified = sdf.format(c.getTime());
				System.out.println(name+"\t"+fileSize+"K"+"\t"+lastModified);
			}
			System.out.println(list); // 파일이름을 가져옴 -> 이걸로 파일객체를 만들어서 정보들을 캐내야함
		}
		
	}
}
