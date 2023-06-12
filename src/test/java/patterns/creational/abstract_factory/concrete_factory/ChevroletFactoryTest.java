package patterns.creational.abstract_factory.concrete_factory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import patterns.creational.abstract_factory.CarFactory;
import patterns.creational.abstract_factory.entities.CarHatch;
import patterns.creational.abstract_factory.entities.CarSport;
import patterns.creational.abstract_factory.entities.CarSuv;

import static org.junit.jupiter.api.Assertions.*;

class ChevroletFactoryTest {

    private CarFactory factory;

    @BeforeEach
    void setUp() {
        factory = new ChevroletFactory();
    }

    @Test
    void createCarHatch() {
        CarHatch response = factory.createCarHatch();

        response.startCar();
        response.speedUp();
        response.speedUp();

        assertEquals(40, response.getVelocity());
        response.toStop();
        assertEquals(0, response.getVelocity());
        response.turnOffCar();
        response.speedUp();

        assertNotNull(response);
        assertEquals("Celta", response.getName());
        assertEquals(1.0, response.getHP());
        assertEquals(3, response.getPorts());
    }

    @Test
    void createCarSport() {
        CarSport response = factory.createCarSport();

        assertNotNull(response);
        assertEquals("Camaro", response.getName());
        assertEquals(5.7, response.getHP());
        assertEquals(3, response.getPorts());
    }

    @Test
    void createCarSuv() {
        CarSuv response = factory.createCarSuv();

        assertNotNull(response);
        assertEquals("Tracker", response.getName());
        assertEquals(2.0, response.getHP());
        assertEquals(5, response.getPorts());
    }
}