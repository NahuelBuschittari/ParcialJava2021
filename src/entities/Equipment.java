package entities;

import java.util.ArrayList;

public class Equipment {
	private String type;
	private double cost;
	private ArrayList<Show> shows;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public ArrayList<Show> getShows() {
		return shows;
	}
	public void setShows(ArrayList<Show> shows) {
		this.shows = shows;
	}
}
