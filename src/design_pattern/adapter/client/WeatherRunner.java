package design_pattern.adapter.client;

import design_pattern.adapter.adapter.WeatherAdapter;

public class WeatherRunner {

	CelciusUsers cu = new CelciusUsers();
	
	WeatherAdapter wa = new WeatherAdapter();
	
	FahrenheitUsers fu = new FahrenheitUsers(wa);
	
	public int celciusUser() {
		return cu.checkWeather();
	}
	
	public int fahrenheitUser() {
		return fu.checkWeather();
	}
}
