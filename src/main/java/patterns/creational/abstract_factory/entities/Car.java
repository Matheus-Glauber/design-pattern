package patterns.creational.abstract_factory.entities;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public abstract class Car {
    private String name;
    private Double HP;
    private Integer ports;
    private Integer velocity;
    private boolean isOn;

    public abstract void speedUp();
    public abstract void toStop();
    public abstract void startCar();
    public abstract void turnOffCar();
}
