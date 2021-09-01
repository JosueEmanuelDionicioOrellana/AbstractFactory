
import java.util.Scanner;

import factoryPaquete.*;

public class Main {


	public static void main(String[] args) {
		AbstractFactory creacion;
		String seleccion;
		String personaje = null;
		String nombre ;
		int poder;
		String tipoPoder;
		String franquicia;
		
		Scanner entrada = new Scanner(System.in);
		
		Diseño.separadores();
		Diseño.escrituras("   Bienvenido a Final battle");
		Diseño.separadores();
		System.out.println("|Agrega tus personajes favoritos |");
		Diseño.escrituras("de los universos de:");
		Diseño.espacios(); 
		Diseño.escrituras("[1]. Marvel");
		Diseño.escrituras("[2]. DC");
		Diseño.escrituras("[3]. Nintendo");
		Diseño.escrituras("[4]. Otro");
		Diseño.separadores();
		seleccion = entrada.nextLine();
		switch(seleccion) {
			
			case "1":
				creacion = new FactoryMarvel();
				Diseño.tituloPersonaje("Marvel");
				seleccion = entrada.nextLine();
		
				Diseño.separadores();
				Diseño.escrituras("Escribe el nombre");
				nombre = entrada.nextLine();
				Diseño.escrituras("Escribe su tipo poder");
				tipoPoder  = entrada.nextLine();
				Diseño.escrituras("Escribe su cantidad de");
				Diseño.escrituras("poder");
				poder = Integer.parseInt(entrada.nextLine());
				Diseño.separadores();
				if(seleccion.equals("1")) {
					personaje=creacion.getHeroe(nombre,tipoPoder,100,poder,"MARVEL").getNombre();
				}else {
					personaje=creacion.getVillano(nombre,tipoPoder,100,poder,"MARVEL").getNombre();
				}
				break;
			case "2":
				creacion = new FactoryDC();
				Diseño.tituloPersonaje("  DC");
				seleccion = entrada.nextLine();
				
				Diseño.separadores();
				Diseño.escrituras("Escribe el nombre");
				nombre = entrada.nextLine();
				Diseño.escrituras("Escribe su tipo poder");
				tipoPoder  = entrada.nextLine();
				Diseño.escrituras("Escribe su cantidad de poder");
				poder = Integer.parseInt(entrada.nextLine());
				Diseño.separadores();
				
				if(seleccion.equals("1")) {
					personaje=creacion.getHeroe(nombre,tipoPoder,100,poder,"DC").getNombre();
				}else {
					personaje=creacion.getVillano(nombre,tipoPoder,100,poder,"DC").getNombre();
				}
				break;
			case "3":
				creacion = new FactoryNintendo();
				Diseño.tituloPersonaje("  DC");
				seleccion = entrada.nextLine();
				
				Diseño.separadores();
				Diseño.escrituras("Escribe el nombre");
				nombre = entrada.nextLine();
				Diseño.escrituras("Escribe su tipo poder");
				tipoPoder  = entrada.nextLine();
				Diseño.escrituras("Escribe su cantidad de poder");
				poder = Integer.parseInt(entrada.nextLine());
				Diseño.separadores();
				
				if(seleccion.equals("1")) {
					personaje=creacion.getHeroe(nombre,tipoPoder,100,poder,"Nintendo").getNombre();
				}else {
					personaje=creacion.getVillano(nombre,tipoPoder,100,poder,"Nintendo").getNombre();
				}
				break;
			case "4":
				creacion = new FactoryOtro();
				Diseño.separadores();
				Diseño.escrituras("Escribe otra franquicia");
				franquicia = entrada.nextLine();
				Diseño.separadores();
				Diseño.tituloPersonaje("  "+franquicia);
				seleccion = entrada.nextLine();

				Diseño.separadores();
				Diseño.escrituras("Escribe el nombre");
				nombre = entrada.nextLine();
				Diseño.escrituras("Escribe su tipo poder");
				tipoPoder  = entrada.nextLine();
				Diseño.escrituras("Escribe su cantidad de poder");
				poder = Integer.parseInt(entrada.nextLine());
				Diseño.separadores();
				
				if(seleccion.equals("1")) {
					personaje=creacion.getHeroe(nombre,tipoPoder,100,poder,franquicia).getNombre();
				}else {
					personaje=creacion.getVillano(nombre,tipoPoder,100,poder,franquicia).getNombre();
				}
				break;	
		}
		Diseño.separadores();
		Diseño.escrituras("Se creo el personaje llamado");
		Diseño.escrituras(personaje);
		Diseño.separadores();
	}
 
}
