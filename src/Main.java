import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        // Задача 1

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.printf("ФИО сотрудника - %s\n", fullName);


        // Задача 2

        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase(Locale.ROOT));

        // Задача 3

        String name = "Иванов Семён СемЁнович";
        System.out.println("Данные ФИО сотрудника —  " + name.replace("ё", "е").replace("Ё", "е"));

    }
}