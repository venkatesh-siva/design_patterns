package design_pattern.adapter.service;

import java.util.Random;

/**
 * 
 * @author venka
 *
 * This class generates the weather in Celcius
 */
public class WeatherGenerator implements IWeatherGenerator {

	Random random = new Random();
	
	@Override
	public int generate() {
		return random.nextInt(50);
	}
	
}
