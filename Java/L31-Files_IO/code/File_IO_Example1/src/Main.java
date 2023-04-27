import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Пример работы с файлом - Создание нового файла");

        String path = "/Users/arthurlirity/IdeaProjects/ait-tr/L31-Files_IO/File_IO_Example1/src/";

        try {
            File myFile = new File(path + "text.txt");
            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // Запись файла в тексте
        System.out.println("Пример работы с файлом - Запись в файл");
        try {
            FileWriter myWriter = new FileWriter(path + "text.txt"); // используем класс и его метод
            myWriter.write("Files in Java might be tricky, but it is fun enough! Test"); // Пишем то, что записываем в файл
            myWriter.close(); // Закрываем метод
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // Чтение файла
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



