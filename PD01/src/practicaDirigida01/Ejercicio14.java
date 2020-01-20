package practicaDirigida01;
import java.util.Scanner;

public class Ejercicio14 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int i,numero,cont;
		cont=0;
		
		System.out.println("==========  NUMERO PRIMO O NO  ===========");
		
		System.out.println("Ingrese un numero:");
		numero = entrada.nextInt();
		
		for(i=1;i<=numero;i++) {
			if(numero%i==0) 
				cont++;
		}
		
		if(cont>2) 
			System.out.println("El numero NO ES PRIMO");
		
		else
			System.out.println("El numero ES PRIMO");
	}
	}


