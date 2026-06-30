package com.kh.tcp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// [1] 포트 번호 지정
		int port = 8000;
		try {
			// [2] ServerSocke 객체 생성
			ServerSocket server = new ServerSocket(port);
			System.out.println("클라이언트 요청 대기중 ... ");
			// [3] 요청 수락 후 Socket 객체 생성
			Socket socket = server.accept();
			// [4] 데이터 통신을 위한 입출력 스트림 생성
			BufferedReader br = new BufferedReader(
								new InputStreamReader(socket.getInputStream()));
			PrintWriter pw = new PrintWriter(socket.getOutputStream());
			// [5] 통신 진행
			while(true) {
				String message = br.readLine();
				System.out.println("클라이언트: " + message);
				System.out.println("보낼 내용 : ");
				String sendMessage = sc.nextLine();
				pw.println(sendMessage);
				pw.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}