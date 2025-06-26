package ejercicios.ejercicios05;

public class Ej02 {
	

	private int a;
	private int b;
//	
//	public int getA() {
//		return a;
//	}
//
//
//	public void setA(int a) {
//		this.a = a;
//	}
//
//
//	public int getB() {
//		return b;
//	}
//
//
//	public void setB(int b) {
//		this.b = b;
//	}

	public Ej02(int a, int b) {
		this.a = a;
		this.b = b;
	}
	

	public  void cambiarValor() {
//		cambValor1(a);
//		cambValor2(b);
		a += b;
		b = a - b;
		a -= b;
		
	}
//	public void cambValor1(int a) {
//		a += b;
//		b = a - b;
//		a -= b;
//		setA(a);
//			
//	}
//	public void cambValor2(int b) {
//		a += b;
//		b = a - b;
//		a -= b;
//		setB(b);
//	}
	
	@Override
	public  String toString() {
		return "valor a: " + a + " valor b: " + b;
 	}
	
	
	
	public static void main (String[] args) {
		
//		int a = 99;
//		int b = 10;
//		System.out.println(a + "  " + b);
//		
//		
//		a += b;  // 109
//		b = a - b; 	// 99
//		a -= b;
//		
//		System.out.println(a + "  " + b);

		Ej02 nums = new Ej02(5,9);
		nums.cambiarValor();
		
		System.out.println(nums);
	}



	

}
