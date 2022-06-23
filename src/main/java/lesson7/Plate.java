package lesson7;

public class Plate {

    private int foodCound;

    public Plate(int footCound) {

        this.foodCound = footCound;
    }


    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return '{' + " В миске:" +
                foodCound + " единиц еды" +
                '}';
    }

    public int getFootCount() {
        if (foodCound < 0) {
            System.out.println("Еда закончилась!");
        }

        return foodCound;
    }

    public void decreaseFood(int nextInt) {

        if (foodCound >= nextInt) {
            foodCound -= nextInt;

        } else {
            int end = foodCound +nextInt;
            System.out.println(end -(foodCound -nextInt));
            System.out.println("Котик сьел все");
        }

    }

    }



