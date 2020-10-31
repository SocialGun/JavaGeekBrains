package ru.geekbrains.lesson5;

public class Staff_Test {
    public static void main(String[] args) {
        Staff[] staffArray = new Staff[5];
        staffArray[0] = new Staff("Glushkov Tihon", "Engineer",
                "yaktih@gmail.com", "84954283163", 80000,
                55);
        staffArray[1] = new Staff("Kolosov Vicentii", "Artist",
                "kolosVi@icloud.com", "89999973536", 100000,
                23);
        staffArray[2] = new Staff("Ogurtsov Ascold", "Plumber",
                "ogucold@mail.ru", "89962812790", 40000,
                47);
        staffArray[3] = new Staff("Nikeshina Marianna", "Ballerina",
                "nimari@gmail.com", "89255260323", 160000,
                25);
        staffArray[4] = new Staff("Siyanceva Raisa", "Teacher",
                "rayaSiya@mail.ru", "89165126853", 20000,
                62);
        for (Staff staff : staffArray) {
            if (staff.getAge() > 40) staff.staffInfo();
        }
    }
}
