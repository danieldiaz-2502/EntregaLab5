package model;

import java.util.Collections;
import java.util.LinkedList;

import processing.core.PApplet;

public class Model {
	private String[] info1;
	private String[] info2;
	private String[] infoPerros1;
	private String[] infoPerros2;
	private String nombre, raza;
	private int id, edad;
	private LinkedList<Perros> perros;
	private PApplet app;

	public Model(PApplet app) {

		this.app = app;
		perros = new LinkedList<Perros>();
		info1 = app.loadStrings("data/datosUno.txt");
		info2 = app.loadStrings("data/datosDos.txt");
	}

	public void crear() {

		for (int i = 0; i < info1.length; i++) {
			infoPerros1 = info1[i].split(",");
			id = Integer.parseInt(infoPerros1[0]);
			nombre = infoPerros1[1];
			edad = Integer.parseInt(infoPerros1[2]);

			for (int j = 0; j < info2.length; j++) {
				infoPerros2 = info2[j].split(",");

				if (id == Integer.parseInt(infoPerros2[0])) {

					raza = infoPerros2[1];

					perros.add(new Perros(id, nombre, raza, edad, app));
				}
			}

		}

	}

	public void cargar(int numero) {

		switch (numero) {

		case 0:
			
			Collections.sort(perros);

			for (int i = 0; i < perros.size(); i++) {

				String id = Integer.toString(perros.get(i).getId());
				String nombre = perros.get(i).getNombre();
				String raza = perros.get(i).getRaza();
				String edad = Integer.toString(perros.get(i).getEdad());

			}

		}

	}

	public LinkedList<Perros> getPerros() {
		return perros;
	}

	public void setPerros(LinkedList<Perros> perros) {
		this.perros = perros;
	}

	

}