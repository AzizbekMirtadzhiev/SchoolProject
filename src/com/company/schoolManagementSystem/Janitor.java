package com.company.schoolManagementSystem;

import java.util.List;

public class Janitor extends Human{
    private String name;
    private String surname;
    private String patronymic;
    private String login;
    private String password;
    private String post = "Дворник";
    private int id;
    private int salary;
    private int staj;

    public Janitor(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Janitor(String name, String surname, String patronymic, String login, String password, int id, int salary, int staj) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.login = login;
        this.password = password;
        this.id = id;
        this.post = getPost();
        this.salary = salary;
        this.staj = staj;
    }
    static public void searchJanitor(List<Janitor> janitors) {

        for (int i = 0; i < janitors.size(); i++) {
            System.out.println("Это дворник: " + janitors.get(i).getName());
            System.out.println("id: " + janitors.get(i).getId());
            System.out.println("Зарплата: " + janitors.get(i).getSalary());
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

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }
}
