package com.kh.ex2.run;
import com.kh.ex2.controller.PhoneController;

public class Run {
	public static void main(String[] args) {
		PhoneController pc = new PhoneController();
		String[] result = pc.method();
		for(String r : result) {
			System.out.println(r);
			System.out.println();
		}
	}

}
