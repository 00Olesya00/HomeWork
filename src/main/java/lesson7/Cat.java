package lesson7;

import java.util.concurrent.ThreadLocalRandom;

public class Cat extends AnimalClass {
    AnimalClass[] catsArray;

    public int getCatEatFoodCount() {
        return catEatFoodCount;
    }

    int  catEatFoodCount;
    public Cat(String rank,String calor, String nickname, int satiety) {
        super(rank, nickname,calor,satiety);
this.catEatFoodCount=catEatFoodCount;
    }
    public void eat(Plate plate) {
        catEatFoodCount = ThreadLocalRandom.current().nextInt(50);

      if (catEatFoodCount>0 ) {
          System.out.println("Котик поел");
            plate.decreaseFood(catEatFoodCount);



      }
        System.out.printf("Котик: %s, съедает: %d единиц из миски.",getNickname(),catEatFoodCount);


    }

//    public void CatSu(int s) {
//        AnimalClass[] catsArray = new AnimalClass[2];
//        catsArray[0] = new Cat("Кот","Черный","Зырка",10);
//        catsArray[1] = new Cat("Кот", "Рыжий","Го",11 );
//        for (int i = 0; i < catsArray.length; i++) {
//            persinsInfo(10);
//            System.out.println("Наелся");
//            persinsInfo(12);
//        }
//    }
//
//
//
//    private void persinsInfo(int cat) {
//        for (int j = 0; j < catsArray.length; j++) {
//            if (catsArray[j].years >= cat) {
//                catsArray[j].printInfo();
//            }
//        }
//    }
            @Override
            public String toString () {
                return super.toString() ;
            }


}
