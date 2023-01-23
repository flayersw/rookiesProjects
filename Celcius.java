package ozi.temperateConvertionTest;

public class Celcius implements Termometer  {
	private double C;
	private double K;
	private double F;
	private String name;

//	public double convertToFahrenheit (double C) {
//		// TODO Auto-generated method stub
//		double F =  (C*1.8) + 32;  
//		return F;
//	}
//
//	public double convertToKelvin (double C) {
//		// TODO Auto-generated method stub
//		double K =  C + 273;  
//		return K;
//	}
	
	public String getName() {
		this.name = "Celcius";
		return name;
	}

	
	public void getConvertionResult(double degree) {
		this.C = degree;
		K = C+273;
		F = (C*1.8) + 32;
		System.out.println(C+ "tempature of Celcius degree =" + K + "tempature of Kelvin degree and " +
		F + "tempature of Fahrenheit degree.");
	}



}
