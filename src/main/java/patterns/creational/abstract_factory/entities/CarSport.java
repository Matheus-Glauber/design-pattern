package patterns.creational.abstract_factory.entities;

public class CarSport extends Car{

    public CarSport(String name, Double HP, Integer ports) {
        super(name, HP, ports, 0, false);
    }

    @Override
    public void speedUp() {
        if(this.isOn()) {
            var velocity = this.getVelocity() + 80;
            this.setVelocity(velocity);
            System.out.println("Acelerando o carro, Km: " + this.getVelocity());
        } else {
            System.out.println("Carro está desligado");
        }
    }

    @Override
    public void toStop() {
        this.setVelocity(0);
        System.out.println("Carro parou!");
    }

    @Override
    public void startCar() {
        this.setOn(true);
    }

    @Override
    public void turnOffCar() {
        this.setOn(false);
    }
}
