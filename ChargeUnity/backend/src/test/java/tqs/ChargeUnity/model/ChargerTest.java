package tqs.ChargeUnity.model;

import org.junit.jupiter.api.Test;
import tqs.ChargeUnity.enums.ChargerStatus;
import tqs.ChargeUnity.enums.ChargerType;

import static org.junit.jupiter.api.Assertions.*;

class ChargerTest {

    @Test
    void testChargerToString() {
        Station station = new Station();
        station.setId(1);
        station.setName("Main Station");

        Charger charger = new Charger();
        charger.setId(101);
        charger.setStation(station);
        charger.setStatus(ChargerStatus.AVAILABLE);
        charger.setType(ChargerType.FAST);
        charger.setPricePerKWh(0.25);

        String expected = "Charger 101 - Type: FAST - Status: AVAILABLE - 0.25€/kWh - Station: Main Station;";

        assertEquals(expected, charger.toString());
    }

}