package ESERCIZIO1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class MainES1 {
    static Logger log = LoggerFactory.getLogger(MainES1.class);

    ;

    public static void main(String[] args) {
        esercizio1();
    }

    static int randomNum() {
        return (int) (Math.floor(Math.random() * 10) + 1);
    }

    static void esercizio1() {
        Scanner sc = new Scanner(System.in);
        int[] pippo = new int[5];
        for (int i = 0; i < pippo.length; i++) {
            pippo[i] = randomNum();
        }
        for (int j : pippo) {
            System.out.println(j + ",");
        }
        while (true) {
            try {
                System.out.println("scegli la posizione del numero");
                int posizione = Integer.parseInt(sc.nextLine());
                if (posizione == 0) {
                    System.out.println("Termine programma!");
                    return;
                }
                pippo[posizione - 1] = randomNum();
                for (int i = 0; i < pippo.length; i++) {
                    System.out.println(i + ",");
                }
            } catch (NumberFormatException ex) {
                log.error("INSERISCI SOLO NUMERI!!");
            } catch (ArrayIndexOutOfBoundsException ex) {
                log.error("solo posizioni da 1 a 5!!");
            }
        }
    }
}
