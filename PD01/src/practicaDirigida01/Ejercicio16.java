package practicaDirigida01;
import java.util.Scanner;

public class Ejercicio16 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int num,suma,r;
		suma=0;
		
		System.out.println("==========  SUMA DE DIGITOS ===========");
		
		System.out.println("Ingrese un numero:");
		num = entrada.nextInt();
	
		
		while(num>0) {
			r=num%10;
			num=num/10;
			suma=suma+r;
		}
		
			System.out.println("La suma de los digitos es: "+suma);
		
		
	}
	}


