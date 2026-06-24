package com.kh.ex1.model.vo;

public class Audio implements RemoteControl{
    private int volume;

    public Audio(){}
	@Override
	public void turnOn() {System.out.println("Audio를 켭니다.");}
	@Override
	public void turnOff() {System.out.println("Audio를 끕니다.");}
	@Override
	public void setVolume(int volume) {
		if(0<volume&&volume<10){
            this.volume = volume;
            System.out.println("Audio 볼륨을 "+ volume +"로 조절합니다.");
        }else{
            System.out.println("제한된 크기의 볼륨입니다.");
        }
	}
}