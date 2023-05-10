package lab1;

import library.Driver;
import library.Engine;
import library.Car;

public class Data {
	
	Driver[] drivers;
	Engine[] engines;
	Car[] cars;
	
	public Data(){
		loadDrivers();
		loadEngines();
		loadCars();
	}
	
	void loadDrivers(){
		this.drivers = new Driver[]{
				new Driver("Ivanov I. P.", 20),
				new Driver("Petrov K.G.", 6),
				new Driver("Sidorov E.M.", 40),
				new Driver("Kovalev P.A.", 3),
				new Driver("Kuznetsova O.Y.", 2)
				};
	}
	
	void loadEngines() {
		this.engines = new Engine[]{
				new Engine("USSR", 60),
				new Engine("Germany", 250),
				new Engine("France", 106),
				new Engine("USSR", 30),
				new Engine("China", 120)
		};
	}
	
	void loadCars() {
		var car1 = new Car("Moskvich", "412", 1000);
		car1.setDriver(this.drivers[2]);
		car1.setEngine(this.engines[0]);
		
		var car2 = new Car("Renault", "Megan", 1200);
		car2.setDriver(this.drivers[0]);
		car2.setEngine(this.engines[2]);
		
		var car3 = new Car("BMW", "X5", 2000);
		car3.setDriver(this.drivers[4]);
		car3.setEngine(this.engines[1]);
		
		var car4 = new Car("Zaporogets", "968", 800);
		car4.setDriver(this.drivers[3]);
		car4.setEngine(this.engines[3]);
		
		var car5 = new Car("Geely", "Coolray", 1400);
		car5.setDriver(this.drivers[1]);
		car5.setEngine(this.engines[4]);
		
		
		this.cars = new Car[] {car1, car2, car3, car4, car5};
	}
	
	public Car[] getAllCars() {
		return this.cars;
	};
	
	public Driver[] getDriversWithExperience(int exp) {
		Driver[] filteredDrivers = new Driver[this.drivers.length];
		int j = 0;
		for (int i = 0; i < this.drivers.length; i++) {
			  if (this.drivers[i].experience > exp) {
				  filteredDrivers[j] = this.drivers[i];
				  j++;
			  }
			}
		return filteredDrivers;
	}
	
	public Car[] getCarsFromCountry(String country) {
		Car [] filteredCars = new Car[this.cars.length];
		int j = 0;
		for (int i = 0; i < this.cars.length; i++) {
			if (this.cars[i].getEngine().country == country) {
				filteredCars[j] = this.cars[i];
				j++;
			}
		}
		return filteredCars;
	}
}