package practicaDirigida01;
import java.util.Scanner;

public class Ejercicio09 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int num1,num2,num3,prod,suma;
		
		System.out.println("==========  PRODUCTO O SUMA  ===========");
		System.out.println("Ingrese 3 numeros:");
		num1 = entrada.nextInt();
		num2 = entrada.nextInt();
		num3 = entrada.nextInt();
		
		
		System.out.println(" ");
		if(num1>num2 && num2>num3) 
			System.out.println("El valor intermedio es: "+num2);
			else if(num1>num3 && num3>num2) 
				System.out.println("El valor intermedio es: "+num3);
			else if(num2>num1 && num1>num3) 
					System.out.println("El valor intermedio es: "+num1);
			else if(num2>num3 && num3>num1) 
					System.out.println("El valor intermedio es: "+num3);
			else if(num3>num1 && num1>num2) 
				System.out.println("El valor intermedio es: "+num1);
				else
					System.out.println("El valor intermedio es: "+num2);
	
	}

}

