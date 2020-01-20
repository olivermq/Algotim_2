package practicaDirigida01;
import java.util.Scanner;

public class Ejercicio04 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int x1,x2,y1,y2;
		double distance,preresult;
		
		System.out.println("========  DISTANCIA ENTRE 2 PUNTOS  ========");
		System.out.println(" ");
		System.out.println("Ingrese el valor del primer punto (x1,y1)");
		System.out.print("Ingrese el valor de x1:");
		x1 = entrada.nextInt();
		System.out.print("Ingrese el valor de y1:");
		y1 = entrada.nextInt();
		
		System.out.println("Ingrese el valor del segundo punto (x2,y2)");
		System.out.print("Ingrese el valor de x2:");
		x2 = entrada.nextInt();
		System.out.print("Ingrese el valor de y2:");
		y2 = entrada.nextInt();
		
		preresult=((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1));
		
		distance=Math.sqrt(preresult);
		
		
		System.out.println(" ");
		System.out.println("La distancia entre los puntos es: "+distance);
		
	}

}
