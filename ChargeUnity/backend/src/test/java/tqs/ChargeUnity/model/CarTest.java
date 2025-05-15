package tqs.ChargeUnity.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void testCarToString() {
        Driver driver = new Driver();
        driver.setId(1);
        driver.setName("John Doe");

        Car car = new Car();
        car.setId(101);
        car.setDriver(driver);
        car.setBrand("Tesla");
        car.setModel("Model S");
        car.setBatteryCapacity(100.0);
        car.setBatteryPercentage(80.0);
        car.setConsumptionPerKm(0.2);
        car.setKilometers(50000L);

        String expected = "Car 101 - Driver: John Doe(1);Tesla Model S; Battery Capacity: 100.0kWh; Battery Level: 80.0kWh; Consumption per Km: 0.2kWh/Km; Kilometers: 50000km;";

        assertEquals(expected, car.toString());
    }

}