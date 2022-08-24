package entities;

import java.util.ArrayList;

public class Artist {
	private String name;
	private double hourlyCost;
	private ArrayList<Show> shows;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHourlyCost() {
		return hourlyCost;
	}
	public void setHourlyCost(double hourlyCost) {
		this.hourlyCost = hourlyCost;
	}
	public ArrayList<Show> getShows() {
		return shows;
	}
	public void setShows(ArrayList<Show> shows) {
		this.shows = shows;
	}
}
