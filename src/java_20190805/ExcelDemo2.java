package java_20190805;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelDemo2 {
	// 1. c:\dev\test\test1.txt 파일 읽어오기 - BufferedReader
	// 2. BufferedReader의 readLine() 메서드를 이용해서 한줄씩 읽어온다.
	// 3. 한줄읽은 문자열을 String의 split("#")을 이용해서 String[] 반환받는다.
	// 4. [0] -> cell 입력한다. [1] -> cell 입력한다.
	// [2] -> cell 입력한다. [3] -> cell 입력한다.
	// 2,3,4 반복작업을 해서 엑셀에 입력한다.
	// 5. 엑셀파일명 : c:\dev\test\test2.xls 파일로 저장한다.
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		HSSFWorkbook workbook = new HSSFWorkbook(); 
		HSSFSheet sheet = workbook.createSheet("새파일"); 
		

		try {
			fr = new FileReader("c:\\dev\\test\\test1.txt");
			br = new BufferedReader(fr);
			

			fw = new FileWriter("c:\\dev\\test\\test2.xls");
			bw = new BufferedWriter(fw);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fr != null)
					fr.close();
				if (br != null)
					br.close();
				if (fw != null)
					fw.close();
				if (bw != null)
					bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
