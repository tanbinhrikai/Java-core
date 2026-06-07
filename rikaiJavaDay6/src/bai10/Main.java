package bai10;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    private static final TreeMap<String, List<String>> phoneBook =
            new TreeMap<>();

    public static void main(String[] args) {

        addContact("An", "0901234567");
        addContact("Bao", "0912345678");
        addContact("An", "0987654321");
        addContact("Chi", "0901111111");
        addContact("Chi", "0902222222");

        printContacts();

        System.out.println(findContact("An"));


        findByPrefix("A");

        removePhoneNumber("An", "0901234567");

        printContacts();
    }

    public static void addContact(
            String name,
            String phoneNumber
    ) {

        phoneBook
                .computeIfAbsent(name, key -> new ArrayList<>())
                .add(phoneNumber);
    }

    public static List<String> findContact(String name) {
        return phoneBook.get(name);
    }

    public static void printContacts() {

        phoneBook.forEach((name, phoneNumbers) ->
                System.out.println(
                        name + ": " + phoneNumbers
                )
        );
    }

    public static void findByPrefix(String prefix) {

        Map<String, List<String>> result =
                phoneBook.subMap(
                        prefix,
                        prefix + Character.MAX_VALUE
                );

        result.forEach((name, phoneNumbers) ->
                System.out.println(
                        name + ": " + phoneNumbers
                )
        );
    }

    public static void removePhoneNumber(
            String name,
            String phoneNumber
    ) {

        List<String> phoneNumbers =
                phoneBook.get(name);

        if (phoneNumbers == null) {
            return;
        }

        phoneNumbers.remove(phoneNumber);

        if (phoneNumbers.isEmpty()) {
            phoneBook.remove(name);
        }
    }
}