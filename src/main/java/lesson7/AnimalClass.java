package lesson7;

public abstract class AnimalClass {

    private String rank;
    private String calor;
    private String nickname;
    private int stost;
    int years;

    public AnimalClass(String rank, String calor, String nickname, int stost) {
        this.rank = rank;
        this.calor = calor;
        this.nickname = nickname;
        this.stost = stost;

    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getCalor() {
        return calor;
    }

    public void setCalor(String calor) {
        this.calor = calor;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getStost() {
        return stost;
    }

    public void setStost(int stost) {
        this.stost = stost;
    }

    @Override
    public String toString() {
        return String.format("Животное: %s %s %s  - для вытости требуется %d очков еды ,.  ", rank, calor, nickname, stost);
    }

    public void printInfo() {
        System.out.println(this);
    }

    public void toAction() {

    }
}

