package com.company.schoolManagementSystem;

import java.util.*;

public class School {


    private List<Human> teachers;
    private List<Student> students;


    public void welcome(List<Student> students, List<Human> exployees, List<Teacher> teacherss, List<Cook> cooks,
                        List<Security> security, List<Janitor> janitors, List<Nurse> nurses) {


        Scanner scanner = new Scanner(System.in);
        int count = 0;

        while (true) {
            System.out.println("Введите ваш логин: ");
            String log = scanner.nextLine();
            System.out.println("Введите ваш пароль:");
            String x = scanner.nextLine();
            if (log.equals(Main.accountant.getLogin()) && x.equals(Main.accountant.getPassword())) {
                MainMenuBuhgalter(students, exployees, teacherss, cooks, security, janitors, nurses);

            } else {
                count++;
                System.out.println("Неправильный пароль" + "\nОсталось попыток " + (3 - count));
            }
            if (count == 3) {
                System.out.println("использовано 3 попыток ввода." + "\nПрограмма завершена");


            }

        }
    }


    public void MainMenuBuhgalter(List<Student> students, List<Human> exployees, List<Teacher> teacherss, List<Cook> cooks,
                                  List<Security> security, List<Janitor> janitors, List<Nurse> nurses) {


        boolean temp = false;
        while (true) {
            try {
                System.out.println("Добро пожаловать в главное меню!" + "" +
                        "\nНажмите 1 чтобы найти студентов или сотрудников." +
                        "\nНажмите 2 чтобы узнать информацию о всех студентов и сотрудников." +
                        "\nНажмите 3 чтобы добавить студентов или сотрудников." +
                        "\nНажмите 4 чтобы оплатить контракт студента или заработную плату сотрудника.");

                boolean temp2 = false;
                while (true) {
                    Scanner scanner = new Scanner(System.in);
                    int n = scanner.nextInt();
                    if (n == 1) {
                        Main1(students, exployees, teacherss, cooks, security, janitors, nurses);
                        temp = true;
                        temp2 = true;
                        break;

                    }
                    if (n == 2) {
                        Main2(students, exployees);
                        temp = true;
                        temp2 = true;
                    }
                    if (n == 3) {
                        Main3(students, exployees, teacherss, cooks, security, janitors, nurses);
                        temp = true;
                        temp2 = true;
                    }
                    if (n == 4) {
                        Main4(students, exployees);
                        temp = true;
                        temp2 = true;
                    }
                    if (temp2 == false) {
                        System.err.println("Ошибка!!!" + "\nСледуйте выше заданным инструкциям!!");


                    }
                    if (temp2) {
                        break;
                    }


                }
            } catch (Exception e) {
                System.err.println("Ошибка!!!" + "\nНеверный формат ввода!!");

            }
            if (temp) {
                break;
            }
        }
    }

    public static void Main1(List<Student> students, List<Human> exployees, List<Teacher> teacherss, List<Cook> cooks,
                             List<Security> security, List<Janitor> janitors, List<Nurse> nurses) {


        boolean temp = false;
        while (true) {
            try {
                boolean temp2 = false;
                while (true) {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Нажмите 1 чтобы найти какого-то студента: ");
                    System.out.println("Нажмите 2 чтобы найти какого-то сотрудника: ");
                    int l = scanner.nextInt();
                    if (l == 1) {
                        System.out.println("Нажмите 1 чтобы искать студента по имени:");
                        System.out.println("Нажмите 2 чтобы искать студента по id:");
                        Scanner scanner2 = new Scanner(System.in);
                        int nameOrId = scanner2.nextInt();

                        if (nameOrId == 1) {
                            Student.searchStudentForName(students);
                            temp = true;
                            temp2 = true;

                        }

                        if (nameOrId == 2) {
                            Student.searchStudentForID(students);
                            temp = true;
                            temp2 = true;
                        }

                        if (temp2) {
                            break;
                        }

                        if (temp == false) {
                            System.out.println("Ошибка! Введите то что имеется в указанном!");
                        }

                    }
                    if (l == 2) {
                        sotrudniks(teacherss, cooks, security, janitors, nurses);
                        temp = true;
                        temp2 = true;

                        if (temp) {
                            break;
                        }

                    }
                    if (temp2 == false) {
                        System.out.println("Ошибка! Введите то что имеется в указанном!");
                    }

                }

            } catch (Exception e) {
                System.err.println("Ошибка!!!" + "\nНеверный формат ввода!!");
            }
            if (temp) {
                break;
            }
        }

    }


    public static void Main2(List<Student> students, List<Human> exployees) {

        boolean temp = false;
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Нажмите 1 чтобы узнать информацию о всех студентах: ");
                System.out.println("Нажмите 2 чтобы узнать информацию о всех сотрудниках: ");
                boolean temp2 = false;
                while (true) {
                    int y = scanner.nextInt();
                    if (y == 1) {
                        System.out.println("Информация о всех студентах: ");
                        Student.getAllStudents(students);
                        temp2 = true;
                        temp = true;


                    }

                    if (y == 2) {
                        System.out.println("Информация о всех сотрудниках: ");
                        Human.getAllExployees((ArrayList<Human>) exployees);
                        temp2 = true;
                        temp = true;


                    }
                    if (temp2) {
                        break;
                    }
                    if (temp2 == false) {
                        System.out.println("Ошибка!!!" + "\nСледуйте выше заданным инструкциям!!");


                    }
                }
            } catch (Exception e) {
                System.out.println("Ошибка!!!" + "\nНеверный формат ввода!!");
            }
            if (temp) {
                break;
            }

        }
    }

    public void Main3(List<Student> students, List<Human> exployees, List<Teacher> teacherss, List<Cook> cooks,
                      List<Security> security, List<Janitor> janitors, List<Nurse> nurses) {

        Student.addNewStudent();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 0) {
            MainMenuBuhgalter(students, exployees, teacherss, cooks, security, janitors, nurses);
        }


    }

    public void Main4(List<Student> students, List<Human> exployees) {
        boolean b = false;
        while (true) {
            System.out.println("Введите 1 чтобы оплатить контракт студента: ");
            System.out.println("Введите 2 чтобы перевести деньги, какому-то сотруднику: ");
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            if (n == 1) {
                Student.payContractOrStudent(students);
                b = true;
            }
            if (n == 2) {
                Human.perevodSecurity(exployees);
                b = true;
            }
            if (!b) {
                System.out.println("Ошибка!");
            }
            if (b) {
                break;
            }
        }


    }






    public static void sotrudniks(List<Teacher> teacherss, List<Cook> cooks,
                                  List<Security> security, List<Janitor> janitors, List<Nurse> nurses) {

        System.out.println("Введите 1 если хотите найти учителей : ");
        System.out.println("Введите 2 если хотите найти поваров : ");
        System.out.println("Введите 3 если хотите найти охраника : ");
        System.out.println("Введите 4 если хотите найти дворника : ");
        System.out.println("Введите 5 если хотите найти медсестру : ");


        boolean temp = false;
        while (true) {
            try {
                boolean temp2 = false;
                while (true) {
                    Scanner scanner = new Scanner(System.in);
                    int nameOrId = scanner.nextInt();
                    if (nameOrId == 1) {
                        Teacher.searchTeachers(teacherss);
                        temp = true;
                        temp2 = true;
                    }

                    if (nameOrId == 2) {
                        Cook.searchCooks(cooks);
                        temp = true;
                        temp2 = true;
                    }

                    if (nameOrId == 3) {
                        Security.searchSecurity(security);
                        temp = true;
                        temp2 = true;

                    }
                    if (nameOrId == 4) {
                        Janitor.searchJanitor(janitors);
                        temp = true;
                        temp2 = true;


                    }
                    if (nameOrId == 5) {
                        Nurse.searchNurse(nurses);
                        temp = true;
                        temp2 = true;


                    }
                    if (temp2 == false) {
                        System.out.println("Ошибка! Введите то что имеется в указанном!");
                    }
                    if (temp2) {
                        break;
                    }
                }

            } catch (Exception e) {
                System.err.println("Ошибка!" + "\nНеверный формат ввода!!");
            }
            if (temp == false) {
                System.out.println("Ошибка! Введите то что имеется в указанном!");
            }

        }
    }















}



