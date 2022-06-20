package lesson6;

import java.util.concurrent.ThreadLocalRandom;

public class Cat extends AnimalClass {

    private String com;
    private int fly;

    public Cat(String rank, String nickname, int run, double jump, int swim, String com, int fly) {
        super(rank, nickname, run, jump, swim);
        this.com = com;
        printInfo();
        toAction(ThreadLocalRandom.current().nextInt(200), ThreadLocalRandom.current().nextInt(2), swim, com, fly);

    }

    public void CatSu(int s) {
        AnimalClass[] catsArray = new AnimalClass[5];
        catsArray[0] = new Cat("Кот", "Зырка", 200, 3, 0, "Не умеет плавать!", 0);
        catsArray[1] = new Cat("Кот", "Го", 200, 3, 0, "Не умеет плавать!", 0);
        catsArray[2] = new Cat("Кошка", "Мурка", 200, 3, 0, "Не умеет плавать!", 0);
        catsArray[3] = new Cat("Кошка", "Лека", 200, 3, 0, "Не умеет плавать!", 0);
        catsArray[4] = new Cat("Кот", "Прыг", 200, 3, 0, "Не умеет плавать!", 0);
        for (int i = 0; i < catsArray.length; i++) {

        }
    }

    public String getCom() {
        return com;
    }

    public void setCom(String com) {
        this.com = com;
    }

    @Override
    public String toString() {
        return super.toString() + com+" Не летает. ";
    }

    @Override
    public void toAction(Object run, Object jump, Object swim, String com, int fly) {
        String pattern = """  
                       %s %s %s %d %s             
                """;
        if (((int) jump <= 0)) {
            System.out.println("\n" + getRank() + " " + getNickname() + " " + "Не хочет выполнять действие прыжок");
        } else {
            System.out.printf(pattern, getRank(), getNickname(), "подпрыгивает на высоту : ", jump, "м");
        }
        if (((int) run <= 0)) {
            System.out.println("Животное :" + "\n" + getRank() + " " + getNickname() + " " + "Утал  не хочет выполнять действие бег");

        } else {
            System.out.printf(pattern, "", getNickname(), "бежит и пробегает: ", run, "м");
        }
        if (((int) swim <= 0)) {
            System.out.println(" " + getNickname() + " " + "Отказывается плыть." + " " + com);
            System.out.println();
        }

    }

}











