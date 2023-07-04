package miniProyecto;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionEmpleados {

	public static void main(String[] args) {
		
		Scanner valor= new Scanner(System.in);
		
		ArrayList<Empleado> empleados = new ArrayList<>();
		Contratar contratar = new Contratar();
		
		Despedir despedirEmpleado = new Despedir(empleados);
        AumentarSalario aumentarSalario = new AumentarSalario(empleados);
		
			int menu =0;
		
		do {
			
			System.out.println("\nBienvenido. Digite una opcion del 1 al 5: ");
			System.out.println("1- Contratar nuevo empleado ");
			System.out.println("2- Listar empleados ");
		    System.out.println("3- Finalizar  ");
		    
		    
		   menu = valor.nextInt();
		   valor.nextLine();
		   
			switch (menu) {
			
			case 1:
				contratar.nombre();
				
				break;
			
			case 2:
				mostrarListaEmpleados(contratar);
				break;
			
			case 3:
				System.out.println("Ha finalizado el programa");
				break;
			
			default:
				System.out.println("Opcion no valida\n") ;
				break;
			
			}
			
		} while(menu !=3);
	
	}
	public static void mostrarListaEmpleados(Contratar contratar) {
        ArrayList<Empleado> empleados = contratar.getEmpleados();
        System.out.println("\nLista de empleados contratados:");
        for (Empleado empleado : empleados) {
            System.out.println(empleado.getNombre() + ": $" + empleado.getSalario());
        }
	}
	
	

}
