package practicaDirigida02;
import java.util.Scanner;


public class Ejercicio08 {
	
	
	public static void main(String[] args) {
		
		Scanner mac=new Scanner(System.in);
		
		int tam;
		System.out.println("Ingresa el tamaño del arreglo:");
		tam=mac.nextInt();

		int arrayNumeros[]=new int[tam];
		
		rellenarArreglo(arrayNumeros);
		mostrarArreglo(arrayNumeros);
		
	}
	
	//Metodo rellena el arreglo
	public static void rellenarArreglo(int numeros[]) { 
		
		Scanner lec=new Scanner(System.in);
		
		System.out.println("Ingresar losd atos del arreglo");
		
		for(int i=0;i<numeros.length;i++) {
			 System.out.println("Ingresa el numero "+(i+1)+ ":");
			numeros[i]=lec.nextInt();
		}
		}
	
	//muestra los datos dela rreglo
	public static void mostrarArreglo(int numeros[]) {
		for(int i=0;i<numeros.length;i++) {
			 System.out.println("Numero "+(i+1)+" : "+numeros[i]);
		}
	}
	
	
}
