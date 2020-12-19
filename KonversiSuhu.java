package pbo;

import tugas5.Celcius;
import tugas5.Fahrenheit;
import tugas5.Kelvin;
import tugas5.Reamur;

import java.util.Scanner;

public class KonversiSuhu {
    public static double suhuAwal;
    public static String suhu;
    public static void main(String[] args) {

        Fahrenheit fahrenheit = new Fahrenheit();
        Reamur reamur = new Reamur();

        Kelvin kelvin = new Kelvin();
        Celcius celcius = new Celcius();


        Scanner input = new Scanner(System.in);
        System.out.print("Suhu : ");
        suhu = input.next();
        System.out.println("Target Suhu : " );
        double targetSuhu = input.nextDouble();

        System.out.println("Suhu awal : " +suhuAwal);

    }
}