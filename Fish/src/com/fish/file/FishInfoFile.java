package com.fish.file;
import java.util.ArrayList;
import com.fish.model.FishInfo;

public class FishInfoFile {
	private ArrayList<FishInfo> fishlist = new ArrayList<>();
	private String fileName = "";
	
	public FishInfoFile () {}
	public void addFish(FishInfo fish) {fishlist.add(fish);}
	public ArrayList<FishInfo> getFishlist() {return fishlist;}
	public FishInfo searchFish(String name) {return null;}
	public boolean editFish(String name, FishInfo fish) {return false;}
	public boolean deleteFish(String name) {return false;}
	public void saveFile() {}
	public void openFile() {}
}