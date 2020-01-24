package agenda;

public class Contacto {
	
 public String nombre;	
 int edad;
 double salario;

 public Contacto() {
	 
 }

public Contacto(String nombre,int edad,double salario){
	this.nombre=nombre;
	this.edad=edad;
	this.salario=salario;
}


public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}
public double getSalario() {
	return salario;
}
public void setSalario(double salario) {
	this.salario = salario;
}


public String DatosContacto(){
	return "nombre: "+nombre+"edad: "+edad+"salario: "+salario;
	
}	


}