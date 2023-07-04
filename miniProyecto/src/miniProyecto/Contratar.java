package miniProyecto;

import java.util.ArrayList;
import java.util.Scanner;

public class Contratar {
	private ArrayList<Empleado> empleados = new ArrayList<>();
	
	Scanner dato = new Scanner(System.in);
	 
	public void nombre() {
		String contratado;
		do {
		System.out.print("Ingrese el nombre del empleado o digite 'detener' para parar: \n");
		contratado = dato.nextLine();
		if(!contratado.equalsIgnoreCase("detener")) {
			System.out.print("Ingrese el salario del empleado\n: ");
			 double salario = dato.nextDouble();
			 dato.nextLine();
			 Empleado empleado = new Empleado(contratado, salario);
			 empleados.add(empleado);	
			 System.out.print("Se ha agregado nuevo empleado\n");
			 System.out.print("Digite un 'detener' para dejar de ingresar empleados nuevos\n");
			}
		}while (!contratado.equalsIgnoreCase("detener"));
		 
	
		
		
	}
	public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

}
