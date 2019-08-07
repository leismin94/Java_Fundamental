package java_20190807.echo.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;


public class EchoClient {
	private String ip;
	private int port;
	public EchoClient(String ip, int port) {
		this.ip = ip;
		this.port = port;
	}
	public void run() {
		Socket socket = null;
		try {
			//ip와 port로 버서와 접속을 시도한다.
			//3. 소켓을 생성한다.
			//4. 서버와 연결을 한다.
			socket = new Socket(ip,port);
			
			// 6. 소켓 출력스트림을 생성한 후에 서버에게 메세지를 보낸다.
			OutputStream out = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(out);
			BufferedWriter bw = new BufferedWriter(osw);
			bw.write("맛점~");
			bw.newLine();
			bw.flush();
			
			//9. 소켓으로 입력스트림을 생성한 후에 서버에서 보낸 메세지를 읽는다.
			

			InputStream in = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(in);
			BufferedReader br = new BufferedReader(isr);
			String readLine = br.readLine();
			System.out.println(readLine);
		
			
		} catch (UnknownHostException e) {
			System.out.println("서버주소가 잘못되었습니다.");
		} catch (IOException e) {
			System.out.println("서버 die,,,");
		}
		
	}
	
	public static void main(String[] args) {
		new EchoClient("192.168.0.52",3000).run();
	}
}