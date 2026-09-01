package com.File;

import java.io.FileReader;
import java.io.IOException;

public class Reader {
    //FileReader class is used for reading streams of characters from files
    //character based stream, reads characters, this make it suitable for reading text files
    //Constructors: FileReader(String fileName): creates FileReader object to read from specific named file
    //FileReader(File file): Creates FileReader object to read from specific file object
    //Methods: read() -> read single character, returns integer, return -1 at the end of stream reached
    //read(char[] cbuf) -> read characters into array and returns the number of character read

    static void main(String[] args) {
        String fileName = "java-course.txt";

        try(FileReader reader = new FileReader(fileName)){
            int read = 0;
            do{
                read = reader.read();
                System.out.print((char) read);
            }while(read != -1);

        } catch (IOException e){
            System.out.printf("Error %s", e.getMessage());
        }
    }
}
