import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        //### Задача 1
        // Повторить самостоятельно все методы работы с файлом:
        // создание / запись в файл / чтение из файла


        String path = "/Users/arthurlirity/Documents/GitHub/Ait_Tr_GitHub/L31-Files_IO/code/Homework31-1/";

        System.out.println("Creating a file");
        try {
            File myFile = new File(path + "new_file.txt");
            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        System.out.println( );
        System.out.println("Write to File");
        try {
            FileWriter myWriter = new FileWriter(path + "text.txt"); //
            myWriter.write("Hello World!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        System.out.println( );
        System.out.println("Read the test written in the file");
        try {
            File myFile = new File(path + "text.txt");
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

}