package ejercicios.ejercicios05;

public class Ej03 {
	
	public static int sumaDigitos(int num) {
		
		int suma = 0;
		while (num != 0) {
			suma += num%10;
			num/= 10;
		}
		
		return suma;
	}
	
	
	
	public static void main (String[] args) {
		System.out.println(sumaDigitos(1234));
		System.out.println(sumaDigitos(765));
		System.out.println(sumaDigitos(10));
	}

}
