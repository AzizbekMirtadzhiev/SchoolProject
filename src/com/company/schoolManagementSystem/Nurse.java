package com.company.schoolManagementSystem;

import java.util.List;

public class Nurse extends Human{
    private String name;
    private String surname;
    private String patronymic;
    private String login;
    private String password;
    private String post = "Медсестра";
    private int id;
    private int salary;
    private int staj;

    public int getStaj() {
        return staj;
    }

    public void setStaj(int staj) {
        this.staj = staj;
    }

    public Nurse(String name, String surname, String patronymic, String login, String password, int id, int salary, int staj) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.login = login;
        this.salary = salary;
        this.password = password;
        this.id = id;
    }

    static public void searchNurse(List<Nurse> nurses) {
        for (int i = 0; i < nurses.size(); i++) {
            System.out.println("Это медсестра: " + nurses.get(i).getName());
            System.out.println("id: " + nurses.get(i).getId());
            System.out.println("Зарплата: " + nurses.get(i).getSalary());
            System.out.println("*********************************");
        }
        System.exit(0);
    }


    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public void setSalary(int salary) {
        this.salary = salary;
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
    public String getSurname() {
        return surname;
    }

    @Override
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String getPatronymic() {
        return patronymic;
    }

    @Override
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
