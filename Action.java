package ozi.temperateConvertionTest;

import java.util.Scanner;

public class Action {

	private static Scanner in;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		in = new Scanner(System.in);
		Converter converter = new Converter();
		startConverter(converter);
		
	}

	
	private static void startConverter(Converter converter) {
		converter.listTermometer();
		
		System.out.println("Please enter the type of the termometer:");
		String termometerName = in.next(); 
		if(termometerName.equalsIgnoreCase("end"))
			System.exit(0);
		System.out.println("Please enter the degree of the termometer:");
		double degree = in.nextDouble(); 
		converter.doConvertion(termometerName, degree);
		
		startConverter(converter);
	}		
}
