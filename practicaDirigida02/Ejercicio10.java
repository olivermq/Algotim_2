package practicaDirigida02;

import java.util.Scanner;

public class Ejercicio10 {
	
	public static String encriptar(String cadena){

		 String reemplazaa="a";
			String nuevaa="4";
			
			String reemplazae="e";
			String nuevae="3";
			
			String reemplazai="i";
			String nuevai="1";
			
			String reemplazao="o";
			String nuevao="0";
			
			String reemplazau="u";
			String nuevau="8";
			
			
			String resultante1=cadena.replaceAll(reemplazaa, nuevaa);
			String resultante2=resultante1.replaceAll(reemplazae, nuevae);
			String resultante3=resultante2.replaceAll(reemplazai, nuevai);
			String resultante4=resultante3.replaceAll(reemplazao, nuevao);
			String resultante5=resultante4.replaceAll(reemplazau, nuevau);
			
	        return resultante5;
	    }
	
	
	
	
	
	
public static void main(String[] args) {
		
		String usuario="";
		String contra="";
		 Scanner lec=new Scanner(System.in);
		   
		 System.out.println("=============  VERIFICAR USUARIO  ============");
		   System.out.println("Login : ");
		   usuario=lec.nextLine();
		   
		   System.out.print("senha : ");
		   contra=lec.nextLine();
		   
		   if(contra.equals(encriptar(usuario)))
			   System.out.print("USUARIO AUTENTICADO");
		   else	
			   System.out.print("USUARIO NO AUTENTICADO");

		}
}
