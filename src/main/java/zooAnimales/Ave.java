package zooAnimales;

import java.util.ArrayList;
import gestion.*;

public class Ave extends Animal{
	private static ArrayList<Ave> listado;
	public int halcones;
	public int aguilas;
	private String colorPlumas;
	public Ave() {
		listado.add(this);
	}
	public Ave(String nombre, int edad, String habitat, String genero, Zona zona, String colorPlumas) {
		this.nombre = nombre; this.edad = edad; this.habitat = habitat;
		this.genero = genero; this.zona = zona; 
		this.colorPlumas = colorPlumas;
		listado.add(this);
	}
	public void crearHalcon(String nombre, int edad, String genero, Zona zona) {
		halcones += 1;
		new Ave(nombre, edad, "montanas", genero, zona, "cafe glorioso");
	}
	public void crearAguila(String nombre, int edad, String genero, Zona zona) {
		aguilas += 1;
		new Ave(nombre, edad, "montanas", genero, zona, "blanco y amarillo");
	}
	public static int cantidadAves() {
		return Ave.listado.size();
	}
	public String movimiento() {
		return "volar";
	}
	public ArrayList<Ave> getListado(){
		return this.listado;
	}
	public String getColorPlumas() {
		return this.colorPlumas;
	}

	public void setListado(ArrayList<Ave> listado) {
		this.listado = listado;
	}
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}

}
