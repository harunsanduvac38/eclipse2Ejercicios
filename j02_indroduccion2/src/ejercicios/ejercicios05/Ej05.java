package ejercicios.ejercicios05;

public class Ej05 {
	
	
	public static boolean numAmigable(int num1, int num2) {
		num1 = num1;
		num2 = num2;
		
		
		int numDiv1 = 0;
		int numDiv2 = 0;
		for(int i=1; i<num1;i++) {
			if(num1 % i ==0) {
				numDiv1 += i;
			}
			if(num2 % i == 0) {
				numDiv2 +=i;
			}
		}
		
		if(numDiv1 == numDiv2) return true;
		else return false;		
	}


	public static void main(String[] args) {
		
		
		System.out.println(numAmigable(5, 15));
			
	}
}