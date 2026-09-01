package com.File;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    //FileWriter <--- OutputStreamWriter <--- Writer <--- Object
    //FileWriter Class is used for writing streams of character to files
    //character-based stream, best used for writing text rather than binary data
    //Constructors: FileWriter(String fileName): creates FileWriter object given the name of file to write to
    //FileWriter(File file): Creates a FileWriter Object given a File object
    /*Methods: write(int c) single character
    write(char[] cbuf) array of characters
     write(String str) string
     flush() flushes the stream, ensuring all data is written out, just a request, depend on JVM
     close() closes the stream, releasing any associated system resources
     */

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
