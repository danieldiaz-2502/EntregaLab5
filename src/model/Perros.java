package model;

import processing.core.PApplet;

public class Perros implements Comparable<Perros>{
	
	private String nombre, raza;
	private int ID, edad, posX, posY;
	private PApplet app;
	

	public Perros( int id, String nombre, String raza, int edad, PApplet app) {
		
		
		this.app=app;	
		this.nombre = nombre;
		this.edad = edad;
		this.raza = raza;
		this.ID = id;
		posX = 30;
	
	}
	
	public void dibujar(int posY) {
		
		app.fill(255);
		app.text(ID, posX,posY+10);
		app.text(nombre, posX +100 , posY+10);
		app.text(raza,posX+100*2, posY+10);
		app.text(edad, posX+100*3, posY+10);
	
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getId() {
		return ID;
	}

	public void setId(int id) {
		this.ID = id;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getPosy() {
		return posX;
	}

	public void setPosx(int posx) {
		this.posX = posx;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}

	@Override
	public int compareTo(Perros perro) {
		// TODO Auto-generated method stub
		return this.ID -perro.getId();
	}

	
	

	

}