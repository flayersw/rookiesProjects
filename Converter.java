package ozi.temperateConvertionTest;


public class Converter implements TempatureConverter{
private int currentCount = 0;
private Termometer termometers [] = {new Celcius(), new Kelvin(), new Fahrenheit()};


@Override
public void listTermometer() {
	// TODO Auto-generated method stub
	System.out.println("Available Termometer:");
	for (Termometer termometer : termometers)
		System.out.println(termometer.getName());
	
}
@Override
public void doConvertion(String termometerName, double degree) {
	// TODO Auto-generated method stub

	boolean isTermometerFound = false;
	for (Termometer termometer : termometers) {
		if (termometerName.equalsIgnoreCase(termometer.getName())) {
			termometer.getConvertionResult(degree);
			isTermometerFound = true;
		}
	}
	if(!isTermometerFound)
		System.out.println("No such type of termometer found!");

}



	
}
