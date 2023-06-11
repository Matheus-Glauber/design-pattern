package patterns.creational.builder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import patterns.creational.builder.entities.Dwelling;
import patterns.creational.builder.enums.DwellingType;
import patterns.creational.builder.enums.RoomType;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DirectorTest {

    private Director director;
    private DwellingBuilder builder;

    @BeforeEach
    void setUp() {
        director = new Director();
        builder = new DwellingBuilder();
    }

    @Test
    void constructHouse() {
        director.constructHouse(builder);

        Dwelling response = builder.getResult();

        assertNotNull(response);
        assertEquals(DwellingType.HOUSE, response.getDwellingType());
        assertEquals(mockRoomsHouse(), response.getRoomTypes());
        assertEquals(5, response.getRoomsQty());
        assertEquals(5, response.getWindowsQty());
        assertEquals(false, response.isDoTheyHaveAPool());
        assertEquals(false, response.isDoTheyHaveARecreationArea());
    }

    @Test
    void constructLoft() {
        director.constructLoft(builder);

        Dwelling response = builder.getResult();

        assertNotNull(response);
        assertEquals(DwellingType.LOFT, response.getDwellingType());
        assertEquals(mockRoomsLoft(), response.getRoomTypes());
        assertEquals(4, response.getRoomsQty());
        assertEquals(4, response.getWindowsQty());
        assertEquals(false, response.isDoTheyHaveAPool());
        assertEquals(false, response.isDoTheyHaveARecreationArea());
    }

    @Test
    void constructKitnet() {
        director.constructKitnet(builder);

        Dwelling response = builder.getResult();

        assertNotNull(response);
        assertEquals(DwellingType.KITNET, response.getDwellingType());
        assertEquals(mockRoomsKitnet(), response.getRoomTypes());
        assertEquals(3, response.getRoomsQty());
        assertEquals(2, response.getWindowsQty());
        assertEquals(false, response.isDoTheyHaveAPool());
        assertEquals(false, response.isDoTheyHaveARecreationArea());
    }

    @Test
    void constructMansion() {
        director.constructMansion(builder);

        Dwelling response = builder.getResult();

        assertNotNull(response);
        assertEquals(DwellingType.MANSION, response.getDwellingType());
        assertEquals(mockRoomsMansion(), response.getRoomTypes());
        assertEquals(10, response.getRoomsQty());
        assertEquals(10, response.getWindowsQty());
        assertEquals(true, response.isDoTheyHaveAPool());
        assertEquals(true, response.isDoTheyHaveARecreationArea());
    }

    private static List<RoomType> mockRoomsHouse() {
        return List.of(RoomType.ROOM, RoomType.SUITE, RoomType.LIVING_ROOM, RoomType.KITCHEN, RoomType.BATHROOM);
    }

    private List<RoomType> mockRoomsLoft() {
        return List.of(RoomType.ROOM, RoomType.LIVING_ROOM, RoomType.KITCHEN, RoomType.BATHROOM);
    }

    private List<RoomType> mockRoomsKitnet() {
        return List.of(RoomType.ROOM, RoomType.KITCHEN, RoomType.BATHROOM);
    }

    private List<RoomType> mockRoomsMansion() {
        return List.of(RoomType.ROOM, RoomType.ROOM, RoomType.ROOM, RoomType.SUITE, RoomType.LIVING_ROOM, RoomType.LIVING_ROOM, RoomType.KITCHEN, RoomType.BATHROOM, RoomType.LEISURE_ROOM, RoomType.POOL);
    }
}