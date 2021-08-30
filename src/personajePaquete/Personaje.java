package personajePaquete;

public abstract class Personaje {
	
	private String nombre;
	private String tipoPoder;
	private int vida;
	private int poder;
	private final String franquicia;
	
	public Personaje(String nombre, String tipoPoder, int vida, int poder, String franquicia) {
		this.setNombre(nombre);
		this.setTipoPoder(tipoPoder);
		this.setVida(vida);
		this.setPoder(poder);
		this.franquicia = franquicia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoPoder() {
		return tipoPoder;
	}

	public void setTipoPoder(String tipoPoder) {
		this.tipoPoder = tipoPoder;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getPoder() {
		return poder;
	}

	public void setPoder(int poder) {
		this.poder = poder;
	}

	public String getFranquicia() {
		return franquicia;
	}
}
