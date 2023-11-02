package patterns.creational.builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import patterns.creational.builder.entities.Dwelling;
import patterns.creational.builder.enums.DwellingType;
import patterns.creational.builder.enums.RoomType;

import java.util.List;

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

        Assertions.assertNotNull(response);
        Assertions.assertEquals(DwellingType.HOUSE, response.getDwellingType());
        Assertions.assertEquals(mockRoomsHouse(), response.getRoomTypes());
        Assertions.assertEquals(5, response.getRoomsQty());
        Assertions.assertEquals(5, response.getWindowsQty());
        Assertions.assertFalse(response.isDoTheyHaveAPool());
        Assertions.assertFalse(response.isDoTheyHaveARecreationArea());
    }

    @Test
    void constructLoft() {
        director.constructLoft(builder);

        Dwelling response = builder.getResult();

        Assertions.assertNotNull(response);
        Assertions.assertEquals(DwellingType.LOFT, response.getDwellingType());
        Assertions.assertEquals(mockRoomsLoft(), response.getRoomTypes());
        Assertions.assertEquals(4, response.getRoomsQty());
        Assertions.assertEquals(4, response.getWindowsQty());
        Assertions.assertFalse(response.isDoTheyHaveAPool());
        Assertions.assertFalse(response.isDoTheyHaveARecreationArea());
    }

    @Test
    void constructKitnet() {
        director.constructKitnet(builder);

        Dwelling response = builder.getResult();

        Assertions.assertNotNull(response);
        Assertions.assertEquals(DwellingType.KITNET, response.getDwellingType());
        Assertions.assertEquals(mockRoomsKitnet(), response.getRoomTypes());
        Assertions.assertEquals(3, response.getRoomsQty());
        Assertions.assertEquals(2, response.getWindowsQty());
        Assertions.assertFalse(response.isDoTheyHaveAPool());
        Assertions.assertFalse(response.isDoTheyHaveARecreationArea());
    }

    @Test
    void constructMansion() {
        director.constructMansion(builder);

        Dwelling response = builder.getResult();

        Assertions.assertNotNull(response);
        Assertions.assertEquals(DwellingType.MANSION, response.getDwellingType());
        Assertions.assertEquals(mockRoomsMansion(), response.getRoomTypes());
        Assertions.assertEquals(10, response.getRoomsQty());
        Assertions.assertEquals(10, response.getWindowsQty());
        Assertions.assertTrue(response.isDoTheyHaveAPool());
        Assertions.assertTrue(response.isDoTheyHaveARecreationArea());
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