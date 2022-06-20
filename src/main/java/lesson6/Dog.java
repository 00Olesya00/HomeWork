package lesson6;

import java.util.concurrent.ThreadLocalRandom;


public class Dog extends AnimalClass {
    private String com;
    private int fly;

    public Dog(String rank, String nickname, int run, double jump, int swim, String com, int fly) {
        super(rank, nickname, run, jump, swim);
        this.com = com;
        this.fly = fly;
        printInfo();
        toAction(ThreadLocalRandom.current().nextInt(500), ThreadLocalRandom.current().nextInt(5), ThreadLocalRandom.current().nextInt(10), com, fly);
    }

    @Override
    public String toString() {
        return String.format("Животное: %s %s  - может пробежать %d м, подпрыгнуть на %d м, проплыть %s м, летать не умеет. ", getRank(), getNickname(), getRun(), (int) getJump(), getSwim());
    }

    public String getCom() {
        return com;
    }

    public void setCom(String com) {
        this.com = com;
    }


    @Override
    public void toAction(Object run, Object jump, Object swim, String com, int fly) {
        String pattern = """  
                       %s %s %s %d%s             
                """;
        if (((int) jump <= 0)) {
            System.out.println(getRank() + " " + getNickname() + " " + "Не хочет выполнять действие прыжок");
        } else {
            System.out.printf(pattern, "", getNickname(), "подпрыгивает на высоту : ", jump, "м");
        }
        if (((int) run <= 0)) {
            System.out.println(getRank() + " " + getNickname() + " " + "Утал  не хочет выполнять действие бег");
        } else {
            System.out.printf(pattern, "", getNickname(), "бежит и пробегает: ", run, "м");
        }
        if (((int) swim <= 0)) {
            System.out.println(getNickname() + " " + "Не хочет плыть");
        } else if (((int) swim > 0)) {
            System.out.printf(pattern, getRank(), getNickname(), "плывет и проплывает: ", swim, "м  ");
            System.out.println();
        } else {
            System.out.printf(getRank() + getNickname() + "отказывается плыть" + swim + "м");
            System.out.println();

        }

    }
}
