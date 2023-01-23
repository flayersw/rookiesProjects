package ozi.temperateConvertionTest;

public class Fahrenheit implements Termometer{
	private double F;
	private double K;
	private double C;
	private String name;
//	public double convertToCelcius (double F) {
//		// TODO Auto-generated method stub
//		double C = (F-32)/1.8;  
//		return C;
//	}
//	
//	public double convertToKelvin (double F) {
//		// TODO Auto-generated method stub
//		double K =  ((F-32) * (5/9)) + 273;  
//		return K;
//	}
	public String getName() {
		this.name = "Fahrenheit";
		return name;
	}
	
public void getConvertionResult(double degree) {
	this.F = degree;
	K = ((F-32) * (5/9)) + 273; 
	C = (F-32)/1.8;
	System.out.println(F+ "tempature of Fahrenheit degree =" + K + "tempature of Kelvin degree and " +
	C + "tempature of Celcius degree.");
	}

}
