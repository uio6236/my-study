package com.kh.after;

public class Controller {
    private Model m1;
    public Controller() {
    	this.m1 = new Model();
    }
    
    public String getInfo() {
    	if (m1 != null) {
    		return "이름 : " + m1.getname();
    	} else {
    		return "정보가 없습니다.";
    	}
    }
}
