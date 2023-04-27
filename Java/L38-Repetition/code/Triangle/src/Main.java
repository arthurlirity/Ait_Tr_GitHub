import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = null; // сбрасываем буффер

                br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите 1-ую сторону треугольника");
        int a = Integer.parseInt(br.readLine());

        System.out.println("Введите 2-ую сторону треугольника");
        int b = Integer.parseInt(br.readLine());

        System.out.println("Введите 3-ую сторону треугольника");
        int c = Integer.parseInt(br.readLine());

        br.close();

        Triangle t1 = new Triangle(a,b,c);









    }
}