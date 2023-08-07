public class Main {
    public static void main(String[] args) {

        System.out.println("Homework 4");
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Task 1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека " + age
                    + ", то он совершеннолетний.\n");
        } else {
            System.out.println("Если возраст человека " + age
                    + ", то он не достиг совершеннолетия, нужно немного подождать.\n");
        }
    }

    public static void task2() {
        System.out.println("Task 2");
        int temperature = 10;
        if (temperature < 5) {
            System.out.println("На улице холодно " + temperature + " градусов, нужно одеть шапку.\n");
        } else {
            System.out.println("Сегодня тепло " + temperature + " градусов, можно идти без шапки.\n");
        }
    }

    public static void task3() {
        System.out.println("Task 3");
        int speed = 62;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придётся заплатить штраф.\n");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно.\n");
        }
    }

    public static void task4() {
        System.out.println("Task 4");
        int age = 23;
        boolean isKindergartenAge = (age >= 2) && (age <= 6);
        boolean isSchoolAge = (age >=7) && (age < 18);
        boolean isUniverAge = (age >= 18) && (age <= 24);
        boolean isWorkAge = (age > 24) && (age < 60);

        if (age < 2) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора спать.");
        }else if(isKindergartenAge) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в садик.\n");
        } else if (isSchoolAge) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.\n");
        } else if (isUniverAge) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет.\n");
        } else if (isWorkAge) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу.\n");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он может отдохнуть.\n");
        }
    }

    public static void task5() {
        System.out.println("Task 5");
        int childAge = 10;
        if (childAge < 5) {
            System.out.println("Если возраст ребёнка " + childAge
                    + ", то ему нельзя кататься на аттракционе.\n");
        } else if (childAge > 5 && childAge < 14) {
            System.out.println("Если возраст ребёнка " + childAge
                    + ", то ему можно кататься на аттракционе в сопровождении взрослого.\n");
        } else {
            System.out.println("Если возраст ребёнка " + childAge
                    + ", то ему можно кататься на аттракционе без сопровождения взрослого.\n");
        }
    }

    public static void task6() {
        System.out.println("Task 6");
        int allPlaces = 102;
        int seatPlaces = 60;
        int standingPlaces = allPlaces - seatPlaces;
        int seatPlacesOccupied = 60;
        int standingPlacesOccupied = 27;
        if (seatPlacesOccupied < seatPlaces) {
            System.out.println("В вагоне есть ещё " + (seatPlaces - seatPlacesOccupied) + " сидячих мест.\n");
        } else if (standingPlacesOccupied < standingPlaces) {
            System.out.println("В вагоне есть ещё " + (standingPlaces - standingPlacesOccupied) + " стоячих мест.\n");
        } else {
            System.out.println("Вагон полностью забит.\n");
        }
    }

    public static void task7() {
        System.out.println("Task 7");
        int one = 30;
        int two = 32;
        int three = 4;
        if (one > two && one > three) {
            System.out.println("Наибольшее число one = " + one + ".\n");
        } else if (two > three) {
            System.out.println("Наибольшее число two = " + two + ".\n");
        } else {
            System.out.println("Наибольшее число three = " + three + ".\n");
        }
    }
}