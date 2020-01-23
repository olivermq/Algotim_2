package practicaDirigida02;

import java.util.Scanner;


public class Ejercicio01 {

    public static String concatenar(String a, String b, String c){
        String res;
        res=a+b+c;
        return res;
    }
    
    public static void main(String[] args) {
    	
   Scanner lec=new Scanner(System.in);
   
   System.out.print("Palabra 1: ");
   String palabra1=lec.next();
   System.out.print("Palabra 2: ");
   String palabra2=lec.next();
   System.out.print("Palabra 3: ");
   String palabra3=lec.next();
   
        System.out.println("Concatenacion: "+concatenar(palabra1,palabra2,palabra3));
    }
    
}