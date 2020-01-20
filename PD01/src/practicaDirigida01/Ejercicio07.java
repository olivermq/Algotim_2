package practicaDirigida01;
import java.util.Scanner;

public class Ejercicio07 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int num,resto,result;
		
		System.out.println("==========  PAR O IMPAR  ===========");
		System.out.println("Ingrese un numero:");
		num = entrada.nextInt();
		
		
		resto=num%2;
		System.out.println(" ");
		if(resto==0) 
			System.out.println("El numero es par");
			else
				System.out.println("El numero es impar");
		
		
		
	
	}

}

