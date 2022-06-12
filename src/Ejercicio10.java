
import java.util.Scanner;


public class Ejercicio10 {

	/*Dados tres números, mostrarlos ordenados ascendentemente
	*/
		
	
	public static void main(String[] args) {
		
		int num1;
		int num2;
		int num3;
		
		int superior = 0;
		int medio = 0;
		int inferior = 0;
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("ingrese el primer numero: ");
		num1 = teclado.nextInt();
		System.out.println("ingrese el segundo numero: ");
		num2 = teclado.nextInt();
		System.out.println("ingrese el tercero numero: ");
		num3 = teclado.nextInt();
		
		
		if ((( num1 != num2 && num1 != num3) || (num2 != num3 && num2 != num1)) || ( num3 != num2 && num3 != num1)) {
			if ((( num1 == num2 && num1 != num3) || ( num2 == num3 && num2 != num1)) || (num3 == num1 && num3 != num2 ) ) {	
				System.out.println("Dos valores son iguales");	
			}else if  (num1 > num2 && num1 > num3) {
				superior = num1;
					}if (num2 > num3 && num2 > num1) {
						superior = num2;
					}if (num3 > num1 && num3 > num2) {
						superior = num3;
					}if ( num1 < num2 && num1 < num3) {
						inferior = num1;
					}if ( num2 < num3 && num2 < num1) {
						inferior = num2;
					}if ( num3 < num1 && num3 < num2) {
						inferior = num3;
					}if ( num1 < num2 &&  num2 < num3) { // defino medio
						medio = num2;
					} if ( num1 < num3 && num3 < num2) {
						medio = num3;
					} if ( num1 > num2 && num2 < num3) {
						medio = num1;
					} if (num1 < num2 && num2 > num3) {
						medio = num1;
					}if (num1 > num2 && num2 > num1) {
						medio = num2;
					}if (num1 > num2 && num2 < num3) {
						medio= num3;
					}
					
			
			
			
		
		
		System.out.println("Inferior: " + inferior);
		System.out.println("Medio: " + medio);	
		System.out.println("Mayor: " + superior);	
		} else {
		System.out.println("Los 3 valores ingresados son iguales");	
		}
	}

}
