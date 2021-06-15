package design_pattern.adapter.client;

import design_pattern.adapter.service.WeatherGenerator;

public class CelciusUsers implements ICelciusUser {

	WeatherGenerator wg = new WeatherGenerator();
	
	@Override
	public int checkWeather() {
		return wg.generate();
	}

}
