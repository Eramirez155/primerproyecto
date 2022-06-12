
public class Ejercicio4 {
	/*Declarar dos variables, asignar un valor cualquiera y realizar las siguientes operaciones:
		Mostrar la suma
		Mostrar la multiplicacion
		Mostrar la resta
		Mostrar Division
		 */
	public static void main(String[] args) {
		
    int num1 = 25; 
	int num2 = 0;
	
	
	System.out.println("suma: " + (num1 + num2));
	System.out.println("multiplicacion: " + (num1 * num2));	
	System.out.println("resta: " + (num1 - num2));	
	
	if (num2 != 0) {
	System.out.println("division: " + (num1 / num2));
	}else {
	 System.out.println("no se puede realizar la division, el denominador es 0");
	}	
	}	
}
