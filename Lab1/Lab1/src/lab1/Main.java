package lab1;

import java.util.Scanner;
import library.Car;
import library.Driver;

public class Main {
	   
    public static void main(String[] args) {
    	
    	String country = "USSR";
    	int experience = 5;
           
        System.out.println("1. All cars");
        System.out.printf("2. Drivers with experience more than %d years", experience);
        System.out.println();
        System.out.println("3. Cars manufactured in the USSR");
        System.out.print("Enter a number: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        in.close();
        
        var data = new Data();
        
        switch (number) {
        case 1:
        	printCars(data.getAllCars());
        	break;
        case 2:
        	printDrivers(data.getDriversWithExperience(experience), experience);
        	break;
        case 3:
        	printCars(data.getCarsFromCountry(country));
        	break;
        default:
        	System.out.println("Incorrect data.");
        }
        
    }
    
    private static void printCars(Car[] cars) {
    	System.out.println("cars: ");
    	for (int i = 0; i < cars.length; i++) {
    		if (cars[i] != null) {    			
    			System.out.printf("%s, %s, %d kg, %s, %d h.p., %s,experience: %d", cars[i].brand, cars[i].model, cars[i].weight, cars[i].getEngine().country, cars[i].getEngine().power, cars[i].getDriver().name, cars[i].getDriver().experience);
    			System.out.println();
    		}
    	}
    }
    private static void printDrivers(Driver[] drivers, int experience) {
    	System.out.printf("Drivers with experience more than %d years: ", experience);
    	System.out.println();
    	int i = 0;
    	while (drivers[i] != null) {
    		System.out.printf("%s, : %d", drivers[i].name, drivers[i].experience);
    		System.out.println();
    		i++;
    	}
    }
}