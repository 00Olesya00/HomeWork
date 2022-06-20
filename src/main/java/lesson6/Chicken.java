package lesson6;

import java.util.concurrent.ThreadLocalRandom;

public class Chicken extends AnimalClass {
    private String com;
    private int fly;

    public Chicken(String rank, String nickname, int run, double jump, int swim, String com, int fly) {
        super(rank, nickname, run, jump, swim);
        this.com = com;
        this.fly = fly;
        printInfo();
        toAction(ThreadLocalRandom.current().nextInt(700), ThreadLocalRandom.current().nextInt(2), swim, com, ThreadLocalRandom.current().nextInt(5));
    }

    public String getCom() {
        return com;
    }

    public void setCom(String com) {
        this.com = com;
    }

    @Override
    public String toString() {
        return super.toString() + com+ " Может взлететь на "+fly+" м ";
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
            if ((fly <= 0)) {
                System.out.println(" " + getNickname() + " " + "Не хочет лететь" + " ");
                System.out.println();
            } else {
                System.out.printf(pattern, "", getNickname(), "бежит  и взлетает на ", fly, "м");
                System.out.println();
            }
        }
    }
}