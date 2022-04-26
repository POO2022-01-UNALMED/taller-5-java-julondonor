package zooAnimales;

import java.util.ArrayList;
import gestion.*;

public class Ave extends Animal{
	private static ArrayList<Ave> listado;
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	public Ave() {
		//listado.add(this);
	}
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		this.setNombre(nombre); this.setEdad(edad); this.setHabitat(habitat);
		this.setGenero(genero); 
		this.colorPlumas = colorPlumas;
		listado.add(this);
	}
	public static Ave crearHalcon(String nombre, int edad, String genero) {
		halcones += 1;
		return new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
	}
	public static Ave crearAguila(String nombre, int edad, String genero) {
		aguilas += 1;
		return new Ave(nombre, edad, "montanas", genero,"blanco y amarillo");
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
