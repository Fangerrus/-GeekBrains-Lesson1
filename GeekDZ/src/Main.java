import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n*********************************** Geekbrains: Lesson 1 ***********************************");
        System.out.println("\nЗадание 1: Создать переменные всех пройденных типов данных, и инициализировать их значения.");
        variables();
        System.out.print(expression(4,6,7,10));
        System.out.print(task3(15, 2));
        task4(0);
        System.out.print(task5(-1));
        task6();
        task7();



    }

    static void variables () {
        byte y = 123;
        short s = 2525;
        char k = 'A';
        int i = 12345;
        long l = 1200L;
        float f = 120.0f;
        double u = 17.77777;
        boolean bool = true;


        System.out.println("\nbyte = " + y);
        System.out.println("short = " + s);
        System.out.println("char = " + k);
        System.out.println("int = " + i);
        System.out.println("long = " + l);
        System.out.println("float = " + f);
        System.out.println("double = " + u);
        System.out.println("boolean = " + bool);

    }

    public static int expression (int a, int b, int c, int d) {
        System.out.println("\nЗадание 2: Написать метод, вычисляющий выражение a * (b + (c / d))\nи возвращающий результат, где a, b, c, d – входные параметры этого метода.");
        int x = a * (b + (c / d));
        System.out.print("\nРезультат a * (b + (c / d) =  ");
        return x;

    }

    public static boolean task3(int age1, int age2){
        System.out.println("\n" + "\n" + "Задание 3: Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит \nв пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false; ");
        System.out.print("\nСумма чисел = " + (age1 + age2) + " результат: ");
        if (age1 + age2 > 10 && age1 + age2 < 20 ) {
            return true;

        } else {
            return false;
        }
    }

    public static void task4 (int ch) {
        System.out.println("\n" + "\n" + "Задание 4: Написать метод, которому в качестве параметра передается целое число, метод должен \nнапечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.");

        if (ch >= 0) {
            System.out.print("\nРезультат: " + ch + " - положительное число");

        } else {
            System.out.print("\nРезультат: " + ch + " - отрицательное число");

        }
    }



    public static boolean task5 (int a){
        System.out.println("\n" + "\nЗадание 5: Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;");
        System.out.print("\n" + "Параметр: " + a);
        System.out.print("\nОтвет: ");
        if (a < 0) {
            return true;

        } else {
            return false;
        }
    }

    public static void task6 () {
        System.out.println("\n" + "\nЗадение 6: Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод\nдолжен вывести в консоль сообщение «Привет, указанное_имя!»");
        String name = "Vlad";
        System.out.print("\nПривет, " + name + "!");

    }

    static void task7() {
        System.out.println("\n" + "\nЗадание 7: Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.\nКаждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.");
        System.out.print("\nВведите год: ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0))
            System.out.println("Високосный год");
        else
            System.out.println("Обычный год");

    }
}
