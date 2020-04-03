package view;

import java.util.LinkedList;

import controller.ControllerModel;
import model.Perros;
import processing.core.PApplet;

public class Main extends PApplet {
	
	private ControllerModel controller;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PApplet.main("view.Main");

	}
	
	public void settings() {
		size(600,500);
		
	}
	
	public void setup() {
		controller = new ControllerModel(this);
		controller.crear();

	}
	
	public void draw() {
		background(0);
		
		for (int i = 0; i < controller.perros().size(); i++) {
			controller.perros().get(i).dibujar((50 * i));
		}

	}
	
	public void mousePressed() {
		

		controller.cargar(0);

	}
	

}
