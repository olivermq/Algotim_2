package practicaDirigida01;
import  java.util.Scanner ;

public class Ejercicio18 {

		
public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int x1,x2,y1,y2,x3,y3;
		double distance1,distance2,distance3,preresult1,preresult2,preresult3;
		
		System.out.println("========  TIPO DE TRIANGULO SEGUN SU LADO ========");
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
		
		System.out.println("Ingrese el valor del tercer punto (x3,y3)");
		System.out.print("Ingrese el valor de x3:");
		x3 = entrada.nextInt();
		System.out.print("Ingrese el valor de y3:");
		y3 = entrada.nextInt();
		
		
		preresult1=((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1));
		
		distance1=Math.sqrt(preresult1);
		
		
		preresult2=((x3-x1)*(x3-x1))+((y3-y1)*(y3-y1));
		
		distance2=Math.sqrt(preresult2);
		
		
		preresult3=((x2-x3)*(x2-x3))+((y2-y3)*(y2-y3));
		
		distance3=Math.sqrt(preresult3);
		
		
		if(distance1==distance2 &&distance2==distance3) 
			System.out.println("EL TRIANGULO ES EQUILATERO ");
			
			else if(distance1==distance2 && distance1!=distance3)
				System.out.println("EL TRIANGULO ES ISOSCELES ");
			else if(distance1==distance3 && distance1!=distance2)
				System.out.println("EL TRIANGULO ES ISOSCELES ");
			else if(distance2==distance3 && distance2!=distance1)
				System.out.println("EL TRIANGULO ES ISOSCELES ");
			else 
				System.out.println("EL TRIANGULO ES ESCALENO ");

		
		System.out.println(" ");
		
	}
}
