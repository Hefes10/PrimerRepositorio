import java.util.Scanner;

public class Vacaciones{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		String nombre = "";
		int clave = 0, antiguedad = 0;

		System.out.println("******************************************************");
		System.out.println("Bienvenido al sistema vacaciones de Coca Cola Company.");
		System.out.println("******************************************************");
		System.out.println("");
		System.out.println("");
		System.out.println("Ingrese su nombre: ");
		nombre = in.nextLine();
		System.out.println("Ingrese su clave: ");
		clave = in.nextInt();
		System.out.println("Ingrese su antiguedad: ");
		antiguedad = in.nextInt();
		if (clave == 1){
			if (antiguedad == 1){
				System.out.println(nombre + " te corresponden 6 dias de vacaciones.");
			} else if (antiguedad >= 2 && antiguedad <= 6){
					System.out.println(nombre + " te corresponden 14 dias de vacaciones.");					
				} else
					System.out.println(nombre + " te corresponden 20 dias de vacaciones.");
		} else if (clave == 2){
				if (antiguedad == 1){
					System.out.println(nombre + " te corresponden 7 dias de vacaciones.");
				} else if (antiguedad >= 2 && antiguedad <= 6){
						System.out.println(nombre + " te corresponden 15 dias de vacaciones.");					
					} else 
						System.out.println(nombre + " te corresponden 22 dias de vacaciones.");
			} else if (clave == 3){
					if (antiguedad == 1){
						System.out.println(nombre + " te corresponden 10 dias de vacaciones.");
					} else if (antiguedad >= 2 && antiguedad <= 6){
						System.out.println(nombre + " te corresponden 20 dias de vacaciones.");					
						} else 
							System.out.println(nombre + " te corresponden 30 dias de vacaciones.");
				} else
					System.out.println("Error! La clave ingresada no es correcta.");
				
	}
}
