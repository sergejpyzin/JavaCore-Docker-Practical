package ru.serjeypyzin.practicaltaskwithoutcontainer.regular;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class WriteFile {

    public void fileWriter(String notes){

            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("testNotes.txt", StandardCharsets.UTF_8, true))) {
                bufferedWriter.write(notes);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            } catch (IOException e) {
                System.out.println("Exception: " + e);
            }
    }

}
