package ru.serjeypyzin.practicaltask.regular;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class UserInteraction {

    public static void runApp() {
        WriteFile writer = new WriteFile();
        System.out.println("Здравствуйте вы запустили тестовое приложение для добавления заметок.");
        writer.fileWriter("test.txt", formingNotes());
    }

    private static String formingNotes(){
        Scanner scanner = new Scanner(System.in);
        LocalDateTime localDateTime = LocalDateTime.now();
        String dateTimeString = localDateTime.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
        System.out.println("Введите заметку:");
        return dateTimeString + "->" + scanner.nextLine();
    }
}
