package com.fish.controller;
import java.io.*;
import java.util.ArrayList;
import com.fish.model.FishInfo;

public class FishController {
	private ArrayList<FishInfo> fishList = new ArrayList<FishInfo>();
	private String fileName = "fish_info.txt";

	public void addFish(FishInfo fish) {
		fishList.add(fish);
	}
	public ArrayList<FishInfo> getFishList() {
		return fishList;
	}
	public FishInfo searchFish(String name) {
		for(FishInfo fish : fishList) {
			if(fish.getName().equals(name)) {return fish;}
		}
		return null;
	}
	public boolean editFish(String name, FishInfo fish) {
		for(int i = 0; i < fishList.size(); i++) {
			if(fishList.get(i).getName().equals(name)) {
				fishList.set(i, fish);
				return true;
			}
		}
		return false;
	}
	public boolean deleteFish(String name) {
		for(int i = 0; i < fishList.size(); i++) {
			if(fishList.get(i).getName().equals(name)) {
				fishList.remove(i);
				return true;
			}
		}
		return false;
	}
	public void saveFile() {
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
			for(FishInfo fish : fishList) {
				bw.write(fish.toString());
				bw.newLine();
			}
			bw.flush();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	public void openFile() {
		File file = new File(fileName);
		if(!file.exists()) {
			System.out.println("저장된 파일이 없습니다.");
			return;
		}
		fishList.clear();
		try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			String line;
			while((line = br.readLine()) != null) {
				String[] data = line.split(",");
				if(data.length == 5) {
					String name = data[0];
					String season = data[1];
					String habitat = data[2];
					String bait = data[3];
					int releaseSize = Integer.parseInt(data[4]);
					FishInfo fish = new FishInfo(name, season, habitat, bait, releaseSize);
					fishList.add(fish);
				}
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}