package zooAnimales;
import java.util.ArrayList;
import gestion.*;

public class Reptil extends Animal{
	private static ArrayList<Reptil> listado;
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	public Reptil() {
		listado.add(this);
	}
	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
		this.setNombre(nombre); this.setEdad(edad); this.setHabitat(habitat);
		this.setGenero(genero);
		this.colorEscamas = colorEscamas; this.largoCola = largoCola;
		listado.add(this);
	}
	public static Reptil crearIguana(String nombre, int edad, String genero) {
		iguanas += 1;
		return new Reptil(nombre, edad, "humedal", genero, "verde",3);
	}
	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
		serpientes += 1;
		new Reptil(nombre, edad, "jungla", genero, "blanco",1);
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
