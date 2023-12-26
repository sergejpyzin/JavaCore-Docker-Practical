package ru.serjeypyzin.practicaltask.regular;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

    public void fileWriter(String notes){
        String externalFilePath = System.getenv("EXTERNAL_FILE_PATH");
        if (externalFilePath != null) {
            String filePath = "/out/" + externalFilePath;
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath, true))) {
                bufferedWriter.write(notes);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            } catch (IOException e) {
                System.out.println("Exception: " + e);
            }
        } else {
            System.out.println("Переменная среды EXTERNAL_FILE_PATH не установлена.");
        }


    }
}
