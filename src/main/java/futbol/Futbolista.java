package futbol;

public abstract class Futbolista implements Comparable<Object>{
	private String nombre;
	private int edad;
	private final String posicion;
	
	
	public Futbolista(String nombre, int edad, String posicion) {
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;
	}
	// cons.
	
	public Futbolista() { 
		this("Maradona", 30, "delantero");
		}
	
	//getter and setters
	
	public String getNombre() {
		return nombre;
		}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
		}
	
	public int getEdad() {
		return edad;
		}
	
	public void setEdad(int edad) {
		this.edad = edad;
		}
	
	public String getPosicion() {
		return posicion;
		}
	
	//metodo abstracto
	
	public abstract boolean jugarConLasManos();
	
	public int compareTo(Object obj) {
		return 0;
		}
	
	public String toString() {
		return "El futbolista " + this.nombre + " tiene " + this.edad + ", y juega de " + this.posicion;
		}
	
	public boolean equals(Futbolista f){
		return this==f;
		}
	
	
	
}