package com.company.schoolManagementSystem;

import java.util.*;


public class Student extends Human {
    private static List<Integer> ids;
    private String name;
    private String surname;
    private String patronymic;
    private String login;
    private String password;
    private int id;
    private int course;
    private int contract;
    private int payed = 0;
    private static List<Student> students = new ArrayList<>();

    public Student() {
    }

    public Student(String surname, String name, String patronymic, String login, String password, int id, int course, int contract) {

        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.login = login;
        this.password = password;
        this.id = id;
        this.course = course;
        this.contract = contract;

    }
    static void searchStudentForID(List<Student> studentList) {
        boolean temp = false;

        System.out.println("Введите ID студента чтобы найти: ");
        while (true) {
            Scanner scanner = new Scanner(System.in);

            int id = scanner.nextInt();

            for (int i = 0; i < studentList.size(); i++) {
                if (id == studentList.get(i).getId()) {
                    System.out.println("Это студент: " + studentList.get(i).getName()
                            + "\n" + "id: " + studentList.get(i).getId() + "\n" +
                            "контракт: " + studentList.get(i).getContract()
                            + "\n" + "Курс: " + studentList.get(i).getCourse());
                    temp = true;
                    System.exit(0);

                }


                if (temp) {
                    break;
                }

            }
            if (temp == false) {
                System.err.println("Не удалось найти такого ученика!");
            }

        }


    }


    static void payContractOrStudent(List<Student> studentList) {
        boolean deystviye = false;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите имя студента чтобы оплатить его контракт");
            String name = scanner.nextLine();
            for (int i = 0; i < studentList.size(); i++) {
                if (name.toLowerCase().equals(studentList.get(i).getName().toLowerCase())) {
                    payContract(studentList.get(i));
                    deystviye = true;

                }
            }
            if (deystviye) {
                break;
            }
        }

    }

    static void payContract(Student student) {
        boolean deystvie2 = false;
        while (true) {
            System.out.println("Студент: " + student.getName());
            System.out.println("Контракт: " + student.getContract());
            System.out.println("Нажмите 'да' чтобы оплатить контракт :");
            System.out.println("Нажмите 'нет' чтобы отменить процесс :");
            Scanner scanner = new Scanner(System.in);
            String n = scanner.nextLine();
            if (n.toLowerCase().equals("да")) {
                System.out.println("Введите сумму: ");
                int many = scanner.nextInt();
                if (many > student.getContract()) {
                    System.out.println("Вы привысили лимит контракта: ");
                }
                if (many < student.getContract()) {
                    int b = student.getContract() - many;
                    System.out.println("Остаток контракта : " + b);
                    Main.BudjetShkoli = (int) Main.BudjetShkoli + many;
                    System.out.println("Бюджет школы увеличилось " + Main.BudjetShkoli);
                    System.exit(0);
                }

            }
            if (n.toLowerCase().equals("нет")) {
                System.out.println("Вы отказались оплачивать контракт ");
                System.exit(0);
            }
            if (deystvie2 == false) {
                System.err.println("Следуйте выше заданнам инструкциям");
            }
            if (deystvie2) {
                break;
            }

        }

    }
    static void searchStudentForName(List<Student> studentList) {
        boolean temp = false;
        System.out.println("Введите имя студента чтобы найти: ");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            for (int i = 0; i < studentList.size(); i++) {
                if (studentList.get(i).getName().toLowerCase().equals(name.toLowerCase())) {
                    System.out.println("Это студент: " + studentList.get(i).getName()
                            + "\n" + "id: " + studentList.get(i).getId() + "\n" +
                            "контракт: " + studentList.get(i).getContract()
                            + "\n" + "Курс: " + studentList.get(i).getCourse());

                    temp = true;
                    System.exit(0);

                }


            }
            if (temp) {
                break;

            }
            if (temp == false) {
                System.err.println("Не удалось найти такого ученика!");
            }


        }


    }

    public static void getAllStudents(List<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            getStudentInfo(students.get(i));


        } System.exit(0);
    }

    public static void getStudentInfo(Student student) {
        System.out.println("Ф.И.О. студента: " + student.getSurname() + " " + student.name + " " + student.patronymic);
        System.out.println("ID студента: " + Human.generateUniqueId());
        System.out.println("Курс студента: " + student.getCourse());
        System.out.println("Контракт студента: " + student.getContract());
        System.out.println("**********************");


    }

    static void addNewStudent() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Введите вашу фамилию:");
        String surname = scanner.next();
        Human.lowerFirsSurename(surname);
        System.out.println("Введите ваше имя:");
        String name = scanner.next();
        Human.lowerFirsName(name);
        System.out.println("Введите ваше отчество:");
        String patronumic = scanner.next();
        Human.lowerFirsPatronumic(patronumic);
        System.out.println("Придумайте логин");
        String login = scanner.next();
        Human.loginGmail(login);
        System.out.println("Придумайте пароль");

        String password;
        boolean correct = false;
        while (true) {
            Scanner scan = new Scanner(System.in);
            password = scan.nextLine();

            if (password.length() > 8 && password.length() < 16) {
                correct = true;
            }
            if (correct) {
                break;

            }
            if (correct == false) {
                System.err.println("Пароль должен содержать не менее 8 символов и меньше 16!!");

            }

        }


        int id = Human.generateUniqueId();

            System.out.println("Введите курс студента:");
            int course = scanner.nextInt();
            System.out.println("Укажите стоимость контракта");
            int contract = scanner.nextInt();

            Student student = new Student(Human.lowerFirsSurename(surname), Human.lowerFirsName(name), lowerFirsPatronumic(patronumic), Human.loginGmail(login), password, id, course, contract);
            students.add(student);
            System.out.println("Ф.И.О. студента: " + Human.lowerFirsSurename(surname) + " " + Human.lowerFirsName(name) + " " + lowerFirsPatronumic(patronumic));
            System.out.println("ID студента: " + id);
            System.out.println("Курс студента: " + course);
            System.out.println("Логин студента: " + Human.loginGmail(login));
            System.out.println("Контракт студента: " + contract);
            System.out.println("Пароль студента: " + password);
            System.out.println("\n" + "Информация о новом студенте успешно добавлена в базу данных.");

            System.exit(0);


    }


    @Override
    public int getId() {
        return id;
    }


    public int getPayed() {
        return payed;
    }

    public void setPayed(int payed) {
        this.payed = payed;
    }

    public static List<Integer> getIds() {
        return ids;
    }

    public static void setIds(List<Integer> ids) {
        Student.ids = ids;
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

    public static List<Student> getStudents() {
        return students;
    }

    public static void setStudents(List<Student> students) {
        Student.students = students;
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
    public void setId(int id) {
        this.id = id;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getContract() {
        return contract;
    }

    public void setContract(int contract) {
        this.contract = contract;
    }
}
