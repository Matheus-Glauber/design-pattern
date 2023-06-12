package patterns.creational.builder.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import patterns.creational.builder.enums.DwellingType;
import patterns.creational.builder.enums.RoomType;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Dwelling {
    private DwellingType dwellingType;
    private List<RoomType> roomTypes;
    private int roomsQty;
    private int windowsQty;
    private int doorsQty;
    private boolean doTheyHaveAPool;
    private boolean doTheyHaveARecreationArea;
}
