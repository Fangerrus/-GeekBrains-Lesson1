public class DZ2 {

    public static void main(String[] args) {

        System.out.println("\n********************************************* Geekbrains: Lesson 2 *********************************************");
        System.out.println("\n1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].\nС помощью цикла и условия заменить 0 на 1, 1 на 0;" + "\n");
        integer_mass();
        empty_mass();
        multiplication_mass();
        two_dimensional_mass();
        one_dimensional_mass();
        method_mass();

    }

    static void integer_mass() {
        int[] mass = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int maxMass = mass.length;
        for (int i = 0; i < maxMass; i++) {
            System.out.print(i + "-" + mass[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < maxMass; i++)
            if (mass[i] == 1) {
                mass[i] = 0;
            } else mass[i] = 1;
        for (int i = 0; i < maxMass; i++) {
            System.out.print(i + "-" + mass[i] + " ");
        }
    }

    static void empty_mass() {
        System.out.print("\n");
        System.out.println("\n2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;" + "\n");

        int[] arr = new int[8];

        for (int i = 0, j = 0; i < arr.length; i++, j += 3) {
            arr[i] = j;


            System.out.print(arr[i] + " ");
        }
    }

    static void multiplication_mass() {
        System.out.print("\n");
        System.out.println("\n3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;" + "\n");

        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.println("\n");
        for (int i: arr) {
           System.out.print(i + " ");
        }

        System.out.print("\n");
        for (int i = 0; i < arr.length; i++) {
           if (arr[i] < 6) arr[i] *= 2;
           System.out.print(arr[i] + " ");
        }
    }

    static  void two_dimensional_mass() {
        System.out.print("\n");
        System.out.println("\n4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов)\nзаполнить его диагональные элементы единицами;" + "\n");


        int length = 6;

        int[][] arr = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if ((i == j) || (i == length - 1 - j)) {
                    arr[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void one_dimensional_mass() {
        System.out.print("\n");
        System.out.println("\n5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы;" + "\n");

        int[] arr = {1, 2, 3, -3, 10, 20, -1, 5, 0, 7};
        int min = arr[0];
        int max = arr[0];
        for (int i : arr) {
            System.out.print(i + " ");
        }

        for (int i = 0; i < arr.length; i++) {
            min = (min < arr[i]) ? min : arr[i];
            max = (max > arr[i]) ? max : arr[i];
        }
        System.out.println("\nМинимальный элемент: " + min + "\nМаксимальный элемент: " + max);
    }

    static void method_mass() {
        System.out.print("\n");
        System.out.println("\n6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод \nдолжен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.\nПримеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят." + "\n");

        System.out.println(mass6(new int[]{1, 1, 1, 2, 1}));
        System.out.println(mass6(new int[]{2, 1, 1, 2, 1}));
        System.out.println(mass6(new int[]{10, 10}));
    }

    static boolean mass6(int[] arr) {
        int leftSum = 0, rightSum = 0;

        for (int i = 0; i < arr.length + 1; i++) {
            leftSum = 0;
            rightSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }

            for (int j = i; j < arr.length; j++) {
                rightSum += arr[j];
            }

            if (leftSum == rightSum) return true;
        }
        return false;
    }
}
