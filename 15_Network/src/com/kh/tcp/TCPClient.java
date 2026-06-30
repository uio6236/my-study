package com.kh.tcp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPClient {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// [1] 서버의 정보 (IP주소, 포트번호)
		String serverIp = "localhost";
		int port = 1024;
		try {
			// [2] Socket 객체 생성 (서버 정보)
			Socket socket = new Socket(serverIp, port);
			if (socket != null) {
				// [3] 입출력 스트림 생성
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				PrintWriter pw = new PrintWriter(socket.getOutputStream());
				while(true) {
					System.out.println("보낼 내용: ");
					String sendMessage = sc.nextLine();
					pw.println(sendMessage);
					pw.flush();
					String message = br.readLine();                                                                                                                                                                                                                      
					System.out.println("서버: " + message);
				}
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}