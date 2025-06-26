package ejercicios.ejercicios05;
import java.util.Random;

public class Ej06 {
	public static void main(String[] args) {
		
//		Random random = new Random();
//		int numRandom = random.nextInt(6) +1;
		
		int numRandom = (int)(Math.random() * 6  +1);
		
		System.out.println("El dado:" + numRandom);
	}

}
