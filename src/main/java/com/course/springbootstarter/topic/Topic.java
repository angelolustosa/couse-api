package com.course.springbootstarter.topic;

public class Topic {
	
	private String id;
	private String nome;
	private String description;
	
	public Topic() {
		
	}

	public Topic(String id, String nome, String description) {
		super();
		this.id = id;
		this.nome = nome;
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	

}
