package patterns.creational.builder;

import patterns.creational.builder.enums.DwellingType;
import patterns.creational.builder.enums.RoomType;

import java.util.List;

public interface Builder {

    void setDwelling(DwellingType type);
    void setRooms(List<RoomType> roomTypes);
    void setWindows(int windowsQty);
    void setDoors(int doorsQty);
    void setPool();
    void setRecreationArea();
}
