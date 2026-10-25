package file;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class RobustFileReader {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the file name, you wish to read: ");
        String fileName = sc.next();

        try(FileReader reader = new FileReader(fileName)){
            int read;
            while((read = reader.read()) != -1){
                System.out.print((char) read);
            }
        } catch(FileNotFoundException exception){
            System.out.printf("%s -> this file notes not found", fileName);
        } catch (IOException exception){
            System.out.printf("Exception: ", exception.getMessage());
        }
    }
}
