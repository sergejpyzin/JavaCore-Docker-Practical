package ru.serjeypyzin.practicaltask.regular;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class UserInteraction {

    public static void runApp() {
        WriteFile writer = new WriteFile();
        System.out.println("Здравствуйте вы запустили тестовое приложение для добавления заметок.");
        writer.fileWriter(formingNotes());
    }

    private static String formingNotes() {
        try (Scanner scanner = new Scanner(System.in)) {
            LocalDateTime localDateTime = LocalDateTime.now();
            String dateTimeString = localDateTime.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));

            System.out.println("Введите заметку:");
            String notes = scanner.nextLine();

            return dateTimeString + " -> " + notes;
        } catch (NoSuchElementException e) {
            System.out.println("Ошибка нахождения следующей строки: " + e);
            return null;
        }
    }
}
