package design_pattern.builderpattern;

import design_pattern.builderpattern.enums.EDoors;
import design_pattern.builderpattern.enums.EEngineTypes;
import design_pattern.builderpattern.enums.ESeats;

/**
 * 
 * @author venka
 *
 * This class holds the value of the car that is built using the CarBuilder
 */
public class Car {
	
	public static class CarBuilder {
		
		private String engine;
		
		private String seat;
		
		private String door;

		
		public CarBuilder setEnginer(EEngineTypes engine) {
			this.engine = engine.name();
			return this;
		}


		public CarBuilder setSeat(ESeats seat) {
			this.seat = seat.name();
			return this;
		}


		public CarBuilder setDoor(EDoors door) {
			this.door = door.name();
			return this;
		}
		
		public Car build() {
			return new Car(engine, seat, door);
		}
		
	}
	
	private String engine;
	
	private String seat;
	
	private String door;

	private Car(String engine, String seat, String door) {
		this.engine = engine;
		this.door = door;
		this.seat = seat;
	}
	
	@Override
	public String toString() {
		return new String("Engine: " + engine + " Seats: " + seat + " Doors: " + door);
				
	}
	
}
