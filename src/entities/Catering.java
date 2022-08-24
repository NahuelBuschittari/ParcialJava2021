package entities;

import java.util.ArrayList;

public class Catering extends Event{
	private double fixedCost;
	private ArrayList<Menu> mns;
	
	public double getFixedCost() {
		return fixedCost;
	}

	public void setFixedCost(double fixedCost) {
		this.fixedCost = fixedCost;
	}

	public ArrayList<Menu> getMns() {
		return mns;
	}

	public void setMns(ArrayList<Menu> mns) {
		this.mns = mns;
	}
	public void getOveralCosto() {
		double costo=this.getOveralCost()+this.getFixedCost();
		for (Menu menu : this.getMns()) {
			costo=costo+menu.getUnitCost()*menu.getQuantity();
		}
		
	}
}
