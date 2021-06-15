package design_pattern.adapter.adapter;

/**
 * 
 * @author venka
 * 
 * This class implements the ICelciusToFahrenheit
 */
public class CelciusToFahrenheit implements ICelciusToFahrenheit {

	@Override
	public int toFahrenheit(int celcius) {
		return (celcius*(9/5))+32;
	}

}
