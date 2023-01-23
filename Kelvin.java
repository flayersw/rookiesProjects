package ozi.temperateConvertionTest;

public class Kelvin implements Termometer {
	private double K;
	private double F;
	private double C;	
	private String name;
//	public double convertToCelcius (double K) {
//		// TODO Auto-generated method stub
//		double C = K-273;  
//		return C;
//	}
//
//	public double convertToFahrenheit (double K) {
//		// TODO Auto-generated method stub
//		double F = ((K-273)* (9/5))+32 ;  
//		return F;
//	}
//	
	public String getName() {
		this.name = "Kelvin";
		return name;
	}
	
	public void getConvertionResult(double degree) {	
		this.C = degree;
		C = K-273;  
		F = ((K-273)* (9/5))+32; 
		System.out.println( K + "tempature of Kelvin degree =" + C + "tempature of Celcius degree and " +
		F + "tempature of Fahrenheit degree.");
	}

}
