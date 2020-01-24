package agenda;
import java.util.Scanner;

public class Agenda {
	
	static Contacto[] listaContactos=new Contacto[10];
	

	
	public static void agregarContacto(Contacto c) {
		
		for(int i=0;i<listaContactos.length;i++) {
			listaContactos[i]=c;
			System.out.println("Se ha añadido contacto");
			
		}
	}
	
	
	public static void eliminarContacto(Contacto c) {
		for(int i=0;i<listaContactos.length;i++) {
			if(listaContactos[i]!=null && listaContactos[i].equals(c))
				listaContactos[i]=null;
			System.out.println("Se ha eliminado contacto");
		}
	}
	
	
	public static void mostrarLista() {
		for(int i=0;i<listaContactos.length;i++) {
			if(listaContactos[i]!=null)
			System.out.println(listaContactos[i]);
		}
	}
	
	
	public static void main(String[ ] args) {
		int opcion;
		Scanner lec =new Scanner(System.in);
		
		
		String nombre;
		int edad;
		double salario;
		
		Contacto c;
		
		System.out.println(" =======  AGENDA  =======");
		System.out.println(" 1.Agregar contacto");
		System.out.println(" 2.Remover contacto");
		System.out.println(" 3.Mostrar lista de contacto");
		System.out.println(" Es cribe una de las opciones: ");
		opcion=lec.nextInt();
		
		switch(opcion) {
		case 1:
			System.out.println("Escribe un nombre:");
			nombre=lec.nextLine();
			System.out.println("Escribe su edad:");
			edad=lec.nextInt();
			System.out.println("Escribe su sueldo:");
			salario=lec.nextDouble();
			
			c=new Contacto(nombre,edad,salario);
			agregarContacto(c);
			
			break;
		case 2:
			System.out.println("Escribe un nombre: ");
			nombre=lec.nextLine();
			c=new Contacto(nombre,0,0);
			eliminarContacto(c);
			break;
		case 3:
			mostrarLista();
			
		default:
		System.out.println("Opcion invalida !!!");
		
		}
		
		
		
		
	}
	
	
	
}