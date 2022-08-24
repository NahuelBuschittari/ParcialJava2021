package entities;

import java.util.ArrayList;

public class Menu {
	private String name;
	private double unitCost;
	private int quantity;
	private ArrayList<Catering> cts;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getUnitCost() {
		return unitCost;
	}
	public void setUnitCost(double unitCost) {
		this.unitCost = unitCost;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public ArrayList<Catering> getCts() {
		return cts;
	}
	public void setCts(ArrayList<Catering> cts) {
		this.cts = cts;
	}
}
