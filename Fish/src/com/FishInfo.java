package com;

public class FishInfo {
	private String name;
	private String season;
	private String habitat;
	private String bait;
	private int releaseSize;
	
	public FishInfo() {}

	public FishInfo(String name, String season, String habitat, String bait, int releaseSize) {
		this.name = name;
		this.season = season;
		this.habitat = habitat;
		this.bait = bait;
		this.releaseSize = releaseSize;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getBait() {
		return bait;
	}

	public void setBait(String bait) {
		this.bait = bait;
	}

	public int getReleaseSize() {
		return releaseSize;
	}

	public void setReleaseSize(int releaseSize) {
		this.releaseSize = releaseSize;
	}

	@Override
	public String toString() {
		return name + ", " + season + ", " + habitat + ", " + bait + ", " + releaseSize;
	}
	public void inform() {
		System.out.printf("물고기 이름 : %s\n 낚시 시즌 : %s\n 주서식지 : %s\n 추천 미끼 : %s\n 방생 기준 : %dcm",
				name, season, habitat, bait, releaseSize);
	}
}
