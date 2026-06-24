package com.kh.ex2.model;

public abstract class SmartPhone {
    private String maker;

    public SmartPhone(){}
    
    public abstract String printlnformation();
    
    public String getMaker(){
        return this.maker;
    }
    public void setMaker(String maker){
    	this.maker = maker;
    }
}
