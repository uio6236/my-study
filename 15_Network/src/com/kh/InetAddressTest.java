package com.kh;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
	// InetAddressTest : IP 정보를 확인할 수 있는 기능을 제공하는 클래스
	public static void main(String[] args) {
		// * localhost => 내PC (현재 컴퓨터)
		try {
			InetAddress localhost = InetAddress.getLocalHost();
			System.out.println(localhost.getHostName());
			System.out.println(localhost.getHostAddress());
			System.out.println("=".repeat(20));
			String domain = "www.naver.com";
			InetAddress[] naverHost =  InetAddress.getAllByName(domain);
			for (InetAddress addr : naverHost) {
				System.out.println(addr.getHostName());
				System.out.println(addr.getHostAddress());
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}
}