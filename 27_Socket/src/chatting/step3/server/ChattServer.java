package chatting.step3.server;
/*
 * 여러명의 클라이언트의 접속을 받아서
 * 문자기반의 메세지를 주고받을 수 있는 
 * 서버 측 로직을 작성
 * ::
 * CattServer ---- Process
 *      |----> ServerSocket, ArrayList, Socket
 *      	   broadcast()
 *      
 * ChattThread ---- Thread
 *      |----> Socket, BufferedReader, PrintWriter
 *      
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChattServer {
	//Process의 필드를 지정
	ServerSocket server;
	Socket s;
	ArrayList<Chatthread> list;
	
	public ChattServer() {
		list = new ArrayList<Chatthread>();
	}
	
	public void broadcast(String message) {
		for(Chatthread t : list) {
			t.sendMessage(message);
		}
	}
	
	public void net() {
		try {
			server = new ServerSocket(60000);
			System.out.println("Server Ready....");
			
			while(true) {//윙윙윙...waiting for....
				s=server.accept();
				Chatthread ct = new Chatthread(s,this);
				list.add(ct);
				ct.start();//...작업이 병렬적으로 진행되는 focus!!
			}
		}catch(Exception e) {
			
		}finally {
			
		}
	}
	
	public static void main(String[] args) {
		ChattServer process = new ChattServer();
		process.net();
	}

}
//서버와 연결된 클라이언트와 메세지를 주고받는 일만 전담하는 쓰레드..작업쓰레드
class Chatthread extends Thread{
	Socket s;
	BufferedReader br;
	PrintWriter pw;
	ChattServer chattServer;
		
	public Chatthread(Socket s,ChattServer chattServer) {
		this.s = s;
		this.chattServer = chattServer;
		
		System.out.println(s.getInetAddress()+"님이 접속하셨습니다.");
		chattServer.broadcast(s.getInetAddress()+"님이 채팅방에 들어오셨습니다.");
	}
	
	public void sendMessage(String str) {
		pw.println(str);
	}
	
	public void run() {
		//실제 쓰레드가 작업하는 내용
		try {
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			pw = new PrintWriter(s.getOutputStream(),true);
			
			while(true) {
				String line = br.readLine();
				chattServer.broadcast(line);
			}
		}catch(IOException e) {
			//연결이 끊어지면 로직이 이곳으로...
			System.out.println(s.getInetAddress()+"님이 접속을 끊으셨습니다.");
			chattServer.broadcast(s.getInetAddress()+"님이 채팅방에 나가셨습니다.");
			//
			chattServer.list.remove(this);
			
		}
	}
}
