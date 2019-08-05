package java_20190802;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PrinterWriterDemo {
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fr = new FileReader("c:\\dev\\test\\kic.txt");
			br = new BufferedReader(fr);
			
			fw = new FileWriter("c:\\dev\\test\\kic-copy.txt");
			bw = new BufferedWriter(fw);
		
			String readLine = null;
			while((readLine = br.readLine())!= null) {
				bw.write(readLine);
				bw.newLine(); // 쓴다음에 한줄의 끝마다 개행하라
			}
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fr != null)fr.close();
				if(br != null)br.close();
				if(fw != null)fw.close();
				if(bw != null)bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}
}
