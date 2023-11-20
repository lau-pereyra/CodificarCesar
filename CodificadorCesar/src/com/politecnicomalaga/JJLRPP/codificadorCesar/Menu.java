package com.politecnicomalaga.JJLRPP.codificadorCesar;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		boolean seguir = true;
		String respuesta ;
		Scanner sc = new Scanner(System.in);
		
		while(seguir) {
			
			System.out.println("  ------------------------");
			System.out.println(" | Decodificador Cesar |");
			System.out.println("  ------------------------");
			System.out.println("");
			System.out.println("a: Codifiica");
			System.out.println("b: descodifica");
			System.out.println("c: estadisticas");
			System.out.println("(cualquier otro): Salir ");
			
			respuesta = sc.nextLine();
			
			
			
// programa a ----------------------------------------------------------------------------------------------------------------------
			
			boolean seguir2 = true;
			
			if (respuesta.compareTo("a") == 0) {
				
	

				System.out.println("Pulsa intro para volver al menu...");
				respuesta = sc.nextLine();
				
				
				
//programa b ------------------------------------------------------------------------------------------------------------------------------				
			}else if(respuesta.compareTo("b") == 0) {
				
					

				
				System.out.println("Pulsa intro para volver al menu...");
				respuesta = sc.nextLine();
				
				
//programa c ------------------------------------------------------------------------------------------------------------------------------				
				

			}else if(respuesta.compareTo("c") == 0) {
					
				
				
				System.out.println("Pulsa intro para volver al menu...");
				respuesta = sc.nextLine();
				
				
//salir	---------------------------------------------------------------------------------------------------------------------------------
			}else {
				
				seguir = false;
				
			}
			
		}
	}

}
