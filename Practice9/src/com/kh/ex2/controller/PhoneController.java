package com.kh.ex2.controller;
import com.kh.ex2.model.*;
public class PhoneController {
	private String[] result = new String[2];
	
	public String[] method() {
		Phone[] phoens = new Phone[2];
		phoens[0] = new GalaxyNote9();
		phoens[1] = new V40();
		
		int index = 0;
		for(Phone p : phoens) {
			// Phone 타입은 printInformation() 알 수 없음!
			if (p instanceof GalaxyNote9) {
				result[index++] = ((GalaxyNote9)p).printlnformation();
			} else if (p instanceof V40) {
				result[index++] = ((V40)p).printlnformation();
			}
		}
		return result;
	}
}
