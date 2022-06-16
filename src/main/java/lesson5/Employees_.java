package lesson5;

public class Employees_ {//Задание 1-3
    private String name;
    private String profession;
    private String e_mail;
    private String phone;
    private int salary;
    int years;

    public Employees_(String name, String profession, String e_mail, String phone, int salary, int years) {
        this.name = name;
        this.years = years;
        this.profession = profession;
        this.salary = salary;
        this.phone = phone;
        this.e_mail = e_mail;

    }

    void printInfo() {
        String pattern = """
                       %s
                 ФИО          %s
                 Должность:   %s
                 E_mail:      %s
                 Телефон:     %s 
                 Размер з/п:  %d 
                  Возраст:    %d
                """;
        System.out.printf(pattern, "Сотрудник", name, profession, e_mail, phone, salary, years);


    }

}


