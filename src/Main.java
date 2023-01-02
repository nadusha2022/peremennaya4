public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 20;
        System.out.println("Человеку" + " " + age + " " + "лет");
        if (age >= 18) {
            System.out.println("Если возраст человека равен" + " " + age +
                    " " + " " + ", то он совершеннолетний.");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен" + " " + age
                    + " " + " " + ",то он не достиг совершеннолетия, нужно немного подождать.");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int temp = 7;
        if (temp > 5) {
            System.out.println("На улице" + " " + temp + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице" + " " + temp + " градусов, можно идти без шапки");
        }
    }


    public static void task3() {
        System.out.println("Задача 3");
        int speed = 50;
        if (speed < 60) {
            System.out.println("Если скорость" + " " + speed + " км/ч, то можно ездить спокойно");
        }
        if (speed > 60) {
            System.out.println("Если скорость" + " " + speed + " км/ч, то придется заплатить штраф");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int age = 2;
        if (age >= 2 && age < 6) {
            System.out.println("Если возраст человека равен" + " " + age + " лет" + " ,то ему нужно ходить в детский сад");
        }
        int age1 = 7;
        if (age1 >= 7 && age1 < 18) {
            System.out.println("Если возраст человека равен" + " " + age1 + " лет" + " ,то ему нужно ходить в школу");
        }
        int age2 = 18;
        if (age2 >= 18 && age2 < 24)
            System.out.println("Если возраст человека равен" + " " + age2 + " лет" + " ,то его место в университете");
        int age3 = 24;
        if (age3 >= 24)
            System.out.println("Если возраст человека равен" + " " + age3 + " лет" + " ,то ему пора ходить на работу");
    }

    public static void task5() {
        System.out.println("Задача 5");
        int ageChild = 4;
        if (ageChild <= 5) {
            System.out.println("Если возраст ребенка равен" + " " + ageChild + " лет" + " ,то ему нельзя кататься на аттракционе без сопровождения взрослого.");
        }
        int ageChild1 = 6;
        if (ageChild1 >= 5 && ageChild1 < 14) {
            System.out.println("Если возраст ребенка равен" + " " + ageChild1 + " лет" + " ,то ему можно кататься только в сопровождении взрослого.");
        }
        int ageChild2 = 15;
        if (ageChild2 >= 14) {
            System.out.println("Если возраст ребенка равен" + " " + ageChild2 + " лет" + " ,то он может кататься без сопровождения взрослого.");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int c = 102;
        int a = 60;
        int b = c - a;
        if (a <= 102) {
            System.out.println("Вместимость одного вогона поезда - 102 человека из них 60 сидячих мест и " + b + " стоячих мест");
        } else {
            System.out.println("В вагоне" + a + " сидячих мест" + b + "стоячих мест");
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (two >= 1) {
            System.out.println("Если" + two + "больше чем " + one + " то цифра " + three + " больше чем 2 или 1");
        } else {
            System.out.println("то цифра " + three + "больше чем 2 или 1");
        }
    }
}
