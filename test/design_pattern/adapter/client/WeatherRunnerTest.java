package design_pattern.adapter.client;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WeatherRunnerTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		WeatherRunner wr = new WeatherRunner();
		
		System.out.println(wr.celciusUser());
		
		System.out.println(wr.fahrenheitUser()+" F");
	}

}
