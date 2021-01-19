package edu.miu.cs.cs401.project.domain;

import java.util.UUID;

public class Airline {
	
	private final String id;
	
	private String code;
	
	private String name;
	
	private String history;

	public Airline(String code, String name, String history) {
		super();
		this.id = UUID.randomUUID().toString();;
		this.code = code;
		this.name = name;
		this.history = history;
	}

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public String getHistory() {
		return history;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHistory(String history) {
		this.history = history;
	}

	@Override
	public String toString() {
		return "Airline [id=" + id + ", code=" + code + ", name=" + name + ", history=" + history + "]";
	}
	
	

}

