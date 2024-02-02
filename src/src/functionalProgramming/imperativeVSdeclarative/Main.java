package functionalProgramming.imperativeVSdeclarative;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static functionalProgramming.imperativeVSdeclarative.Main.Gender.*;

public class Main {

    public static void main(String[] args) {


        System.out.println("//Imperative approach");

        List<Person> people= List.of(
             new Person("neha",FEMALE),
                new Person("Jaskaran",MALE),
                new Person("Apoorva", FEMALE));




        for (Person person:people){
            System.out.println(person);
        }
        Instant start_time= Instant.now();
        System.out.println("*****************************************************");
        List<Person> females= new ArrayList<>();

        for (Person person:people){
            if (FEMALE.equals(person.gender)){
                females.add(person);
            }

        }

        for (Person person:females){
            System.out.println(person);
        }

        Instant end_time= Instant.now();
        Duration timeTaken= Duration.between(start_time,end_time);
        System.out.println(timeTaken);
        System.out.println("//Declarative approach");

        Instant start_time1= Instant.now();
//Predicate<T> :: represents a predicate (boolean valued function) of one argument
// person -> FEMALE.equals(person.gender) :: is also a predicate which is defined directly in the filter method
        List<Person> females2= people.stream()
                .filter(person -> FEMALE.equals(person.gender))
                .collect(Collectors.toList());

        females2.forEach(System.out::println);
        Instant end_time1= Instant.now();
        Duration timeTaken1= Duration.between(start_time1,end_time1);
        System.out.println(timeTaken1);
    }




    static  class Person{

        private final String name;
        private final Gender gender;

        public String getName() {
            return name;
        }

        public Gender getGender() {
            return gender;
        }

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender{
        MALE, FEMALE
    }

}
