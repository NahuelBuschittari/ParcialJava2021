package entities;

import java.util.ArrayList;

public class Service {
	private String name;
	private double cost;
	private ArrayList<Event> eventos;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public ArrayList<Event> getEventos() {
		return eventos;
	}
	public void setEventos(ArrayList<Event> eventos) {
		this.eventos = eventos;
	}
}
