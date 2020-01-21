package practicaDirigida01;
import java.util.Scanner;

public class Ejercicio17 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int n1,i,div,suma,r;
		suma=0;
		div=0;
		System.out.println("==========  NUMERO PERFECTO  ===========");
		do {
		System.out.println("Ingrese un numero :");
		n1 = entrada.nextInt();
		}while(n1<0 );
		//SUMA DE DIVISORES
		for(i=1;i<=n1;i++) {
			if(n1%i==0 ) {
				div=div+i;
				System.out.println("SUMA DE DIVISORES "+div);
			}
		}
		
		//
		while(n1>0) {
			r=n1%10;
			n1=n1/10;
			suma=suma+r;
		}
		
		System.out.println("SUMA DE DIgitos "+div);
		
		
		if(suma==div)
			System.out.println("ES UN NUMERO PERFECTO");
		else 
			System.out.println("NOES UN NUMERO EPRFECTO");
		
		
	}
}

