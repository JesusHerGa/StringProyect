package com.example.demo.models;

public class Persona {
	private String nombre;
	private String telefono;
	
	public Persona() {
		this("","");
	}

	public Persona(String nombre, String telefono) {
		this.nombre = nombre;
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	

}
