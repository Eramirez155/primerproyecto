
public class Ejercicio3 {
	//Declarar tres variables de tipo entero, asignar un valor cualquiera y mostrar el mayor y el
	//menor.

	public static void main(String[] args) {
		
		int num1 = 15;
		int num2 = 25;
		int num3 = 2;
		
		if (num1 > num2 && num1 > num3) {
		System.out.println("El numero mayor es numero 1 y su valor es " + num1);
		}
		if (num2 > num1 && num2 > num3) {
		System.out.println("El numero mayor es numero 2 y su valor es " + num2);
		}
		if (num3 > num1 && num3 > num2) {
		System.out.println("El numero mayor es numero 3 y su valor es " + num3);
		}
		if (num1 < num2 && num1 < num3) {
		System.out.println("El numero menor es numero 1 y su valor es " + num1);
		}
		if (num2 < num1 && num2 < num3) {
		System.out.println("El numero menor es numero 2 y su valor es " + num2);
		}
		if (num3 < num1 && num3 < num2) {
		System.out.println("El numero menor es numero 3 y su valor es " + num3);
		}	
	

	}
}

