package com.kh.music.controller;
import java.util.*;

import com.kh.music.model.compare.AscTitle;
import com.kh.music.model.vo.Music;

public class MusicController {
	private List<Music> list = new ArrayList<>();
	public int addList(Music music) {
		list.add(music);
		return 1;
	}
	public int addAtZero(Music music) {
		list.add(0, music);
		return 1;
	}
	public List<Music> printAll() {
		return list;
	}
	public Music searchMusic(String title) {
		for(Music m : list) {
			if (m.getTitlle().equals(title)) return m;
		}
		return null;
	}
	public Music removeMusic(String title) {
		for(int i = 0; i<list.size(); i++) {
			if (list.get(i).getTitlle().equals(title)) {
				return list.remove(i);
			}
		}
		return null;
	}
	public Music setMusic(String title, Music music) {
		for(int i = 0; i < list.size(); i++) {
			//Music m = list.get(i);
			if (list.get(i).getTitlle().equals(title)) {
				/*
				Music m = list.remove(i);
				list.add(i, music);
				return m;
				*/
				return list.set(i, music); // 해당 인덱스에 데이터를 변경(수정)
			}
		}
		return null;
	}
	public int ascTitle() {
		Collections.sort(list, new AscTitle());
		return 1;
	}
	public int descSinger() {
		Collections.sort(list);
		return 1;
	}
}
