package practicaDirigida01;
import java.util.Scanner;

public class Ejercicio11 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int m,n,q,rest1,rest2;
		
		System.out.println("==========  MULTIPLOS  ===========");
		System.out.println("Ingrese tres numeros m, n y q respectivamente:");
		m = entrada.nextInt();
		n = entrada.nextInt();
		q = entrada.nextInt();
		
		rest1=m%n;
		
		rest2=m%q;
		
		System.out.println(" ");
		if(rest1==0 && rest2==0) 
			System.out.println("m SI es multiplo de n y q.");
			else
			System.out.println("m NO es multiplo de n y q.");
		
	}

}

