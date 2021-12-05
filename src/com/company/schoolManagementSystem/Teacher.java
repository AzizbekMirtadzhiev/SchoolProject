package com.company.schoolManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Teacher  extends Human {
    private String surname;
    private String patronymic;
    private String name;
    private String login;
    private String password;
    private int id;
    private int salary;
    private String post = "Учитель";
    private int staj;

    public int getStaj() {
        return staj;
    }

    public void setStaj(int staj) {
        this.staj = staj;
    }

    @Override
    public String getPost() {
        return post;
    }


    private static List<Teacher> teachers = new ArrayList<>();

    public Teacher(String surname, String name, String patronymic, String login, String password, int id, int salary, int staj) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.login = login;
        this.password = password;
        this.id = id;
        this.salary = salary;
        this.staj = staj;
    }


    public static void getTeachertInfo (Teacher teacher){
        System.out.println("Ф.И.О. учителя: " + teacher.getSurname() + " " + teacher.name + " " + teacher.patronymic);
        System.out.println("ID учителя: " + Human.generateUniqueId());
        System.out.println("Зарплата учителя: " + teacher.getSalary());
        System.out.println("**********************");


    }
    static public void searchTeachers(List<Teacher> teacherscc) {
        for (int i = 0; i < teacherscc.size(); i++) {
            System.out.println("Это учитель: " + teacherscc.get(i).getName());
            System.out.println("id: " + teacherscc.get(i).getId());
            System.out.println("Зарплата: " + teacherscc.get(i).getSalary());
            System.out.println("*********************************");
        }
        System.exit(0);

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getLogin() {
        return login;
    }

    @Override
    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int getId() {
        return id;
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

    public static List<Teacher> getTeachers() {
        return teachers;
    }

    public static void setTeachers(List<Teacher> teachers) {
        Teacher.teachers = teachers;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
