package zooAnimales;
import java.util.ArrayList;


public class Pez extends Animal{
	private static ArrayList<Pez> listado;
	public int salmones;
	public int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	public Pez() {
		listado.add(this);
	}
	public Pez(String nombre, int edad, String habitat, String genero, Zona zona, String colorEscamas, int cantidadAletas) {
		this.nombre = nombre; this.edad = edad; this.habitat = habitat;
		this.genero = genero; this.zona = zona; 
		this.colorEscamas = colorEscamas; this.cantidadAletas = cantidadAletas;
		listado.add(this);
	}
	public void crearSalmon(String nombre, int edad, String genero, Zona zona) {
		salmones += 1;
		new Pez(nombre, edad, "oceano", genero, zona, "rojo",6);
	}
	public void crearBacalao(String nombre, int edad, String genero, Zona zona) {
		bacalaos += 1;
		new Pez(nombre, edad, "oceano", genero, zona, "gris",6);
	}
	public static int cantidadPeces() {
		return Pez.listado.size();
	}
	public String movimiento() {
		return "nadar";
	}
	public ArrayList<Pez> getListado(){
		return this.listado;
	}
	public String getColorEscamas() {
		return this.colorEscamas;
	}
	public int getCantidadAletas() {
		return this.cantidadAletas;
	}

	public void setListado(ArrayList<Pez> listado) {
		this.listado = listado;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
}
