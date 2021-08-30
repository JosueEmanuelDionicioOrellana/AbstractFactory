
public class Dise�o {

	
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
		Dise�o.separadores();
		Dise�o.escrituras("			  "+titulo);
		Dise�o.separadores();
		Dise�o.escrituras("Escoje entre:");
		Dise�o.escrituras("[1]. Heroe");
		Dise�o.escrituras("[2]. Villano");
		Dise�o.separadores();
	}
	
	
	

}
