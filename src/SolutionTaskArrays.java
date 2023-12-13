import java.util.Arrays;

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

        int[] arr = {3, 8, -12, 45, -54, 66, 54, -32, 7, 5, -3, 1, 6, -7, 7};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count++;
            }
        }
        System.out.println("В массиве - " + count + " положительных чисел.");
    }
}
