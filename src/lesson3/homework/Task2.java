package lesson3.homework;

import java.util.Set;

public class Task2 {

    public static void main(String[] args) {
        PhoneBookInterface phoneBook = new PhoneBook();
        phoneBook.add("Ivanov", "111-11-11");
        phoneBook.add("Petrov", "222-22-22");
        phoneBook.add("Ivanov", "333-33-33");
        phoneBook.add("Sidorov", "444-44-44");

        Set<String> allSurnames = phoneBook.getAllSurnames();
        for (String surname : allSurnames) {
            Set<String> phones = phoneBook.get(surname);
            System.out.printf("%s: %s%n", surname, phones);
        }
    }
}
