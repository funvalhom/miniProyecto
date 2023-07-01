package miniProyecto;

import java.util.Scanner;

public class GestionEmpleados {

	public static void main(String[] args) {
		
		Scanner valor= new Scanner(System.in);
		
		
		Despedir adios = new Despedir();
		Contratar hola = new Contratar();
		AumentarSalario masDinero = new AumentarSalario();
		ListaEmpleados lista = new ListaEmpleados();
	
		
			int menu =0;
		
		do {
			
			System.out.println("Bienvenido. Digite una opcion del 1 al 5: ");
			System.out.println("1- Contratar nuevo empleado ");
			System.out.println("2- Listar empleados ");
		    System.out.println("3- Aumentar salario de un empleado  ");
		    System.out.println("4- Despedir a un empleado ");
		    System.out.println("5- Finalizar ");
		    
		   menu = valor.nextInt();
		   
			switch (menu) {
			
			case 1:
				hola.nombre();
				break;
			
			case 2:
				lista.listado();
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			default:
				System.out.println("Opcion no valida ");
				break;
			
			}
			
		} while(menu !=5 );
	
		
		

	}

}
