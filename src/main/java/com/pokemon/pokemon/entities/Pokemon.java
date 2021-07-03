package com.pokemon.pokemon.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})

@Entity
public class Pokemon {
	
	@Id
	private long id;
	private String name;
	private String family;
	private String description;
	private long maxCP;
	private long defence;
	private long attack;
	private String weakness;
	private String resistance;
	
	public Pokemon() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pokemon(long id, String name, String family, String description, long maxCP, long defence, long attack,
			String weakness, String resistance) {
		super();
		this.id = id;
		this.name = name;
		this.family = family;
		this.description = description;
		this.maxCP = maxCP;
		this.defence = defence;
		this.attack = attack;
		this.weakness = weakness;
		this.resistance = resistance;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getMaxCP() {
		return maxCP;
	}

	public void setMaxCP(long maxCP) {
		this.maxCP = maxCP;
	}

	public long getDefence() {
		return defence;
	}

	public void setDefence(long defence) {
		this.defence = defence;
	}

	public long getAttack() {
		return attack;
	}

	public void setAttack(long attack) {
		this.attack = attack;
	}

	public String getWeakness() {
		return weakness;
	}

	public void setWeakness(String weakness) {
		this.weakness = weakness;
	}

	public String getResistance() {
		return resistance;
	}

	public void setResistance(String resistance) {
		this.resistance = resistance;
	}

	@Override
	public String toString() {
		return "Pokemon [id=" + id + ", name=" + name + ", family=" + family + ", description=" + description
				+ ", maxCP=" + maxCP + ", defence=" + defence + ", attack=" + attack + ", weakness=" + weakness
				+ ", resistance=" + resistance + "]";
	}
	
	
	

}
