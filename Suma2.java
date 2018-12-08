import java.util.Scanner;

public class Suma2{
	public static void main(String args[]){
		
	Scanner in = new Scanner(System.in);
	String nombre = "";
	int valor1, valor2, resultado;

	System.out.println("Cual es tu nombre?");
	nombre = in.nextLine();
	System.out.println("Hola " + nombre + ", dame el primer valor para tu suma: ");
	valor1 = in.nextInt();
	System.out.println("dame el segundo valor para tu suma: ");
	valor2 = in.nextInt();
	resultado = valor1 + valor2;
	System.out.println("El resultado de tu suma es: " + resultado);	
	}
}