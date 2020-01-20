package practicaDirigida01;
import java.util.Scanner;

public class Ejercicio12 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int a,b,c,rest1,rest2,t;
		
		System.out.println("==========  TRIANGULO EXISTENCIA Y CLASIFICACION  ===========");
		System.out.println("Ingrese tres lados para formar un triangulo:");
		a= entrada.nextInt();
		b= entrada.nextInt();
		c= entrada.nextInt();
		
		
		System.out.println(" ");
		if(a!=0 && b!=0 && c!=0) {
			
			if(b>=c) {
				
			if(b-c<a && a<b+c) {
				System.out.println("SI se puede formar un triangulo.");
				if(a==b && b==c && a==c)
					System.out.println("Es un triangulo equilatero.");
				else if(a==b && a!=c)
				System.out.println("Es un triangulo isosceles.");
				else if(b==c && b!=a)
				System.out.println("Es un triangulo isosceles.");
				else if(a==c && a!=b)
				System.out.println("Es un triangulo isosceles.");
				else 
					System.out.println("Es un triangulo escaleno.");
			}
				else
				System.out.println("NO se puede formar un triangulo.");
			
			}
			
			
			if(c>=b) {
			
			if(c-b<a && a<b+c) {
			System.out.println("SI se puede formar un triangulo.");
			if(a==b && b==c && a==c)
			System.out.println("Es un triangulo equilatero.");
		else if(a==b && a!=c)
		System.out.println("Es un triangulo isosceles.");
		else if(b==c && b!=a)
		System.out.println("Es un triangulo isosceles.");
		else if(a==c && a!=b)
		System.out.println("Es un triangulo isosceles.");
		else 
			System.out.println("Es un triangulo escaleno.");
				}
		
			else
			System.out.println("NO se puede formar un triangulo.");
			
			
		}		
		}
		else System.out.println("NO se puede formar un triangulo.");
		}
	}
		



