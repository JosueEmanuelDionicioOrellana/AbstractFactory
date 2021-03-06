
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
		
		Dise?o.separadores();
		Dise?o.escrituras("   Bienvenido a Final battle");
		Dise?o.separadores();
		System.out.println("|Agrega tus personajes favoritos |");
		Dise?o.escrituras("de los universos de:");
		Dise?o.espacios(); 
		Dise?o.escrituras("[1]. Marvel");
		Dise?o.escrituras("[2]. DC");
		Dise?o.escrituras("[3]. Nintendo");
		Dise?o.escrituras("[4]. Otro");
		Dise?o.separadores();
		seleccion = entrada.nextLine();
		switch(seleccion) {
			
			case "1":
				creacion = new FactoryMarvel();
				Dise?o.tituloPersonaje("Marvel");
				seleccion = entrada.nextLine();
		
				Dise?o.separadores();
				Dise?o.escrituras("Escribe el nombre");
				nombre = entrada.nextLine();
				Dise?o.escrituras("Escribe su tipo poder");
				tipoPoder  = entrada.nextLine();
				Dise?o.escrituras("Escribe su cantidad de");
				Dise?o.escrituras("poder");
				poder = Integer.parseInt(entrada.nextLine());
				Dise?o.separadores();
				if(seleccion.equals("1")) {
					personaje=creacion.getHeroe(nombre,tipoPoder,100,poder,"MARVEL").getNombre();
				}else {
					personaje=creacion.getVillano(nombre,tipoPoder,100,poder,"MARVEL").getNombre();
				}
				break;
			case "2":
				creacion = new FactoryDC();
				Dise?o.tituloPersonaje("  DC");
				seleccion = entrada.nextLine();
				
				Dise?o.separadores();
				Dise?o.escrituras("Escribe el nombre");
				nombre = entrada.nextLine();
				Dise?o.escrituras("Escribe su tipo poder");
				tipoPoder  = entrada.nextLine();
				Dise?o.escrituras("Escribe su cantidad de poder");
				poder = Integer.parseInt(entrada.nextLine());
				Dise?o.separadores();
				
				if(seleccion.equals("1")) {
					personaje=creacion.getHeroe(nombre,tipoPoder,100,poder,"DC").getNombre();
				}else {
					personaje=creacion.getVillano(nombre,tipoPoder,100,poder,"DC").getNombre();
				}
				break;
			case "3":
				creacion = new FactoryNintendo();
				Dise?o.tituloPersonaje("  DC");
				seleccion = entrada.nextLine();
				
				Dise?o.separadores();
				Dise?o.escrituras("Escribe el nombre");
				nombre = entrada.nextLine();
				Dise?o.escrituras("Escribe su tipo poder");
				tipoPoder  = entrada.nextLine();
				Dise?o.escrituras("Escribe su cantidad de poder");
				poder = Integer.parseInt(entrada.nextLine());
				Dise?o.separadores();
				
				if(seleccion.equals("1")) {
					personaje=creacion.getHeroe(nombre,tipoPoder,100,poder,"Nintendo").getNombre();
				}else {
					personaje=creacion.getVillano(nombre,tipoPoder,100,poder,"Nintendo").getNombre();
				}
				break;
			case "4":
				creacion = new FactoryOtro();
				Dise?o.separadores();
				Dise?o.escrituras("Escribe otra franquicia");
				franquicia = entrada.nextLine();
				Dise?o.separadores();
				Dise?o.tituloPersonaje("  "+franquicia);
				seleccion = entrada.nextLine();

				Dise?o.separadores();
				Dise?o.escrituras("Escribe el nombre");
				nombre = entrada.nextLine();
				Dise?o.escrituras("Escribe su tipo poder");
				tipoPoder  = entrada.nextLine();
				Dise?o.escrituras("Escribe su cantidad de poder");
				poder = Integer.parseInt(entrada.nextLine());
				Dise?o.separadores();
				
				if(seleccion.equals("1")) {
					personaje=creacion.getHeroe(nombre,tipoPoder,100,poder,franquicia).getNombre();
				}else {
					personaje=creacion.getVillano(nombre,tipoPoder,100,poder,franquicia).getNombre();
				}
				break;	
		}
		Dise?o.separadores();
		Dise?o.escrituras("Se creo el personaje llamado");
		Dise?o.escrituras(personaje);
		Dise?o.separadores();
	}
 
}
