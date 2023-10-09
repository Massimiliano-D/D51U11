package ESERCIZIO2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class MainES2 {
    public static void main(String[] args) {
        esercizio2();
    }

    static void esercizio2() {
        Scanner sc = new Scanner(System.in);
        Logger log = LoggerFactory.getLogger(MainES2.class);
        while (true) {
            try {
                System.out.println("Inserisci litri");
                int litri = Integer.parseInt(sc.nextLine());
                System.out.println("Quanti chilometri?");
                int km = Integer.parseInt(sc.nextLine());
                int result = km / litri;
                System.out.println(result + "km/l");
            } catch (ArithmeticException ex) {
                log.error("FAI RIFORNIMENTO!!");
            }
            ;
        }
    }
}
