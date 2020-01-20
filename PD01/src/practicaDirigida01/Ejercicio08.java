package practicaDirigida01;
import java.util.Scanner;

public class Ejercicio08 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int num1,num2,prod,suma;
		
		System.out.println("==========  PRODUCTO O SUMA  ===========");
		System.out.println("Ingrese 2 numeros:");
		num1 = entrada.nextInt();
		num2 = entrada.nextInt();
		
		
		prod=num1*num2;
		suma=num1+num2;
		
		System.out.println(" ");
		if(num1>0 && num2>0) 
			System.out.println("El producto es: "+prod);
			else
				System.out.println("La suma es: "+suma);
		
		
		
	
	}

}

