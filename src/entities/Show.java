package entities;

public class Show extends Event{
	private String type;
	private String name;
	private double durationHs;
	private Equipment eq;
	private Artist ar;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDurationHs() {
		return durationHs;
	}
	public void setDurationHs(double durationHs) {
		this.durationHs = durationHs;
	}
	public Equipment getEq() {
		return eq;
	}
	public void setEq(Equipment eq) {
		this.eq = eq;
	}
	public Artist getAr() {
		return ar;
	}
	public void setAr(Artist ar) {
		this.ar = ar;
	}
	
	public void getOveralCosto() {
		double costo=this.getOveralCost()+this.getEq().getCost()+this.getAr().getHourlyCost()*this.getDurationHs();
		
	}
}
