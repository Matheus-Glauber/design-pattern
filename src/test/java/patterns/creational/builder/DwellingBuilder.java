package patterns.creational.builder;

import patterns.creational.builder.entities.Dwelling;
import patterns.creational.builder.enums.DwellingType;
import patterns.creational.builder.enums.RoomType;

import java.util.List;

public class DwellingBuilder implements Builder {

    private DwellingType dwellingType;
    private List<RoomType> rooms;
    private int roomsQty;
    private int windowsQty;
    private int doorsQty;
    private boolean doTheyHaveAPool;
    private boolean doTheyHaveARecreationArea;

    @Override
    public void setDwelling(DwellingType type) {
        this.dwellingType = type;
    }

    @Override
    public void setRooms(List<RoomType> roomTypes) {
        this.roomsQty = roomTypes.size();
        this.rooms = roomTypes;
    }

    @Override
    public void setWindows(int windowsQty) {
        this.windowsQty = windowsQty;
    }

    @Override
    public void setDoors(int doorsQty) {
        this.doorsQty = doorsQty;
    }

    @Override
    public void setPool() {
        this.doTheyHaveAPool = rooms.contains(RoomType.POOL);
    }

    @Override
    public void setRecreationArea() {
        this.doTheyHaveARecreationArea = rooms.contains(RoomType.LEISURE_ROOM);
    }

    public Dwelling getResult() {
        return new Dwelling(dwellingType, rooms, roomsQty, windowsQty, doorsQty, doTheyHaveAPool, doTheyHaveARecreationArea);
    }
}
