package com.File;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    static void main(String[] args) {
        //String fileName = "java-course.docx";
        //String fileName = "java-course.pdf";
        String fileName = "java-course.txt";

        //try with resources
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("This is the best java course");
            System.out.println();
            for (int i = 0; i < 1000; i++) {
                writer.write("#\n");
            }
            writer.flush();
            System.out.println("File written successfully");
        } catch (IOException e){
            System.out.printf("Exception occured %s", e.getMessage());
        }
    }
}
