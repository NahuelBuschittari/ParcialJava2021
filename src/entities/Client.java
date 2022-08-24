package entities;

import java.util.ArrayList;

public class Client {
	private String firstName;
	private String lastName;
	private ArrayList<Event> eventos;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public ArrayList<Event> getEventos() {
		return eventos;
	}
	public void setEventos(ArrayList<Event> eventos) {
		this.eventos = eventos;
	}
}
