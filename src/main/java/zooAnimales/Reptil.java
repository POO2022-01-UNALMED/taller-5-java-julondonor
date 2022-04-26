package zooAnimales;
import java.util.ArrayList;

public class Reptil extends Animal{
	private static ArrayList<Reptil> listado;
	public int iguanas;
	public int serpientes;
	private String colorEscamas;
	private int largoCola;
	public Reptil() {
		listado.add(this);
	}
	public Reptil(String nombre, int edad, String habitat, String genero, Zona zona, String colorEscamas, int largoCola) {
		this.nombre = nombre; this.edad = edad; this.habitat = habitat;
		this.genero = genero; this.zona = zona; 
		this.colorEscamas = colorEscamas; this.largoCola = largoCola;
		listado.add(this);
	}
	public void crearIguana(String nombre, int edad, String genero, Zona zona) {
		iguanas += 1;
		new Reptil(nombre, edad, "humedal", genero, zona, "verde",3);
	}
	public void crearSerpiente(String nombre, int edad, String genero, Zona zona) {
		serpientes += 1;
		new Reptil(nombre, edad, "jungla", genero, zona, "blanco",1);
	}
	public static int cantidadReptiles() {
		return Reptil.listado.size();
	}
	public String movimiento() {
		return "reptar";
	}
	public ArrayList<Reptil> getListado(){
		return this.listado;
	}
	public String getColorEscamas() {
		return this.colorEscamas;
	}
	public int getLargoCola() {
		return this.largoCola;
	}

	public void setListado(ArrayList<Reptil> listado) {
		this.listado = listado;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
}
