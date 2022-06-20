package lesson6;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Пес", "Гавка", 500, 5, 10, "Отлично плавает!",0);
        Chicken chicken =new Chicken("Птица", " Курица Даша", 700, 1, 0, "Не умеет плавать!",5 );
        Cat cat = new Cat("Кот", "Мурлыка", 200, 3, 0, "Не умеет плавать!",0);
        cat.CatSu(0);

//        AnimalClass[] animalClasses = {cat, dog};
//        for (AnimalClass animalClass : animalClasses) {
//            animalClass.toString();
//        }
    }
}






