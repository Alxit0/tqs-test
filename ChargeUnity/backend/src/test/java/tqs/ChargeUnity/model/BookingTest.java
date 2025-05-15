package tqs.ChargeUnity.model;

import org.junit.jupiter.api.Test;
import tqs.ChargeUnity.enums.BookingStatus;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class BookingTest {

    @Test
    void testBookingToString() {
        Driver driver = new Driver();
        driver.setId(1);
        driver.setName("John Doe");

        Trip trip = new Trip();
        trip.setId(101);

        Charger charger = new Charger();
        charger.setId(202);

        Booking booking = new Booking();
        booking.setId(1);
        booking.setTrip(trip);
        booking.setDriver(driver);
        booking.setCharger(charger);
        booking.setStartTime(LocalDateTime.of(2023, 10, 1, 10, 0));
        booking.setEndTime(LocalDateTime.of(2023, 10, 1, 11, 0));
        booking.setPrice(50.0);
        booking.setStatus(BookingStatus.COMPLETED);

        String expected = "Booking 1 - Trip: 101\n" +
                "Driver: John Doe\n" +
                "Charger: 202\n" +
                "Start Time: 2023-10-01T10:00\n" +
                "End Time: 2023-10-01T11:00\n" +
                "Price: 50.0\n" +
                "Status: COMPLETED";

        assertEquals(expected, booking.toString());
    }

}