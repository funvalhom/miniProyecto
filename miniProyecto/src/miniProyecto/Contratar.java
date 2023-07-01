package miniProyecto;

import java.util.ArrayList;
import java.util.Scanner;

public class Contratar {
	ArrayList valor = new ArrayList();
	
	Scanner dato = new Scanner(System.in);
	String[] empleado = {};
	
	public void nombre() {
		String nuevo;
		System.out.print("Ingrese el nombre del empleado: ");
		nuevo = dato.nextLine();
		valor.add(nuevo);
		
	
	}

}
