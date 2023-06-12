package patterns.creational.abstract_factory;

import patterns.creational.abstract_factory.entities.CarHatch;
import patterns.creational.abstract_factory.entities.CarSport;
import patterns.creational.abstract_factory.entities.CarSuv;

public interface CarFactory {
    CarHatch createCarHatch();
    CarSport createCarSport();
    CarSuv createCarSuv();
}
