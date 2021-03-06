package zooAnimales;
import java.util.ArrayList;


public class Mamifero extends Animal{
	private static ArrayList<Mamifero> listado = new ArrayList<Mamifero>();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	public Mamifero() {
		listado.add(this);
	}
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		this.setNombre(nombre); this.setEdad(edad); this.setHabitat(habitat);
		this.setGenero(genero);  
		this.pelaje = pelaje; this.patas = patas;
		listado.add(this);
	}
	public static Mamifero crearCaballo(String nombre, int edad, String genero) {
		caballos += 1;
		return new Mamifero(nombre, edad, "pradera", genero, true, 4);
	}
	public static Mamifero crearLeon(String nombre, int edad, String genero) {
		leones += 1;
		return new Mamifero(nombre, edad, "selva", genero, true, 4);
	}
	public static int cantidadMamiferos() {
		return Mamifero.listado.size();
	}
	public ArrayList<Mamifero> getListado(){
		return Mamifero.listado;
	}
	public boolean isPelaje() {
		return this.pelaje;
	}
	public int getPatas() {
		return this.patas;
	}
	public void setListado(ArrayList<Mamifero> listado) {
		Mamifero.listado = listado;
	}
	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
}
