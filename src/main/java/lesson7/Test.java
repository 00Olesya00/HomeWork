package lesson7;

public class Test {
    public static void main(String[] args) throws InterruptedException {


        Cat cat = new Cat("Кот", "Черный", "Зырка", 10);
        Plate plate = new Plate(50);
        plate.printInfo();
        while (plate.getFootCount() > 0)
            if (cat.catEatFoodCount < plate.getFootCount()) {
                cat.eat(plate);
                plate.printInfo();
                Thread.sleep(1000);
            } else {plate.decreaseFood(cat.catEatFoodCount);

                break;


            }

    }
}