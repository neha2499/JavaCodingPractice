package functionalProgramming.streams;
import java.util.List;
import java.util.stream.Collectors;

import static functionalProgramming.streams._Stream.Gender.*;


public class _Stream {

    public static void main(String[] args) {
        List<Person> people= List.of(
                new Person("neha",FEMALE),
                new Person("Jaskaran",MALE),
                new Person("Apoorva", FEMALE));


//
//        people.stream()
//                .map(person -> person.gender)
//                .collect(Collectors.toSet())
//                .forEach(System.out::println);
//    }


       boolean containsOnlyfemales = people.stream()
                .allMatch(person -> FEMALE.equals(person.gender));

        System.out.println(containsOnlyfemales);
    }






    static class Person {

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

    enum Gender {
        MALE, FEMALE
    }
}