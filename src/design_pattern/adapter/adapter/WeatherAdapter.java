package design_pattern.adapter.adapter;

public class WeatherAdapter implements ICelciusToFahrenheit {
	
	private CelciusToFahrenheit cf ;
	
	public WeatherAdapter() {
		cf = new CelciusToFahrenheit();
	}
	
	@Override
	public int toFahrenheit(int celcius) {
		return cf.toFahrenheit(celcius);
	}

}