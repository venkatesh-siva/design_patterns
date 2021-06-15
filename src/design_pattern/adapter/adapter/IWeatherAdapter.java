package design_pattern.adapter.adapter;

/**
 * 
 * @author venka
 *
 * This is an interface which helps in converting Degree Celcius to required measure
 * 
 */
public interface IWeatherAdapter {

	public int toFahrenheit(int celcuis);
	
	
}
