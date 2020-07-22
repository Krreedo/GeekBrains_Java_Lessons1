package ru.geekbrains.Java_1;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Random;

public class HW2 {

    public static void main(String[] args) {
        // 1-е задание
        int[] arrBinary = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        arrBinarySwitch (arrBinary);
        // 2-е задание
        int[] arrComplete = new int[8];
        arrFillWithNumbers(arrComplete);
        // 3-е задание
        int[] arrSelect = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        arrMultiply(arrSelect);
        // 4-е задание
        int[][] emptyMatrix = new int [5][5];
        arrDiagonalFill(emptyMatrix);
        // 5-е задание
        int[] arrMinMaxElem = new int [randomNumber(5,15)]; // Решил задать массив рандомного размера от 5 до 15 и забить случайными цифрами от 0 до 100
        for (int i = 0; i < arrMinMaxElem.length ; i++) {
            arrMinMaxElem[i] = randomNumber(0,100);
        }
        // System.out.println(Arrays.toString(arrMinMaxElem)); // вывожу массив для проверки.
        minMaxElemFinder(arrMinMaxElem);
        // 6-е задание
        int[] magicArr = new int[randomNumber(4,10)];
        for (int i = 0; i < magicArr.length ; i++) {
            magicArr[i] = randomNumber(0,4);
        }
        // System.out.println(Arrays.toString(magicArr)); // вывожу массив для проверки.
        boolean check = checkBalance(magicArr);
        System.out.println(check);
        // 7-е задание
        int[] arrLast = {1,2,3,4,5,6,7,8,9};
        System.out.println("Начальный массив: " + Arrays.toString(arrLast));
        moveArray(arrLast,randomNumber(-5,5));

    }
    // 1-е задание
    public static void arrBinarySwitch(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0){
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    // 2-е задание
    public static void arrFillWithNumbers(int[] arr) {
        int[] fullArr = {0,3,6,9,12,15,18,21};
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=fullArr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
    // 3-е задание
    public static void arrMultiply(int[] arr) {
        for (int i = 0; i < arr.length; i++) if (arr[i] < 6) arr[i] *= 2;
        System.out.println(Arrays.toString(arr));
    }
    // 4-е задание
    public static void arrDiagonalFill(int[][] arr){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i==j || i+j==arr[i].length-1){
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    // 5-е задание
    public static int randomNumber(int startNumber, int lastNumber){ //Сделал метод для генерации рандомных чисел от начального числа до конечного числа (например от 0 до 25), думаю в будущем может пригодиться.
        Random number = new Random();
        int bound = lastNumber - startNumber + 1;
        return number.nextInt(bound) + startNumber;
    }

    public static void minMaxElemFinder (int[] arr) {
        int minElem = arr[1];
        int maxElem = arr[1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxElem) maxElem = arr[i];
            if (arr[i] < minElem) minElem = arr[i];

        }
        System.out.printf("Максимальный элемент массива = %d, а минимальный = %d%n", maxElem,minElem);

    }

    // 6-е задание
    public static boolean checkBalance (int[] arr){
        int leftside = arr[0];
        int sum;
        for (int i = 1; i < arr.length ; i++) {
            sum = arrSum (arr, i);
            if(leftside == sum){
                return true;
            }
            leftside = leftside + arr[i];
        }
        return false;
    }

    public static int arrSum (int[] arr, int n){
        int sum = 0;
        for (int i = n; i < arr.length ; i++) sum = sum + arr[i];
        return sum;
    }
    // 7-е задание
    public static void moveArray (int[] arr, int n) {
        int[] newArr = new int[arr.length];
        int j = 0;
        if (n >= 0) {
            for (int i = 0; j < arr.length; i++) {
                if (i + n > arr.length - 1) {
                    newArr[i + n - arr.length] = arr[i];

                } else {
                    newArr[i + n] = arr[i];
                }

                j++;
            }
        } else {
            for (int i = 0; j < arr.length; i++) {
                if (i + n < 0) {
                    newArr[arr.length + i + n ] = arr[i];

                } else {
                    newArr[i + n] = arr[i];
                }

                j++;

            }

        }
        System.out.println("Смещенный массив: (Длина шага равна " + n + ") " + Arrays.toString(newArr));
    }
}
