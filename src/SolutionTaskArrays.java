import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SolutionTaskArrays {
    public static void main(String[] args) {
        // Задача №1.
        // Сумма и произведение элементов одномерного массива.

//        int[] arr = new int[11];
//        int sum = 0;
//        int proizv = 1;
//        for (int i = 1; i < 11; i++) {
//            arr[i] = i + i;
//
//        }
//        for (int i = 1; i < 11; i++) {
//            System.out.println(arr[i]);
//        }
//
//        for (int i = 1; i < 11; i++) {
//            sum = sum + arr[i];
//            proizv =  proizv * arr[i];
//        }
//        System.out.println("Сумма всех чисел массива = " + sum);
//        System.out.println("Произведение всех чисел массива = "  + proizv * -1);

        // Задача №2.
        // Сумма положительных элементов массива.

//        int[] arr = {1, 2, 5, 7, 7, 2, 6, 4, 3, 6, 7};
//        int sumEven = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 == 0) {
//                sumEven = sumEven + arr[i];
//            }
//        }
//        System.out.println(sumEven);

        // Задача №3.
        // Сумма элементов частей массива.

//        int[] arr = {1, 2, 5, 7, 7, 2, 6, 4, 3, 6, 7, 5, 4, 3, 2, 4, 5, 6};
//        int part_1 = 0;
//        int part_2 = 0;
//        for (int i = 0; i <= 8; i++) {
//            part_1 = part_1 + arr[i];
//        }
//        for (int i = 8; i < arr.length; i++) {
//            part_2 = part_2 +  arr[i];
//        }
//        if (part_1 > part_2) {
//            System.out.println("Сумма элементов первой части больше чем у второй");
//        } else System.out.println("Сумма элементов второй части больше чем у первой");


        // Задача №4.
        // Первый положительный элемент массива.

//        int[] arr = {1, 3, 5, 7, 7, 1, 6, 4, 3, 6, 7, 5, 4, 3, 2, 4, 5, 6};
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 == 0) {
//                System.out.println("Это первое положительное число в массиве - "  + arr[i]);
//                break;
//            }
//        }

        // Задача №5.
        // Поиск максимального элемента в массиве.

//        int[] arr = {1, 3, 5, 7, 7, 1, 6, 4, 3, 6, 7, 5, 4, 3, 2, 4, 5, 6};
//        int max = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (max >= arr[i]) {
//                max = max;
//            } else max = arr[i];
//        }
//        System.out.println("Вот наибольшее число в массиве " + max);

        // Задача №6.
        // Максимальный по модулю элемент массива.

//        int[] arr = {2, 8, -12, -45, 54, -66, 54, 32, 7, 5, 3, 2, 5, 7, 7};
//        int maxModule = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < 0) {
//                arr[i] = arr[i] * -1;
//                if (maxModule < arr[i]) {
//                    maxModule = arr[i];
//                } else maxModule = maxModule;
//            }
//        }
//        System.out.println("Это макчимальное число по модулю - " + maxModule);

        // Задача №7.
        // Найти два максимальных элемента массива.

//        int[] arr = {2, 8, 12, 45, 54, 66, 54, 32, 7, 5, 3, 2, 5, 7, 7};
//        int maxElement_1 = 0;
//        int maxElement_2 = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (maxElement_1 < arr[i]) {
//                maxElement_1 = arr[i];
//            }
//            if (maxElement_2 < arr[i] && arr[i] != maxElement_1 ) {
//                maxElement_2 = arr[i];
//            }
//        }
//        System.out.println("Это второе по величине число в массиве - " + maxElement_2);
//        System.out.println("Это самое большое число массива - " + maxElement_1);

        // Задача №8.
        // Заменить элементы массива на противоположные.


//        int[] arr = {2, 8, -12, 45, 54, -66, 54, 32, -7, 5, -3, 2, 5, 7, -7};
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < 0) {
//                arr[i] = arr[i] * -1;
//            } else   {
//                arr[i] = -arr[i];
//            }
//            if (arr[i] < 0) {
//                System.out.println("Это число массива стало отрицательным = " + arr[i]);
//            } else System.out.println("Это число массива стало положительным = " + arr[i]);
//        }

        // Задача №9.
        // Разделить элементы массива на максимальный.

//        int[] arr = {2, 8, 12, 45, 54, 66, 54, 32, 7, 5, 3, 2, 5, 7, 7};
//        double maxElement = 0;
//        double result;
//        for (int i = 0; i < arr.length; i++) {
//            if (maxElement < arr[i]) {
//                maxElement = arr[i];
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < maxElement) {
//                result = arr[i] / maxElement;
//                System.out.println(result);
//            }
//        }

        // Задача №10.
        // Найти разность между максимальным и минимальным элементами массива.
//        int[] arr = {3, 8, 12, 45, 54, 66, 54, 32, 7, 5, 3, 1, 5, 7, 7};
//        int difference = 0;
//        int min = 1;
//        int max = 1;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[0] < arr[i]) {
//                arr[0] = arr[0];
//            } else {
//                arr[0] = arr[i];
//                min = arr[i];
//            }
//        }System.out.println("Минимальное значчение = " + min);
//        for (int i = 0; i < arr.length; i++) {
//            if (max < arr[i]) {
//                max = arr[i];
//            }
//        }
//        System.out.println("Максимальное значение = " + max);
//        difference = max-min;
//        System.out.println("Разность между большим и меньшим значениями = " + difference);

        // Задача №11.
        // Поменять местами минимальный и максимальный элементы массива.

//        int[] arr = {3, 8, 12, 45, 54, 66, 54, 32, 7, 5, 3, 1, 5, 7, 7};
//        int min = 1;
//        int max = 1;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[0] < arr[i]) {
//                arr[0] = arr[0];
//            } else {
//                arr[0] = arr[i];
//                min = arr[i];
//            }
//        }
//        System.out.println("Минимальное значение = " + min);
//        for (int i = 0; i < arr.length; i++) {
//            if (max < arr[i]) {
//                max = arr[i];
//            }
//        }
//        System.out.println("Максимальное значение = " + max);
//        arr[5] = min;
//        arr[11] = max;
//        System.out.println("Самое максимальное число и самое минимальное поменялись местами в общем массиве!");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        // Задача №12.
        // Найти количество положительных элементов массива.

//        int[] arr = {3, 8, -12, 45, -54, 66, 54, -32, 7, 5, -3, 1, 6, -7, 7};
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > 0) {
//                count++;
//            }
//        }
//        System.out.println("В массиве - " + count + " положительных чисел.");

        // Задача №13.
        // Количества отрицательных и положительных элементов в массиве.

//        int[] arr = {3, 8, -12, 45, -54, 66, 54, -32, 7, 5, -3, 1, 6, -7, 7};
//        int count_positive = 0;
//        int count_negative = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > 0) {
//                count_positive++;
//            } else count_negative++;
//        }
//        System.out.println("Количество отрицательных элементов = " + count_negative);
//        System.out.println("Количество положителных элементов = " + count_positive);

        // Задача №14.
        // Вывести элементы массива, которые больше среднего арифметического.

//        int[] arr = {1, 3, 5, 7, 9, 4, 3, 23, 4, 12, 31, 11, 15};
//        double average;
//        double sum = 0;
//        double count_value = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum = (sum + arr[i]);
//        }
//        average = sum / arr.length;
//        System.out.println("Среднее значение массива = " + average);
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > average)  {
//                count_value++;
//                System.out.println(arr[i]);
//            }
//        }
//        System.out.println("Столько значений массива больше чем его среднее арифметическое - " + (int) count_value);


        // Задача №15.
        // Элементы массива, которые больше предыдущего.


//        int[] arr = {1, 3, 5, 7, 9, 4, 3, 23, 4, 12, 31, 11, 15};
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > arr[i-1]) {
//                System.out.println(arr[i]);
//            }
//        }

        // Задача №16.
        // Определить индексы элементов массива, значение которых лежит в указанном пределе.

//        int[] arr = {1, 3, 5, 7, 9, 4, 3, 23, 4, 12, 31, 11, 15};
//        Scanner scanner = new Scanner(System.in);
//        int min = scanner.nextInt();
//        int max = scanner.nextInt();
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > min && arr[i] < max) {
//                System.out.println(i);
//            }
//        }

        // Задача №17.
        // Самая длинная последовательность, состоящая из одинаковых элементов.

//        int[] arr = {1, 2, 1, 1, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 1, 1, 2, 2, 1, 2, 1, 2, 2, 2, 1, 1, 1};
//        int count = 0;
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i-1] == arr[i]) {
//                count ++;
//                if (arr[i] != arr[i+1] ) {
//                    count = 0;
//                }
//            }
//        }System.out.println(count);


        // Выводит рамку * и содержимое #!

//        for (int i = 0; i < 9; i++) {
//            for (int j = 0; j < 9; j++) {
//                if (i == 0 || j == 0 || i == 8 || j == 8) {
//                    System.out.print("*" + "\t");
//                } else System.out.print("#" + "\t");
//            }
//            System.out.println();
//        }

        // Вывод главной диагонали!

//        for (int i = 0; i < 9; i++) {
//            for (int j = 0; j < 9; j++) {
//                if (i == j) {
//                    System.out.print("*" + "\t");
//                } else System.out.print(0 + "\t");
//            }
//            System.out.println();
//        }

        // Вывод побочной диагонали!

//        int size = 9;
//        for (int i = 0; i < 9; i++) {
//            for (int j = 0; j < 9; j++) {
//                if (i == size - j -1) {
//                    System.out.print("*" + "\t");
//                } else System.out.print(0 + "\t");
//            }
//            System.out.println();
//        }

        //Вывод треугольника под побочной диагональю и над ней!
//        int size = 9;
//        for (int i = 0; i < 9; i++) {
//            for (int j = 0; j < 9; j++) {
//             //   if (i == size - j - 1 || j == 0 || i == 0) {
//             //   if (i == size - j - 1 || j == 8 || i == 8) {
//                    System.out.print("*" + "\t");
//                } else System.out.print(0 + "\t");
//            }
//            System.out.println();
//        }

        // Выводит по очереди 1-у строку *, другую строку 0!
//        for (int i = 0; i < 9; i++) {
//            for (int j = 0; j < 9; j++) {
//                if (i % 2 == 0) {
//                    System.out.print("*" + "\t");
//                } else System.out.print(0 + "\t");
//            }
//            System.out.println();
//        }

//        for (int i = 0; i < 9; i++) {
//            for (int j = 0; j < 9; j++) {
//                if (i == j && i + j >= 8 || i + j == 8 && i >=4 || i == 8 || i + j ==9 && i > j || i + j ==10 && i > j || i + j ==11 && i > j || i + j ==12 && i > j || i + j ==13 && i > j ) {
//                    System.out.print("*" + "\t");
//                } else System.out.print(0 + "\t");
//            }
//            System.out.println();
//        }


    }
}

//        0(0,0)	0(0,1)	0(0,2)	0(0,3)	0(0,4)	0(0,5)	0(0,6)	0(0,7)	0(0,8)
//        0(1,0)	0(1,1)	0(1,2)	0(1,3)	0(1,4)	0(1,5)	0(1,6)	0(1,7)	0(1,8)
//        0(2,0)	0(2,1)	0(2,2)	0(2,3)	0(2,4)	0(2,5)	0(2,6)	0(2,7)	0(2,8)
//        0(3,0)	0(3,1)	0(3,2)	0(3,3)	0(3,4)	0(3,5)	0(3,6)	0(3,7)	0(3,8)
//        0(4,0)	0(4,1)	0(4,2)	0(4,3)	0(4,4)	0(4,5)	0(4,6)	0(4,7)	0(4,8)
//        0(5,0)	0(5,1)	0(5,2)	0(5,3)	0(5,4)	0(5,5)	0(5,6)	0(5,7)	0(5,8)
//        0(6,0)	0(6,1)	0(6,2)	0(6,3)	0(6,4)	0(6,5)	0(6,6)	0(6,7)	0(6,8)
//        0(7,0)	0(7,1)	0(7,2)	0(7,3)	0(7,4)	0(7,5)	0(7,6)	0(7,7)	0(7,8)
//        0(8,0)	0(8,1)	0(8,2)	0(8,3)	0(8,4)	0(8,5)	0(8,6)	0(8,7)	0(8,8)



















