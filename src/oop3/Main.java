package oop3;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String space = "........................";

        // Задача 1 and 2  Cars
        List<Car> cars = Arrays.asList(Car.values());
        // 2.1 search by index
        System.out.println(cars.get(4).getBrand());
        // 2.2  search by keyword
        for (Car car : cars) {
            if (car.getBrand().equalsIgnoreCase("LEXUS"))
                System.out.println(car.getBrand());
        }
        System.out.println(space);


        // Задача 3 и 4

        int[] numbers = {23, 43, 23, 216, 53, 23, 4, 6, 23, 45, 67, 2};
        ArrayList<Integer> listIntegers = new ArrayList<>();
        for (int i : numbers) {
            listIntegers.add(i);
        }

        int biggerThan45 = 0;
        int lessThan45 = 0;
        for (int num : listIntegers) {
            if (num > 45)
                biggerThan45++;
            if (num < 45)
                lessThan45++;
        }

        System.out.println(biggerThan45);
        System.out.println(lessThan45);
        System.out.println(space);

        // Задача 5
        String[] citiesArray = {"LA", "NEW YORK", "SAN FRANCISCO", "PARIS",
                "MOSCOW", "TOKYO", "PHILADELPHIA"};
        List<String> cities = new ArrayList<>(Arrays.asList(citiesArray));

        for (String city : cities) {
            System.out.printf("In position %d is %s\n", cities.indexOf(city), city);
        }
        System.out.println(space);


        // Задача 6 methods min() max()

        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(23, 43, 23, 216, 53, 23, 4, 6, 23, 45, 67, 2));
        System.out.println(Collections.max(num));
        System.out.println(Collections.min(num));

        System.out.println(space);


        // Задача 7
        int[] num2 = {3, 9, 2, 12, 4, 5, 11, 13};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : num2) {
            list.add(i);
        }

        int sum = 0;
        for (int numb : list) {
            sum += (numb + 3);
        }

        System.out.println(sum);
        System.out.println(space);


        // Задача 8
        // first 3 elements
        for (int i = 0; i < 3; i++) {
            System.out.println( "First 3 Elements in array: " + numbers[i]);
            System.out.println( "First 3 Elements in list: " + listIntegers.get(i));
        }
        System.out.println(space);

        // last 4 elements
        for (int i = numbers.length - 1; i > numbers.length - 5; i--) {
            System.out.println("Last 4 Elements in array: " + numbers[i]);
            System.out.println("Last 4 Elements in list: " + listIntegers.get(i));
        }
        System.out.println(space);


        // Задача 9
        Collections.sort(listIntegers);
        System.out.println(listIntegers);
        System.out.println(space);


        //Задача 10
        List<Person> people = Arrays.asList(new Person("Bektur", 15),
                new Person("Mahabat", 21),
                new Person("Nargiza", 25),
                new Person("Janara", 55),
                new Person("Bekbulat", 27),
                new Person("Max", 18),
                new Person("Abdullo", 17),
                new Person("Teo", 59),
                new Person("Jazya", 12),
                new Person("Klara", 45));

        List<Person> adults = new ArrayList<>();

        for (Person person : people) {
            if (person.getAge() >= 18)
                adults.add(person);
        }

        for (Person adult : adults) {
            System.out.printf("Name: %s age %d\n", adult.getName(), adult.getAge());
        }

    }



}
