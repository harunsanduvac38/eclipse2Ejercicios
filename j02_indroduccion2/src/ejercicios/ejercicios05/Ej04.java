package ejercicios.ejercicios05;

public class Ej04 {
	
	public static boolean numPerfecto (int num) {
		
		int numDiv = 0;
		
		for(int i = 1; i< num; i++) {	
			if(num % i == 0) {
				numDiv+=i;
			}
		}
		
		if(numDiv == num) {
			return true;
		}else {
			return false;
		}
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(numPerfecto(6));
		System.out.println(numPerfecto(28));
		System.out.println(numPerfecto(496));
	}

}
