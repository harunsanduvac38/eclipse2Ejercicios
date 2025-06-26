package ejercicios.ejercicios05;

//Crea un programa que intercambie los valores de dos variables

public class Ej01 {
	
	private int num1;
	private int num2;
	private int numTmp;
	
	public Ej01(int num1, int num2) {
	this.num1 =num1;
	this.num2=num2;
		
	}
	
	
	public int getNumTmp() {
		return numTmp;
	}
	public void setNumTmp(int numTmp) {
		this.numTmp = numTmp;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum1() {
		return this.num1;
	}
	
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public int getNum2() {
		return this.num2;
	}
	
	
	public int cambiarValor1() {
		
		numTmp = num1;
		num1 = num2;	
		return num1;
	}
	
	public int cambiarValor2() {
		num2 = numTmp;
		return num2;
	}
	
	@Override
	public String toString() {
		return "Numero 1: " + cambiarValor1() + " Numero 2: " + cambiarValor2();
	}
	
	
	
	
	
	
	
	public static void main (String[] args) {
		
		Ej01 nums = new Ej01(5,10);
		System.out.println(nums);
		
	}

}
