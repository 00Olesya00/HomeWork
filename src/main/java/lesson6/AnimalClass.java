package lesson6;

public abstract class AnimalClass {

    private String rank;
    private String nickname;
    private int run;
    private double jump;
    private int swim;

    public AnimalClass(String rank, String nickname, int run, double jump, int swim) {
        this.rank = rank;
        this.nickname = nickname;
        this.run = run;
        this.jump = jump;
        this.swim = swim;

    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public double getJump() {
        return jump;
    }

    public void setJump(int jump) {
        this.jump = jump;
    }

    public int getSwim() {
        return swim;
    }

    public void setSwim(int swim) {
        this.swim = swim;
    }

    @Override
    public String toString() {
        return String.format("Животное: %s %s  - может пробежать %d м, подпрыгнуть на высоту до %d м.  ", rank, nickname, run, (int) jump);
    }

    public void printInfo() {
        System.out.println(this);
    }

    public void toAction(Object run, Object jump, Object swim, String com, int fly) {

    }
}





