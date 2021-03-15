/* Даниил Лазарев
Домашняя работа к 3 занятию.
 */
package com.company;
import java.util.*;

class Main {
      static Random random = new Random();
      static Scanner sc = new Scanner(System.in);

      public static void main(String... args) {

          //Задание №1
          Scanner input = new Scanner(System.in);
          Random numbers = new Random();
          int try3 = 0;
          int random = numbers.nextInt(9);
          System.out.print("Угадай число с трех раз,");

          while (try3 < 3) {
              System.out.print(" введи от 0 до 9: ");
              int number = input.nextInt();

              if (number > random) {
                  System.out.println("Слишком много! давай поменьше:");
                  System.out.println("");
              } else if (number < random) {
                  System.out.println("Маловато, давай побольше:");
                  System.out.println("");
              } else if (number == random) {
                  System.out.println("Ты отгадал!");
                  System.out.println("");
              }
              try3++;
          }
          System.out.print("К сожалению, ваши попытки закончились. Начать игру заново? Да? жми 1; Нет? нажми 0:");

          String userData = input.next();
          if (userData.equals("1")) {
              main(null);
          }
      }
  }