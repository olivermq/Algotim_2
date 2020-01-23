package practicaDirigida02;

import java.util.Scanner;

public class Ejercicio09 {
	
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
	
	 public static String desencriptar(String cadena){

		 String reemplazaa="4";
			String nuevaa="a";
			
			String reemplazae="3";
			String nuevae="e";
			
			String reemplazai="1";
			String nuevai="i";
			
			String reemplazao="0";
			String nuevao="o";
			
			String reemplazau="8";
			String nuevau="u";
			
			
			String resultante1=cadena.replaceAll(reemplazaa, nuevaa);
			String resultante2=resultante1.replaceAll(reemplazae, nuevae);
			String resultante3=resultante2.replaceAll(reemplazai, nuevai);
			String resultante4=resultante3.replaceAll(reemplazao, nuevao);
			String resultante5=resultante4.replaceAll(reemplazau, nuevau);
			
	        return resultante5;
	    }
	
	
	
	public static void main(String[] args) {
		
		String cadena="";
		
		 Scanner lec=new Scanner(System.in);
		   
		   System.out.print("Ingrese Texto : ");
		   cadena=lec.nextLine();
		   
	        System.out.println("Encriptado: "+encriptar(cadena));
	        System.out.println("Desencriptado: "+desencriptar(cadena));
		}
}
