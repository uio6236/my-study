package com.kh.ex1.run;
import com.kh.ex1.model.vo.*;
public class Run {
	public static void main(String[] args) {
        RemoteControl[] r = new RemoteControl[2];
        r[0] = new Television();
        r[1] = new Audio();
        
        r[0].turnOn();
        r[0].setVolume(7);
        r[0].turnOff();
        System.out.println("---");
        r[1].turnOn();
        r[1].setVolume(5);
        r[1].turnOff();
        r[1].setVolume(5);
    }
}