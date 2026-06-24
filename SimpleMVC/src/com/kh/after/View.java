package com.kh.after;

public class View {
    private Controller c;
    public View() {
    	this.c = new Controller();
    }
    public void display() {
    	String result = c.getInfo();
    	System.out.println(result);
    }
}
