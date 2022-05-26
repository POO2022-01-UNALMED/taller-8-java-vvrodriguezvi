package futbol;

public class Jugador extends Futbolista {
	public short golesMarcados;
	public byte dorsal;

	//cons.
	
	public Jugador(String nombre, int edad, String posicion, short goles, byte dorsal) {
		super(nombre, edad, posicion);
		this.golesMarcados=goles;
		this.dorsal = dorsal;
	}

	public Jugador() {
		super();
		golesMarcados = 289;
		dorsal = 7;
	}
	
	//get set
	
	public short getGolesMarcados() {
		return golesMarcados;
	}

	public void setGolesMarcados(short golesMarcados) {
		this.golesMarcados = golesMarcados;
	}

	public String toString() {
		return super.toString()+" con el dorsal " + this.dorsal + ". Ha marcado " + this.golesMarcados;
		}
	
	public byte getDorsal() {
		return dorsal;
	}

	public void setDorsal(byte dorsal) {
		this.dorsal = dorsal;
	}

	public int compareTo(Futbolista obj) {
		return Math.abs(this.getEdad()-((Jugador)obj).getEdad());
		}
	
	public boolean jugarConLasManos() {
		return false;
		}
	
	

}