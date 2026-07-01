package com.kh.music.controller;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import com.kh.music.model.compare.AscTitle;
import com.kh.music.model.vo.Music;

public class MusicController {
	private List<Music> list = new ArrayList<>();
	private final String FILE_NAME = "musiclist.txt";
	public MusicController() {
		// 프로그램이 처음 실행되었을 때 (현재 객체가 생성되었을 때)
		// 파일에 저장된 내용을 읽어와서 리스트에 추가
		fileLoad();
	}
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
	/*
	 * 현재까지 등록된 전체 곡 목록을 파일에 저장합니다.
	 */
	public int fileSave() {
		// 
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
			// {가수명}/{곡명}
			for(Music m : list) {
				String data = m.getSinger() + "/" + m.getTitlle() + "\n";
				bw.write(data);
				bw.flush();
			}
		} catch(IOException e) {
			e.printStackTrace();
			return 0;
		}
		return 1;
	}
	private void fileLoad() {
		try(BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
			String content;
			while((content = br.readLine()) != null) {
				if (content.contains("/")); {
					String[] datas = content.split("/");
					addList(new Music(datas[1], datas[0]));
				}
			}
		} catch(IOException e) {
			e.printStackTrace();
		} 
	}
}
