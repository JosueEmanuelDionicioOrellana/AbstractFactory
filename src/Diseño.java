
public class Diseño {

	
	public static void separadores() {
		System.out.println("+--------------------------------+");
	}
	
	public static void escrituras(String contenido) {
		//Espacios requeridos es de 32
		if (contenido.length()<32) {
			System.out.print("|"+contenido);
				
			for(int i=contenido.length();i<32;i++ ) {
					System.out.print(" ");	
				}
			System.out.println("|");
		}
		else {
			System.out.println("espacio insuficiente");
		}
			

	}
	
	public static void espacios() {
		System.out.println("|								 |");
	}
	
	public static void tituloPersonaje(String titulo) {
		Diseño.separadores();
		Diseño.escrituras("			  "+titulo);
		Diseño.separadores();
		Diseño.escrituras("Escoje entre:");
		Diseño.escrituras("[1]. Heroe");
		Diseño.escrituras("[2]. Villano");
		Diseño.separadores();
	}
	
	
	

}
