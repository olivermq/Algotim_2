package practicaDirigida01;
import java.util.Scanner;

public class Ejercicio06 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int diac,mesc,num1,num2,result;
		
		System.out.println("================================");
		System.out.println("Ingrese dia y mes de cumpleaños:");
		diac = entrada.nextInt();
		mesc = entrada.nextInt();
		System.out.print("Ingrese edad:");
		num2= entrada.nextInt();
		
		num1=(diac*100)+mesc;
		
		result=(((num1*2)+5)*50)+num2+365-615;
		
		System.out.println(" ");
		System.out.println("El primer numero es: "+num1);
		System.out.println("El resultado es: "+result);
	}

}

