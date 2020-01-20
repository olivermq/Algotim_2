package practicaDirigida01;
import java.util.Scanner;

public class Ejercicio15 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int num,aux,resto,numInv;
		numInv=0;
		
		System.out.println("==========  NUMERO CAPICUA O NO ===========");
		
		System.out.println("Ingrese un numero:");
		num = entrada.nextInt();
		aux=num;
		
		while(aux>0) {
			resto=aux%10;
			aux=aux/10;
			numInv=numInv*10+resto;
		}
		
		if(numInv==num)
			System.out.println("ES CAPICUA");
		else 
			System.out.println("NO ES CAPICUA");
		
		
	}
	}
