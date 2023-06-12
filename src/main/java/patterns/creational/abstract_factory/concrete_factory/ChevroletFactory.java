package patterns.creational.abstract_factory.concrete_factory;

import patterns.creational.abstract_factory.CarFactory;
import patterns.creational.abstract_factory.entities.CarHatch;
import patterns.creational.abstract_factory.entities.CarSport;
import patterns.creational.abstract_factory.entities.CarSuv;

public class ChevroletFactory implements CarFactory {
    @Override
    public CarHatch createCarHatch() {
        return new CarHatch("Celta", 1.0, 3);
    }

    @Override
    public CarSport createCarSport() {
        return new CarSport("Camaro", 5.7, 3);
    }

    @Override
    public CarSuv createCarSuv() {
        return new CarSuv("Tracker", 2.0, 5);
    }
}
