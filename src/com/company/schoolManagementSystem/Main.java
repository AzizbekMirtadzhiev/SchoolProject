package com.company.schoolManagementSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static Accountant accountant;
    public static int BudjetShkoli = 50000;


    public static void main(String[] args) {
        Student aman = new Student("Архипов","Данила","Андреевич ","hjvshvsbh@gmail.com","dfrgf",1,3,30000);
        Student josef = new Student("Викулова","Вероника","Сергеевна ","hjvshvsbh@gmail.com","dfrgf",2,2,30000);
        Student borya = new Student("Девятова","Оксана","Сергеевна ","hjvshvsbh@gmail.com","dfrgf",3,3,30000);
        Student yan = new Student("Демьянова","Ирина","Владимировна ","hjvshvsbh@gmail.com","dfrgf",4,4,30000);
        Student kesha = new Student("Духов","Денис","Михайлович ","hjvshvsbh@gmail.com","dfrgf",5,4,30000);


        Teacher mariya = new Teacher("Абакарова","София"," Курбановна","hjvshvsbh@gmail.com","636",1,40000, 2);
        Teacher ekaterina = new Teacher("Абдыбекова ","Рахат","Акылбековна","bghreh@gmail.com","7237237",2,30000, 3);
        Teacher kibriya = new Teacher("Абдыкулова"," Фарида","Абаскановна","amggagan@gmail.com","874742",3,80000, 4);
        Teacher ekutoy = new Teacher("Абдыралиева"," Чынара","Мелисовна","amagegn@gmail.com","7843724",4,90000, 5);
        Teacher roziyahon = new Teacher("Абушкина"," Наталья"," Валерьевна","gergbuaiigr@gmail.com","74574",5,30000, 1);


        Cook abushkina = new Cook("Наталья","Абушкина","Валерьевна","natash11","1",5, 15000, 3);
        Cook babushkina = new Cook("Света","Бабушкина","Евгеньевна","sveta22","1",4, 15000, 4);


        Nurse natali = new Nurse("Наталия","Светланова","Григорьевна","natali99","1",1, 19000, 4);

        Janitor yevgeniy = new Janitor("Евгений","Александров","Сашевич","yevgen123","123",1,10000, 2);

        Security pasha = new Security("Паша","Антонов","Александревич","pasha123","123",1, 17000, 4);

       accountant = new Accountant("Абушкина"," Наталья"," Валерьевна","1","1",5);

        ArrayList<Nurse> nurse = new ArrayList<>();
        ArrayList<Cook> cooks = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Teacher> teachers = new ArrayList<>();
        ArrayList<Janitor> janitors = new ArrayList<>();
        ArrayList<Security> securitiy = new ArrayList<>();




        students.add(aman);
        students.add(josef);
        students.add(borya);
        students.add(yan);
        students.add(kesha);

        teachers.add(mariya);
        teachers.add(ekaterina);
        teachers.add(kibriya);
        teachers.add(ekutoy);
        teachers.add(roziyahon);

        cooks.add(abushkina);
        cooks.add(babushkina);

        nurse.add(natali);

        janitors.add(yevgeniy);

        securitiy.add(pasha);
        ArrayList<Human> exployees = new ArrayList<>();
        exployees.addAll(teachers);
        exployees.addAll(cooks);
        exployees.addAll(nurse);
        exployees.addAll(janitors);
        exployees.addAll(securitiy);



        School school = new School();
//        school.MainMenuBuhgalter(students,teachers);

        school.welcome(students, exployees, teachers, cooks, securitiy, janitors, nurse);


    }

}
