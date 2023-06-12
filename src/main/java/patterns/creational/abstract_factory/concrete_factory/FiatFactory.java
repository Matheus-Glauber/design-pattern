package patterns.creational.abstract_factory.concrete_factory;

import patterns.creational.abstract_factory.CarFactory;
import patterns.creational.abstract_factory.entities.CarHatch;
import patterns.creational.abstract_factory.entities.CarSport;
import patterns.creational.abstract_factory.entities.CarSuv;

public class FiatFactory implements CarFactory {
    @Override
    public CarHatch createCarHatch() {
        return new CarHatch("Uno", 1.0, 3);
    }

    @Override
    public CarSport createCarSport() {
        return new CarSport("Spider Abarth", 4.5, 3);
    }

    @Override
    public CarSuv createCarSuv() {
        return new CarSuv("Fastback", 2.2, 5);
    }
}
