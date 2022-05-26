package futbol;

public class Portero extends Futbolista {
	public short golesRecibidos;
	public byte dorsal;
	public final String posicion="Portero";

	
	// con
	public Portero(String nombre, int edad, short goles, byte dorsal) {
		super(nombre, edad, "Portero");
		this.golesRecibidos = goles;
		this.dorsal = dorsal;
		
	}
	
	// get y set
	
	public short getGolesRecibidos() {
		return golesRecibidos;
	}

	public void setGolesRecibidos(short golesRecibidos) {
		this.golesRecibidos = golesRecibidos;
	}

	public byte getDorsal() {
		return dorsal;
	}

	public void setDorsal(byte dorsal) {
		this.dorsal = dorsal;
	}

	public String getPosicion() {
		return posicion;
	}

	//met
	
	public String toString() {
		return super.toString()+" con el dorsal " + this.dorsal + ". Le han marcado " + this.golesRecibidos;
		}
	
	public int compareTo(Futbolista obj) {
		return Math.abs(this.golesRecibidos-((Portero)obj).golesRecibidos);
		}
	
	public boolean jugarConLasManos() {
		return true;
		}
	
}