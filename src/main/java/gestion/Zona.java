package gestion;
import java.util.ArrayList;
import zooAnimales.*;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private ArrayList<Animal> animales;
	
	
	public Zona() {}
	public Zona(String nombre, Zoologico zoo, ArrayList<Animal> animales) {
		this.nombre = nombre; this.zoo = zoo; this.animales = animales;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public Zoologico getZoo() {
		return zoo;
	}
	public ArrayList<Animal> getAnimales(){
		return animales;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}
	public void setAnimales(ArrayList<Animal> animales) {
		this.animales = animales;
	}
	
	public void agregarAnimales(Animal animal) {
		this.animales.add(animal);
	}
	public int cantidadAnimales() {
		return animales.size();
	}
}
