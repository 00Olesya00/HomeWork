package lesson5;

import static lesson5.Employees_.*;

public class PersonArray {
    Employees_[] personsArray;

    public void PersonArray() {

        Employees_[] personsArray = new Employees_[5];
        this.personsArray = personsArray;
        personsArray[0] = new Employees_("Павлов Роман Иванович", "Мечтатель", "о@8765.com", "89574872345", 28888, 38); // потом для каждой ячейки массива задаем объект
        personsArray[1] = new Employees_("Кон Ирина Льволвна", "Тренер", "о@гgj765.ru", "89574873345", 56888, 40);
        personsArray[2] = new Employees_("Ирга Инга рисовна", "Наставник", "о@65.com", "89674651232", 30888, 45);
        personsArray[3] = new Employees_("Идрисов Олег Ильич", "Гуру", "ztue@.ru", "89678951232", 100888, 50);
        personsArray[4] = new Employees_("Антипов Игорь Игоревич", "Ведущий специалист", "yrgg@.ru", "8978951232", 89088, 30);
        System.out.println();
        System.out.println("Задание №4-5");
        System.out.println();
        persinsInfo(40);

    }

    public void persinsInfo(int personS_) {
        for (int j = 0; j < personsArray.length; j++) {
            if (personsArray[j].years >= personS_) {
                personsArray[j].printInfo();


            }

        }
    }

    public static void getInfo() {
        PersonArray j = new PersonArray();
        j.PersonArray();
    }
//        Employees_[] personArray = new Employees_[5];
//        for (int j = 0; j < personArray.length; j++) {
//            Employees_ person = new Employees_("Антипов", "Квгений", "Ильич", 46, "Архитектор", 1000000, "89297749688", "n88778in3.ru");
//            Employees_ person1 = new Employees_("Качалов", "Иваен", "Иванович", 39, "Художник", 20000, "89297989088", "n867@lin2.ru");
//            Employees_ person2 = new Employees_("Рон", "Илья", "Павлович", 19, "Наблюдатель", 1000, "89297987788", "n867@lin3.ru");
//            Employees_ person3 = new Employees_("Гуди", "Заир", "Эльгизович", 50, "Мечтатель", 100800, "89297989088", "n8867@lin3.ru");
//            Employees_ person4 = new Employees_("Инрга", "Инга", "Рисовна", 30, "Учитель", 40000, "89297449688", "n8856lin3.ru");
//            personArray[0] = person;
//       personArray[1] = person1;
//       personArray[2] = person2;
//        personArray[3] =person3;
//        personArray[4] =person4;
//            Employees_[] persons = {person, person1, person2,person3,person4};
////
//        personArray[0] = ("Качалов, Иваен, Иванович, 39, Художник, 20000, 89297989088, n867@lin2.ru");
//        personArray[1] = ("Рон, Илья, Павлович, 19, Наблюдатель, 1000, 89297987788, n867@lin3.ru");
//        personArray[2] = ("Гуди, Заир, Эльгизови, 50, Мечтатель, 100800, 89297989088, n8867@lin3.ru");
//        personArray[3] =("Инрга, Инга, Рисовна, 30, Учитель, 40000, 89297449688, n8856lin3.ru");
//        personArray[4] =("Антипов, Квгений, Ильич, 46, Архитектор, 1000000, 89297749688, n88778in3.ru");
//        return personArray;
//    }


}


