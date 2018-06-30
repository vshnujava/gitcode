package com.inventory.restfulbasic;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Vehicle {
	@Id
	@GeneratedValue
	private Long id;
	private String veh_type;
	private String veh_model;
	private String veh_brand;
	private Long veh_count;
	
	public Vehicle() {
		super();
	}
	
	public Vehicle(Long id,String veh_type,String veh_model,String veh_brand,Long veh_count) {
		super();
		this.id = id;
		this.veh_type = veh_type;
		this.veh_model = veh_model;
		this.veh_brand = veh_brand;
		this.veh_count = veh_count;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getVeh_type() {
		return veh_type;
	}
	public void setVeh_type(String veh_type) {
		this.veh_type = veh_type;
	}
	public String getVeh_model() {
		return veh_model;
	}
	public void setVeh_model(String veh_model) {
		this.veh_model = veh_model;
	}
	public String getVeh_brand() {
		return veh_brand;
	}
	public void setVeh_brand(String veh_brand) {
		this.veh_brand = veh_brand;
	}
	public Long getVeh_count() {
		return veh_count;
	}
	public void setVeh_count(Long veh_count) {
		this.veh_count = veh_count;
	}
}
