public class Main {
    public static void main(String[] args) {

        // Задача 1
        int age = 111;
        boolean isAdult = age >= 18;
        if (isAdult) {
            System.out.printf("Если возраст человека равен %d лет, то он совершеннолетний\n\n", age);
        } else {
            System.out.printf("Если возраст человека равен %d лет, то он не достиг совершеннолетия, нужно немного подождать\n\n", age);
        }

        // Задача 2
        int temperature = 4;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку\n");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки\n");
        }

        // Задача 3
        int currentSpeed = 61;
        if (currentSpeed > 60) {
            System.out.println("Если скорость " + currentSpeed + ", то придется заплатить штраф\n");
        } else {
            System.out.println("Если скорость " + currentSpeed + ", то можно ездить спокойно\n");
        }

        // Задача 4
        int currentAge = 150;
        if (currentAge < 2) {
            System.out.println("Если возраст человека равен " + currentAge + ", то ему пора спать\n");
        } else if (currentAge >= 2 && currentAge <= 6) {
            System.out.println("Если возраст человека равен " + currentAge + ", то ему нужно ходить в детский сад\n");
        } else if (currentAge >= 7 && currentAge < 18) {
            System.out.println("Если возраст человека равен " + currentAge + ", то ему нужно ходить в школу\n");
        } else if (currentAge >= 18 && currentAge <= 24) {
            System.out.println("Если возраст человека равен " + currentAge + ", то ему нужно ходить в университет\n");
        } else if (currentAge > 24 && currentAge <= 60) {
            System.out.println("Если возраст человека равен " + currentAge + ", то ему нужно ходить на работу\n");
        } else {
            System.out.println("Если возраст человека равен " + currentAge + ", то он может отдохнуть\n");
        }

        // Задача 5
        int kidAge = 34;
        if (kidAge < 5) {
            System.out.println("Если возраст ребенка равен " + kidAge + ", то ему нельзя кататься на аттракционе\n");
        } else if (kidAge >= 5 && kidAge < 14) {
            System.out.println("Если возраст ребенка равен " + kidAge + ", то ему можно кататься на аттракционе в сопровождении взрослого\n");
        } else {
            System.out.println("Если возраст ребенка равен " + kidAge + ", то ему можно кататься на аттракционе без сопровождения взрослого\n");
        }

        // Задача 6
        int carriageCapacity = 102;
        int seatsCount = 60;
        int passengersCount = 35;
        if (passengersCount < seatsCount) {
            System.out.println("В вагоне есть свободные сидячие места\n");
        } else if (passengersCount >= seatsCount && passengersCount < carriageCapacity) {
            System.out.println("В вагоне есть свободные стоячие места\n");
        } else {
            System.out.println("В вагоне нет свободных мест\n");
        }

        // Задача 7
        int one = 345;
        int two = 345;
        int three = 351151515;
        int biggestInt;
        if (one >= two && one >= three) {
            biggestInt = one;
        } else if (two >= one && two >= three) {
            biggestInt = two;
        } else {
            biggestInt = three;
        }
        System.out.println("Наибольшее число равно " + biggestInt);
    }
}