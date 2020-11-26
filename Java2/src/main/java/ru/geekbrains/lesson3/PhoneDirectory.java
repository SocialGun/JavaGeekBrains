package ru.geekbrains.lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class PhoneDirectory {
    public static void main(String[] args) {
        PhoneDirectory ph1 = new PhoneDirectory();
        ph1.add("Ivanov", "89929403041");
        ph1.add("Frolov", "82993809280");
        ph1.add("Ivanov", "89062346992");
        ph1.add("Sokolov", "83904820354");
        ph1.add("Rikov", "89472083570");
        ph1.add("Rikov", "89472083570");
        ph1.add("Jukov");

        ph1.get("Ivanov");
        ph1.get("Bikov");
        ph1.get("Rikov");
        ph1.get("Jukov");

        ph1.add("Jukov", "89062346992");
        ph1.get("Jukov");
    }

    HashMap<String, ArrayList<String>> phDir;

    private PhoneDirectory() {
        this.phDir = new HashMap<>();
    }

    private void get(String name) {
        System.out.println(name + ": " + phDir.getOrDefault(name, phDir.get(name)));
    }

    private void add(String name) {
        phDir.put(name, new ArrayList<>());
    }
    private void add(String name, String phone) {
        if (phDir.containsKey(name)) {
            ArrayList<String> phoneList = phDir.get(name);
            if (!phoneList.contains(phone)) phoneList.add(phone);
            else System.out.println("Номер " + phone + " уже существует для данного абонента: " + name);
        } else phDir.put(name, new ArrayList<>(Arrays.asList(phone)));
    }
}