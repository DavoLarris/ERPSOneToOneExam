package org.cuatrovientos.larris.examenOneToOne.models;

import javax.persistence.*;

@Entity
public class Aircraft {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String model;
	private Float autonomy;
	
	@OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
	private Pilot pilot;

	public Aircraft() {
	}

	public Aircraft(String model, Float autonomy) {
		this.model = model;
		this.autonomy = autonomy;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Float getAutonomy() {
		return autonomy;
	}

	public void setAutonomy(Float autonomy) {
		this.autonomy = autonomy;
	}

	public Pilot getPilot() {
		return pilot;
	}

	public void setPilot(Pilot pilot) {
		this.pilot = pilot;
	}
	
	
	
}
