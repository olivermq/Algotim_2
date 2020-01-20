package practicaDirigida01;
import java.util.Scanner;

public class Ejercicio13 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int n1,n2,i;
		
		System.out.println("==========  DIVISORES EN COMUN  ===========");
		do {
		System.out.println("Ingrese dos numeros :");
		n1 = entrada.nextInt();
		n2 = entrada.nextInt();
		}while(n1<=0 && n2<=0);
		
		for(i=1;i<=n1;i++) {
			if(n1%i==0 && n2%i==0) {
				System.out.println(i);
			}
		}
	}
}

