package zooAnimales;
import java.util.ArrayList;
import gestion.*;

public class Mamifero extends Animal{
	private static ArrayList<Mamifero> listado;
	public int caballos;
	public int leones;
	private boolean pelaje;
	private int patas;
	public Mamifero() {
		listado.add(this);
	}
	public Mamifero(String nombre, int edad, String habitat, String genero, Zona zona, boolean pelaje, int patas) {
		this.setNombre(nombre); this.setEdad(edad); this.setHabitat(habitat);
		this.setGenero(genero); this.setZona(zona); 
		this.pelaje = pelaje; this.patas = patas;
		listado.add(this);
	}
	public void crearCaballo(String nombre, int edad, String genero, Zona zona) {
		caballos += 1;
		new Mamifero(nombre, edad, "pradera", genero, zona, true, 4);
	}
	public void crearLeon(String nombre, int edad, String genero, Zona zona) {
		leones += 1;
		new Mamifero(nombre, edad, "selva", genero, zona, true, 4);
	}
	public static int cantidadMamiferos() {
		return Mamifero.listado.size();
	}
	public ArrayList<Mamifero> getListado(){
		return this.listado;
	}
	public boolean getPelaje() {
		return this.pelaje;
	}
	public int getPatas() {
		return this.patas;
	}
	public void setListado(ArrayList<Mamifero> listado) {
		this.listado = listado;
	}
	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
}
