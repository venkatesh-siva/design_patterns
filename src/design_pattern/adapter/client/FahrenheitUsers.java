package design_pattern.adapter.client;

import design_pattern.adapter.adapter.WeatherAdapter;
import design_pattern.adapter.service.WeatherGenerator;

public class FahrenheitUsers implements ICelciusUser{

	WeatherAdapter wa;
	
	WeatherGenerator wg = new WeatherGenerator();
	
	public FahrenheitUsers(WeatherAdapter wa) {
		this.wa = wa;
	}
	
	@Override
	public int checkWeather() {
		int c = wg.generate();
		System.out.println("Adapter converting celcius value of: " + c);
		return wa.toFahrenheit(c);
	}

}
