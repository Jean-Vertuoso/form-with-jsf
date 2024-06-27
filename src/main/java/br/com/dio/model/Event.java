package br.com.dio.model;

import java.io.Serializable;

public class Event implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private String organization;
	private String place;
	private String date;
	private String schedule;

	public Event() {
	}

	public Event(String name, String organization, String place, String date, String schedule) {
		this.name = name;
		this.organization = organization;
		this.place = place;
		this.date = date;
		this.schedule = schedule;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
}
