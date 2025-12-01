package ua.opnu;

import ua.opnu.draw.*;
import ua.opnu.roshambo.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Завдання 1: TimeSpan ===");
        TimeSpan ts1 = new TimeSpan(2, 30);
        TimeSpan ts2 = new TimeSpan(90);

        System.out.println("ts1: " + ts1);
        ts1.add(ts2);
        System.out.println("ts1 + ts2: " + ts1);

        ts1.subtract(60);
        System.out.println("ts1 - 60 хв: " + ts1);

        System.out.println("\n=== Завдання 2: Person/Student/Lecturer ===");

        Person[] people = new Person[4];
        people[0] = new Person("Шевченко", "Тарас", 47);
        people[1] = new Student("Іванов", "Іван", 19, "КН-21", "AB123456");
        people[2] = new Lecturer("Петренко", "Петро", 40, "Інженерія ПЗ", 25000);
        people[3] = new Student("Сидорова", "Анна", 20, "КН-21", "AB123457");

        for (Person p : people) {
            System.out.println(p);
        }

        System.out.println("\n=== Завдання 3: RoShamBo ===");
        playRoShamBo();

        System.out.println("\n=== Завдання 4: Draw (Ellipse) ===");

        Figure myEllipse = new Ellipse(10, 10, 100, 50);

        System.out.println(myEllipse.draw());
    }

    private static GameShape generateShape() {
        Random rand = new Random();
        int choice = rand.nextInt(3);
        switch (choice) {
            case 0: return new Rock();
            case 1: return new Paper();
            default: return new Scissors();
        }
    }

    private static int checkWinner(GameShape computer, GameShape player) {
        if (computer.getClass() == player.getClass()) {
            return 0;
        }

        if (player instanceof Rock) {
            return (computer instanceof Scissors) ? 1 : -1;
        } else if (player instanceof Paper) {
            return (computer instanceof Rock) ? 1 : -1;
        } else if (player instanceof Scissors) {
            return (computer instanceof Paper) ? 1 : -1;
        }
        return 0;
    }

    private static void playRoShamBo() {
        GameShape computer = generateShape();
        GameShape player = new Paper();

        System.out.println("Комп'ютер обрав: " + computer.getName());
        System.out.println("Гравець обрав: " + player.getName());

        int result = checkWinner(computer, player);
        if (result == 1) System.out.println("Результат: Гравець переміг!");
        else if (result == -1) System.out.println("Результат: Комп'ютер переміг!");
        else System.out.println("Результат: Нічия!");
    }
}