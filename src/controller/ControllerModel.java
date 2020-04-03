package controller;

import java.util.LinkedList;
import model.Model;
import model.Perros;
import processing.core.PApplet;

public class ControllerModel {
	
	private Model logic;
	private PApplet app;
	
	public ControllerModel(PApplet app) {
		this.app = app;
		logic = new Model(app);
		
	}

	public void cargar(int numero) {
		logic.cargar(numero);
		
	}

	public void crear() {
		
		logic.crear();
		
	} 

	public LinkedList<Perros> perros() {
		return logic.getPerros();
	}


}