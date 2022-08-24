package entities;

import java.time.LocalDateTime;
import java.util.ArrayList;

public abstract class Event {
	private LocalDateTime eventDate;
	private String location;
	private ArrayList<Service> servicios;
	
	public LocalDateTime getEventDate() {
		return eventDate;
	}
	public void setEventDate(LocalDateTime eventDate) {
		this.eventDate = eventDate;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public ArrayList<Service> getServicios() {
		return servicios;
	}
	public void setServicios(ArrayList<Service> servicios) {
		this.servicios = servicios;
	}
	public double getOveralCost() {
		double costoEv=0;
		for (Service service : this.getServicios()) {
			costoEv=costoEv+service.getCost();}
		return costoEv;
	}
}
