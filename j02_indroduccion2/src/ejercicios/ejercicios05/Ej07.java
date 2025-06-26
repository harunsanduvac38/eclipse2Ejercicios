package ejercicios.ejercicios05;

public class Ej07 {
	
	public static boolean numArmstrong(int num) {
		
		int numDigit = 0;
		int sumDigit= 0;
		int num2 = num;
		int num3 = num;
		
		while(num2 != 0) {
			num2 = num2/10;
			numDigit++;
		}
		
		for (int i = 1; i<= numDigit; i++) {
			
			sumDigit += Math.pow(num3%10,numDigit);
			num3 = num%10;
		}
		
		if(sumDigit == num) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(numArmstrong(371));
		
	}
}
