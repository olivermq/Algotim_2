package agenda;

public class Agenda {
	
	static Contacto[] listaContactos=new Contacto[10];
	


	public static void main(String[ ] argc) {
		
		
			
			listaContactos[0]=new Contacto("Raul",25,1200.00);	
		
		
	
		
		
	}
	
	public void eliminarContacto(int indice) {
		
		listaContactos[indice]=null;
	}
	
	
	
}
