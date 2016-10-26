package org.cuatrovientos.larris.examenOneToOne.models;

import javax.persistence.*;

@Entity
public class Pilot {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Integer license;
	
	@OneToOne(mappedBy = "pilot")
	private Aircraft aircraft; //No existe el piloto si no existe el Aircraft
	
	public Pilot() {
	}

	public Pilot(String name, Integer license) {
		this.name = name;
		this.license = license;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getLicense() {
		return license;
	}

	public void setLicense(Integer license) {
		this.license = license;
	}

	public Aircraft getAircraft() {
		return aircraft;
	}

	public void setAircraft(Aircraft aircraft) {
		this.aircraft = aircraft;
	}

	@Override
	public String toString() {
		return "Name=" + name + ", license=" + license;
	}
	
	
}
