package zooAnimales;
import java.util.ArrayList;
import gestion.*;

public class Anfibio extends Animal{
	private static ArrayList<Anfibio> listado;
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	public Anfibio() {
		listado.add(this);
	}
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		this.setNombre(nombre); this.setEdad(edad); this.setHabitat(habitat);
		this.setGenero(genero);  
		this.colorPiel = colorPiel; this.venenoso = venenoso;
		listado.add(this);
	}
	public static Anfibio crearRana(String nombre, int edad, String genero) {
		ranas += 1;
		return new Anfibio(nombre, edad, "selva", genero,"rojo",true);
	}
	public static Anfibio crearSalamandras(String nombre, int edad, String genero) {
		salamandras += 1;
		return new Anfibio(nombre, edad, "selva", genero, "negro y amarillo",false);
	}
	public static int cantidadAnfibios() {
		return Anfibio.listado.size();
	}
	public String movimiento() {
		return "saltar";
	}
	public ArrayList<Anfibio> getListado(){
		return this.listado;
	}
	public String getColorPiel() {
		return this.colorPiel;
	}
	public boolean getVenenoso() {
		return this.venenoso;
	}

	public void setListado(ArrayList<Anfibio> listado) {
		this.listado = listado;
	}
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}

}
