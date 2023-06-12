package patterns.creational.builder;

import patterns.creational.builder.enums.DwellingType;
import patterns.creational.builder.enums.RoomType;

import java.util.List;

public class Director {

    public void constructHouse(Builder builder) {
        List<RoomType> rooms = List.of(RoomType.ROOM, RoomType.SUITE, RoomType.LIVING_ROOM, RoomType.KITCHEN, RoomType.BATHROOM);

        builder.setDwelling(DwellingType.HOUSE);
        builder.setRooms(rooms);
        builder.setWindows(rooms.size());
        builder.setPool();
        builder.setRecreationArea();
    }

    public void constructLoft(Builder builder) {
        List<RoomType> rooms = List.of(RoomType.ROOM, RoomType.LIVING_ROOM, RoomType.KITCHEN, RoomType.BATHROOM);

        builder.setDwelling(DwellingType.LOFT);
        builder.setRooms(rooms);
        builder.setWindows(rooms.size());
        builder.setPool();
        builder.setRecreationArea();
    }

    public void constructKitnet(Builder builder) {
        List<RoomType> rooms = List.of(RoomType.ROOM, RoomType.KITCHEN, RoomType.BATHROOM);

        builder.setDwelling(DwellingType.KITNET);
        builder.setRooms(rooms);
        builder.setWindows(2);
        builder.setPool();
        builder.setRecreationArea();
    }

    public void constructMansion(Builder builder) {
        List<RoomType> rooms = List.of(RoomType.ROOM, RoomType.ROOM, RoomType.ROOM, RoomType.SUITE, RoomType.LIVING_ROOM, RoomType.LIVING_ROOM, RoomType.KITCHEN, RoomType.BATHROOM, RoomType.LEISURE_ROOM, RoomType.POOL);

        builder.setDwelling(DwellingType.MANSION);
        builder.setRooms(rooms);
        builder.setWindows(rooms.size());
        builder.setPool();
        builder.setRecreationArea();
    }
}
