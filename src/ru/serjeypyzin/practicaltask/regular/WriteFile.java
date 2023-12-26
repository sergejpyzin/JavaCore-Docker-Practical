package ru.serjeypyzin.practicaltask.regular;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

    public void fileWriter(String notes){

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("testNotes.txt", true))) {
            bufferedWriter.write(notes);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        } catch (IOException e) {
            System.out.println("Exception: " + e);
        }


    }
}
