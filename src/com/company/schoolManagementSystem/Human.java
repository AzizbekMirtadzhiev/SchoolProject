package com.company.schoolManagementSystem;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.UUID;

public class Human {
    private String name;
    private String surname;
    private String patronymic;
    private String login;
    private String password;
    private int id;
    private int salary;
    private String post;
    private int staj;

    public int getStaj() {
        return staj;
    }

    public void setStaj(int staj) {
        this.staj = staj;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public static int generateUniqueId() {
        UUID idOne = UUID.randomUUID();
        String str = "" + idOne;
        int uid = str.hashCode();
        String filterStr = "" + uid;
        str = filterStr.replaceAll("-", "");
        return Integer.parseInt(str);
    }

    public static String lowerFirsSurename(String surname) {
        surname = surname.toLowerCase();
        char s = surname.charAt(0);
        String surnamee = surname.substring(1, surname.length());
        surname = Character.toUpperCase(s) + surnamee;
        return surname;

    }

    public static String lowerFirsName(String name) {
        name = name.toLowerCase();
        char f = name.charAt(0);
        String namee = name.substring(1, name.length());
        name = Character.toUpperCase(f) + namee;
        return name;

    }

    public static String lowerFirsPatronumic(String patronymic) {
        patronymic = patronymic.toLowerCase();
        char p = patronymic.charAt(0);
        String patnomic = patronymic.substring(1, patronymic.length());
        patronymic = Character.toUpperCase(p) + patnomic;
        return patronymic;

    }

    public static String loginGmail(String login) {
        login = login.toLowerCase(Locale.ROOT);
        login = login.concat("@gmail.com");
        return login;

    }

    public static String passwordSetting(Scanner scanner, String password) {
        boolean correct = false;
        while (true) {
            Scanner scanne = new Scanner(System.in);
            password = scanne.next();

            if (password.length() >= 8 && password.length() <= 16) {
                correct = true;
            }
            if (correct == false) {
                System.out.println("Пароль должен содержать не менее 8 символов и меньше 16!!");
            }
            if (correct) {
                break;

            }


        }
        return password;


    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    public static void getAllExployees(List<Human> humans) {
        for (int i = 0; i < humans.size(); i++) {
            getExployeesInfo(humans.get(i));


        }
        System.exit(0);
    }

    public static void getExployeesInfo(Human human) {
        System.out.println("Ф.И.О. сотрудника: " + human.getSurname() + " " + human.getName() + " " + human.getPatronymic());
        System.out.println("ID студента: " + Human.generateUniqueId());
        System.out.println("Зарплата сотрудника: " + human.getSalary());
        System.out.println("Должность сотрудника: " + human.getPost());
        System.out.println("Стаж сотрудника: " + human.getStaj());
        System.out.println("**********************");


    }

    public static void perevodSecurity(List<Human> humans) {
        boolean deystviye = false;
        while (true) {
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Введите имя этого сотрудника:");
            String dlyaName = scanner2.nextLine();
            for (int i = 0; i < humans.size(); i++) {
                if (humans.get(i).getName().toLowerCase().equals(dlyaName.toLowerCase())) {
                    Perevod(humans.get(i));
                    deystviye = true;
                    System.exit(0);
                }
            }
            if (!deystviye) {
                System.out.println("Мы не смогли найти такого сотрудника!" + "\n Введите ещё раз!");
            }
            if (deystviye) {
                break;
            }

        }
    }

    public static void Perevod(Human human) {
        boolean n = false;
        while (true) {
            try {
                System.out.println("Это сотрудник " + human.getName());
                System.out.println("Максимальная сумма перевода: " + human.getSalary());
                if (human.getStaj() == 1) {
                    System.out.println("Добавка к зарплате 0, не достаточно стажа!");
                    System.out.println("Введите сумму которую хотите оплатить:");
                }
                if (human.getStaj() == 2) {
                    double b = human.getSalary() + (human.getSalary() * 0.1);

                    System.out.println("Добавка к зарплате 10%");
                    System.out.println("И его (её) зарплата состовляет: " + b);
                    System.out.println("Введите сумму которую хотите оплатить:");
                }
                if (human.getStaj() == 3) {
                    double b = human.getSalary() + (human.getSalary() * 0.15);

                    System.out.println("Добавка к зарплате 15%");
                    System.out.println("И его (её) зарплата состовляет: " + b);
                    System.out.println("Введите сумму которую хотите оплатить:");
                }
                if (human.getStaj() == 4) {
                    double b = human.getSalary() + (human.getSalary() * 0.2);

                    System.out.println("Добавка к зарплате 20%");
                    System.out.println("И его (её) зарплата состовляет: " + b);
                    System.out.println("Введите сумму которую хотите оплатить:");
                }
                if (human.getStaj() == 5) {
                    double b = human.getSalary() + (human.getSalary() * 0.25);

                    System.out.println("Добавка к зарплате 25%");
                    System.out.println("И его (её) зарплата состовляет: " + b);
                    System.out.println("Введите сумму которую хотите оплатить:");
                }


                Scanner scanner = new Scanner(System.in);
                int money = scanner.nextInt();
                if (money > human.getSalary()) {
                    System.out.println("Вы привысили лимит платежа!");
                }
                if (money < human.getSalary()) {
                    Main.BudjetShkoli = (int) Main.BudjetShkoli - money;
                    int a = human.getSalary() - money;
                    System.out.println("Остаток от стороны бухгалтерства: " + a);
                    System.out.println("Бюджет школы в данное время состовляет: " + Main.BudjetShkoli);
                    n = true;
                }
            } catch (Exception e) {
                System.out.println("Ошибка ввода!");
            }
            if (n) {
                break;

            }

        }


    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
}
