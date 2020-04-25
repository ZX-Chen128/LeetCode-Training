package Design.Factory.AbstractFactory;

public class Main {
    public static void main(String[] args) {

        AbstractFactory f = new MagicFactory();

        Vehicle vehicle = f.createVehicle();
        vehicle.go();
        Food food = f.createFood();
        food.eat();
        Weapon weapon = f.createWeapon();
        weapon.fire();

    }
}
