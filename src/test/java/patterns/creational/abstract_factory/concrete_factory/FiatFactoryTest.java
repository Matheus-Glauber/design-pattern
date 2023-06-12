package patterns.creational.abstract_factory.concrete_factory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import patterns.creational.abstract_factory.CarFactory;
import patterns.creational.abstract_factory.entities.CarHatch;
import patterns.creational.abstract_factory.entities.CarSport;
import patterns.creational.abstract_factory.entities.CarSuv;

import static org.junit.jupiter.api.Assertions.*;

class FiatFactoryTest {

    private CarFactory factory;
    @BeforeEach
    void setUp() {
        factory = new FiatFactory();
    }

    @Test
    void createCarHatch() {
        CarHatch response = factory.createCarHatch();

        assertNotNull(response);
        assertEquals("Uno", response.getName());
        assertEquals(1.0, response.getHP());
        assertEquals(3, response.getPorts());
    }

    @Test
    void createCarSport() {
        CarSport response = factory.createCarSport();

        assertNotNull(response);
        assertEquals("Spider Abarth", response.getName());
        assertEquals(4.5, response.getHP());
        assertEquals(3, response.getPorts());
    }

    @Test
    void createCarSuv() {
        CarSuv response = factory.createCarSuv();

        assertNotNull(response);
        assertEquals("Fastback", response.getName());
        assertEquals(2.2, response.getHP());
        assertEquals(5, response.getPorts());
    }
}