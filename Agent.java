package edu.miu.cs.cs401.project.domain;

import java.util.List;
import java.util.UUID;


public class Agent {
	
	private final String id;
	
	private String name;
	
	private List<Passenger> passangers;
	
	private List<Reservation> reservations;

	public Agent(String name, List<Passenger> passangers, List<Reservation> reservations) {
		super();
		this.id = UUID.randomUUID().toString();
		this.name = name;
		this.passangers = passangers;
		this.reservations = reservations;
	}

	public String getName() {
		return name;
	}

	public List<Passenger> getPassangers() {
		return passangers;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPassangers(List<Passenger> passangers) {
		this.passangers = passangers;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

	@Override
	public String toString() {
		return "Agent [id=" + id + ", name=" + name + ", passangers=" + passangers + ", reservations=" + reservations
				+ "]";
	}
	
	

}