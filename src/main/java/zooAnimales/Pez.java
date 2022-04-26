package zooAnimales;
import java.util.ArrayList;
import gestion.*;


public class Pez extends Animal{
	private static ArrayList<Pez> listado;
	public int salmones;
	public int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	public Pez() {
		listado.add(this);
	}
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		this.setNombre(nombre); this.setEdad(edad); this.setHabitat(habitat);
		this.setGenero(genero); 
		this.colorEscamas = colorEscamas; this.cantidadAletas = cantidadAletas;
		listado.add(this);
	}
	public static Pez crearSalmon(String nombre, int edad, String genero) {
		salmones += 1;
		return new Pez(nombre, edad, "oceano", genero, "rojo",6);
	}
	public static Pez crearBacalao(String nombre, int edad, String genero) {
		bacalaos += 1;
		return new Pez(nombre, edad, "oceano", genero, "gris",6);
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
