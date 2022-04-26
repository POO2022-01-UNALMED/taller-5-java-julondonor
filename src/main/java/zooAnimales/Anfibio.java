package zooAnimales;
import java.util.ArrayList;

public class Anfibio extends Animal{
	private static ArrayList<Anfibio> listado;
	public int ranas;
	public int salamandras;
	private String colorPiel;
	private boolean venenoso;
	public Anfibio() {
		listado.add(this);
	}
	public Anfibio(String nombre, int edad, String habitat, String genero, Zona zona, String colorPiel, boolean venenoso) {
		this.nombre = nombre; this.edad = edad; this.habitat = habitat;
		this.genero = genero; this.zona = zona; 
		this.colorPiel = colorPiel; this.venenoso = venenoso;
		listado.add(this);
	}
	public void crearRana(String nombre, int edad, String genero, Zona zona) {
		ranas += 1;
		new Anfibio(nombre, edad, "selva", genero, zona, "rojo",true);
	}
	public void crearSalamandras(String nombre, int edad, String genero, Zona zona) {
		salamandras += 1;
		new Anfibio(nombre, edad, "selva", genero, zona, "negro y amarillo",false);
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
