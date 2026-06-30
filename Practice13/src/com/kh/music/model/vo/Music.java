package com.kh.music.model.vo;

import java.util.Objects;

public class Music implements Comparable<Music>{
	private String title;
	private String singer;
	
	public Music() {}
	public Music(String title, String singer) {
		this.title = title;
		this.singer = singer;
	}
	
	public String getTitlle() {return title;}
	public void setTitlle(String title) {this.title = title;}
	public String getSinger() {return singer;}
	public void setSinger(String singer) {this.singer = singer;}
	
	@Override
	public int hashCode() {
		return Objects.hash(singer, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Music other = (Music) obj;
		return Objects.equals(singer, other.singer) && Objects.equals(title, other.title);
	}
	@Override
	public String toString() {
		return singer + " - " + title;
	}
	/*
	 * 가수명 내림차순 정렬
	 */
	@Override
	public int compareTo(Music o) {
		// 현재객체 : this
		// 다른객체 : 매개변수 o
		return o.singer.compareTo(this.singer);
	}
}