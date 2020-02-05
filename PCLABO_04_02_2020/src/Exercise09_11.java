import java.util.Scanner;

public class Exercise09_11 {
  public static void main(String[] args) {
    Scanner LEC = new Scanner(System.in);
    System.out.println("=========Exercise *9.11 ===========");
    System.out.println("Enter a, b, c,d ,e , f: ");
    double a = LEC.nextDouble();
    double b = LEC.nextDouble();
    double c = LEC.nextDouble();
    double d = LEC.nextDouble();
    double e = LEC.nextDouble();
    double f = LEC.nextDouble();

    LinearEquation equation = new LinearEquation(a, b, c,d,e,f);
    double coc = equation.cociente();

    if (coc ==0) {
      System.out.println("La ecuacion no tiene solucion.");
    }
    else if (coc != 0)
    { 
      System.out.println("La solucion de X es:  " + equation.getX());
      System.out.println("La solucion de Y es:  " + equation.getY());
    }
  }
}


class LinearEquation {
  private double a;
  private double b;
  private double c;
  private double d;
  private double e;
  private double f;

  public LinearEquation(double newA, double newB, double newC, double newD, double newE, double newF) {
    a = newA;
    b = newB;
    c = newC; 
    d = newD; 
    e = newE; 
    f = newF; 
  }
  
  double getA() {
    return a;
  }

  double getB() {
    return b;
  }

  double getC() {
    return c;
  }

  double getD() {
	return d;
  }

  double getE() {
	 return e;
  }

  double getF() {
	  return f;
  }
  
  
  
  double cociente() 
  {
	double cocient;
	cocient=(a*d)-(b*c);
	
	  return cocient;
  }
  
  boolean isSolvable() {
	  double cocient;
	  boolean value;
	  
	  cocient=(a*d)-(b*c);
	  
	  if(cocient!=0)
		  value=true;
	  else	
		  value=false;
    return value;
  }

  double getX() {
      return ( ((e*d)-(b*f) )/ cociente()); 
  }

  double getY() {
	  return ( ((a*f)-(e*c) )/ cociente());
  }
}