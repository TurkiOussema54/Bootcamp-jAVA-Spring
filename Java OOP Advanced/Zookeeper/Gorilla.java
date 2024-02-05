package zoo;

import Zoo.Mammal;

public class Gorilla extends Mammal {

    public void throwSomething() {
        System.out.println("Gorilla threw something!");
        this.energyLevel -= 5;
    }

    public void eatBananas() {
        System.out.println("Gorilla is satisfied after eating bananas!");
        this.energyLevel += 10;
    }

    public void climb() {
        System.out.println("Gorilla climbed a tree!");
        this.energyLevel -= 10;
    }
}