package bonus;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Utility {
	public static String getDATE(Calendar c , String pattern) {
			return new SimpleDateFormat(pattern).format(c.getTime());
			
	}
	public static boolean mkdirs(String path) {
		boolean isSuccess = false;
		File file = new File(path);
		boolean isExisted = file.isDirectory();
		if (!isExisted) {
			isSuccess = file.mkdirs();
		}
		return isSuccess;
	}
	public String getComma(long name) {
		return String.format("%,d", name);
	}
		//pattern yyyy-

	public String getComma(double name, int precision) {
		return String.format("%,."+precision+"f",name);
	}
	// Utility bookeac

	public boolean changeFile(String path) {
		boolean isSuccess = false;
		File oldFile = new File(path);
		String fileName = oldFile.getName();
		String name = fileName.substring(0, fileName.lastIndexOf("."));
		String extensionWithDot = fileName.substring(0, fileName.lastIndexOf(".") + 1);
		// 마음에 안들면 아래분을 수정하세요
		name = String.valueOf(System.currentTimeMillis());
		fileName = name + " " + extensionWithDot;
		String parent = oldFile.getParent();
		File newFile = new File(parent, fileName);
		isSuccess = oldFile.renameTo(newFile);
		return isSuccess;
	}
}
