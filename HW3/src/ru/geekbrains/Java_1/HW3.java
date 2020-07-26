package ru.geekbrains.Java_1;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        gaming();
    }

    public static void gaming() {
        System.out.println("Выберите игру. Введите 1, чтобы поиграть в Угадай число, или 2, чтобы поиграть в Угадай слово. Для завершения программы напишите Exit или 0");
        Scanner sc = new Scanner(System.in);
        int chosenGame = sc.nextInt();
        if(chosenGame == 1) {
            guessGame();
        }
        if(chosenGame == 2){
            wordGuessGame();
        }
        if (chosenGame !=1 || chosenGame != 2){
            System.out.println("До свидания!");
        }
    }

    public static void guessGame() {
        int maxTryCount = 3;
        int answer = randomNumber(0,9);
        System.out.println("Я загадал число от 0 до 9.Попробуй угадать за " + maxTryCount + " попытки");
        System.out.println("Введите число: ");

        for (int trycount = 0; trycount < maxTryCount+1; trycount++) {
            Scanner sc = new Scanner(System.in);
            int userAnswer = sc.nextInt();
            if (userAnswer == answer){
                System.out.println("Поздравляю вы победили! Загаданное число: " + answer);
                gaming();
            }
            if (userAnswer < answer){
                System.out.println("Неверно, загаданное число больше, осталось попыток: " + (maxTryCount-trycount-1));
            }
            if (userAnswer > answer){
                System.out.println("Неверно, загаданное число меньше, осталось попыток: " + (maxTryCount-trycount-1));
            }
            if (trycount == maxTryCount-1){
                System.out.println("Вы проиграли. Правильный ответ: " + answer);
                System.out.println("Хотите попробовать еще раз? Введите 1");
                userAnswer = sc.nextInt();
                if (userAnswer == 1){
                    guessGame();
                } else {
                    gaming();
                }
            }
        }
    }

    public static int randomNumber(int startNumber, int lastNumber) {
        Random number = new Random();
        int bound = lastNumber - startNumber + 1;
        return number.nextInt(bound) + startNumber;
    }

    public static void wordGuessGame() {
        String [] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        System.out.println("Я загадал одно слово на английском фрукт, овощ или ягоду, попробуй отгадать!");
        String answer = words[randomNumber(0,words.length-1)];
        System.out.println("Введите слово:");
        Scanner sc = new Scanner(System.in);
        String userAnswer = sc.next();
        String comparesAnswer;
        while(!userAnswer.equals(answer)){
            comparesAnswer = answerCompare(userAnswer,answer);
            System.out.println("Неверно, попробуй еще раз. Если ты угадал несколько букв, то я тебе открою часть слова: ");
            System.out.println(comparesAnswer);
            userAnswer = sc.next();
        }
        System.out.println("Поздравляю! " + answer + " это правильный ответ!");
        gaming();
    }

    public static String answerCompare(String userAnswer,String answer){

        String answerCompare = "";
        if(answer.length() > userAnswer.length()){
            for (int i = 0; i < userAnswer.length(); i++) {
                if(Objects.equals(answer.charAt(i), userAnswer.charAt(i))){
                    answerCompare += answer.charAt(i);
                } else {
                    answerCompare += "#";
                }
            }
        } else{
            for (int i = 0; i < answer.length(); i++) {
                if(Objects.equals(answer.charAt(i), userAnswer.charAt(i))){
                    answerCompare += answer.charAt(i);
                } else {
                    answerCompare += "#";
                }
            }
        }

        while (answerCompare.length()<15){
            answerCompare +="#";
        }
        return answerCompare;
    }

}
