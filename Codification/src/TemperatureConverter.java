
public class TemperatureConverter {

	public static void main(String[] args) {
		
		final int BASE = 32;
		final double CONVERSION_FACTOR = 9.0/5.0;
		
		int celsiusTemperature = 24; // value to be converted 
		double fahrenheitTemperature;
		
		fahrenheitTemperature = celsiusTemperature * CONVERSION_FACTOR + BASE;  // formula for conversion
		
		System.out.println("Celsius Temperature: " + celsiusTemperature);
		System.out.println("Fahrenheit Equivalent Temperature: " + fahrenheitTemperature);
	}

}
