package lesson3.homework;

import java.util.*;

public class PhoneBook implements PhoneBookInterface {

    private final Map<String, Set<String>> phonesBySurname = new TreeMap<>();

    public void add(String surname, String phoneNumber) {
        Set<String> phones = getPhones(surname);
        phones.add(phoneNumber);
    }

    private Set<String> getPhones(String surname) {
//        Set<String> phones = phonesBySurname.get(surname);
//        if (phones == null) {
//            phones = new HashSet<>();
//            phonesBySurname.put(surname, phones);
//        }
//        return phones;
        return phonesBySurname.computeIfAbsent(surname, key -> new HashSet<>());
    }

    public Set<String> get(String surname) {
        return getPhones(surname);
    }

    public Set<String> getAllSurnames() {
        return phonesBySurname.keySet();
    }

}
