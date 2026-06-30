package com.fish.controller;
import java.util.ArrayList;

import com.fish.file.FishInfoFile;
import com.fish.model.FishInfo;

public class FishController {
	private FishInfoFile fif = new FishInfoFile();
	
	public void addFish(FishInfo fish) {fif.addFish(fish);}
	public ArrayList<FishInfo> getFishList() {return fif.getFishlist();}
	public FishInfo searchFish(String name) {return fif.searchFish(name);}
	public boolean editFish(String name, FishInfo fish) {return fif.editFish(name, fish);}
	public boolean deleteFish(String name) {return fif.deleteFish(name);}
	public void saveFishList() {fif.saveFile();}
	public void openFishList() {fif.openFile();}
}