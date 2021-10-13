package ba.unsa.etf.rpr;

import java.util.Scanner;

public class BrojeviDjeljiviZbiromCifara {

    private static int sumaCifara(int n){
        int suma = 0;
        if(n < 0) n = n * -1;
        while(n != 0){
            suma = suma + n % 10;
            n = n / 10;
        }
        return suma;
    }

    public static void main(String[] arg) {

        Scanner ulaz = new Scanner(System.in);
        int n;

        while (true) {
            try {
                System.out.println("Unesite prirodan broj n: ");
                n = ulaz.nextInt();
                if( n < 1){
                    System.out.println("Uneseni broj nije prirodan, molimo pokusajte ponovo!");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Uneseni broj nije prirodan, molimo pokusajte ponovo!");
                ulaz.nextLine();
            }
        }

        for (int i = 1; i < n + 1; i++) {
            if (i % sumaCifara(i) == 0 ) {
                System.out.print(i + " ");
            }
        }
    }
}

