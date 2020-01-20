package practicaDirigida01;
import java.util.Scanner;

public class Ejercicio01 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		float radio,altura,vol,pi;
		
		System.out.println("VOLUMEN DE CILINDRO");
		System.out.print("Ingrese el valor del radio:");
		radio = entrada.nextFloat();
		System.out.print("Ingrese el valor de la altura:");
		altura = entrada.nextFloat();
		
		pi=3.1416f ;
		
		vol=pi*radio*radio*altura;
		
		System.out.println("El volumen es: "+vol);
	}

}

