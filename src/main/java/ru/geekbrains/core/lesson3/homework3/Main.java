package ru.geekbrains.core.lesson3.homework3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Employee worker1 = new Worker("Анатолий", 700, 65);
        Worker worker2 = new Worker("Евгений", 500, 70);
        Employee worker3 = new Worker("Екатерина", 900, 30);
        Worker worker4 = new Worker("Инна", 200, 18);

        Employee freelancer1 = new Freelancer("Аркадий", 40, 5);
        Freelancer freelancer2 = new Freelancer("Евгений", 50, 6);
        Employee freelancer3 = new Freelancer("Ева", 30, 4);
        Freelancer freelancer4 = new Freelancer("Паломна", 20, 8);

        List<Employee> staff = new ArrayList<>();
        staff.add(worker1);
        staff.add(freelancer3);
        staff.add(freelancer2);
        staff.add(worker4);
        staff.add(worker3);
        staff.add(freelancer1);
        staff.add(worker2);
        staff.add(freelancer4);

        System.out.println(staff);

        Collections.sort(staff);

        System.out.println(staff);


        for (Employee employee: staff) {
            if (employee.averageMonthlySalary() <= 500) {
                System.out.printf("%s получает премию в размере 200 фантиков \n", employee);
            }
            if (employee.averageMonthlySalary() <= 800) {
                System.out.printf("%s получает один отгул\n", employee);
            }
            if (employee.averageMonthlySalary() > 800) {
                System.out.printf("%s У вас и так высокая зарплата!!!\n", employee);
            }

        }

        System.out.println("------------------------------------------");

        DismissalList dismissalListlist = new DismissalList();
        dismissalListlist.addEmployee(worker2);
        dismissalListlist.addEmployee(worker1);
        dismissalListlist.addEmployee(worker4);
        dismissalListlist.addEmployee(worker3);

        dismissalListlist.addEmployee(freelancer4);
        dismissalListlist.addEmployee(freelancer1);
        dismissalListlist.addEmployee(freelancer3);
        dismissalListlist.addEmployee(freelancer2);

        for (Employee e : dismissalListlist) {
            if (e.getAge() > 60) {
                System.out.printf("%s необходимо уволить \n", e);
            } else {
                System.out.printf("%s необходимо повысить зарплату \n", e);
            }
        }
    }
}