package zoo;

import Zoo.Mammal;

public class Bat extends Mammal {

    public Bat() {
        this.energyLevel = 300;
    }

    public void fly() {
        System.out.println("Bat took off with the sound of wings flapping!");
        this.energyLevel -= 50;
    }

    public void eatHumans() {
        System.out.println("Bat ate some humans. It gained energy!");
        this.energyLevel += 25;
    }

    public void attackTown() {
        System.out.println("Sound of a town on fire! Bat attacked the town.");
        this.energyLevel -= 100;
    }
}