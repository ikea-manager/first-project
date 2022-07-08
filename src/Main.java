
import com.sun.jdi.event.StepEvent;

import java.util.Scanner;

 public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         StepTracker stepTracker = new StepTracker();

        int command = -1;
        while (command != 0) {
            printMenu();

             command = scanner.nextInt();

            if (command == 1) {

                System.out.println("Какой сейчас месяц?");
                printMounth();
                int month = scanner.nextInt();
                System.out.println("Какое сейчас число?");
                int day = scanner.nextInt();
                System.out.println("Сколько шагов вы сегодня прошли?");
                int stepsPerDay = scanner.nextInt();
                stepTracker.addNumberStepsPerDay(month, day, stepsPerDay);

            } else if (command == 2) {
                System.out.println("За какой месяц вывести стасистику?");
                printMounth();
                int statsMounth = scanner.nextInt();
                System.out.println("Статистика за " + statsMounth + "-й месяц");
                stepTracker.findBestSerias(statsMounth);
                stepTracker.printStats(statsMounth);

            } else if (command == 3) {
                System.out.println("Поставте себе цель по количеству шагов в день:");
                stepTracker.goalStepsPerDay = scanner.nextInt();

            }
            else if (command == 0) {
                System.out.println();
            }  else {
                System.out.println("Извините, такой команды пока нет.");
            }
        }

        System.out.println("Программа завершена");
    }

        public static void printMenu() {
            System.out.println("Что вы хотите сделать? ");
            System.out.println("1 - Добавить количество шагов за день");
            System.out.println("2 - Вывести статистику шагов за месяц");
            System.out.println("3 - Изменить цель по количеству шагов за день");
            System.out.println("0 - Выход");
        }
        public static void printMounth() {
            System.out.println("0 - Январь");
            System.out.println("1 - Февраль");
            System.out.println("2 - Март");
            System.out.println("3 - Апрель");
            System.out.println("4 - Май");
            System.out.println("5 - Июнь");
            System.out.println("6 - Июль");
            System.out.println("7 - Август");
            System.out.println("8 - Сентябрь");
            System.out.println("9 - Октябрь");
            System.out.println("10 - Ноябрь");
            System.out.println("11 - Декабрь");
        }

    }

