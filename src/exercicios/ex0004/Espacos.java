package exercicios.ex0004;

import java.util.Scanner;

public class Espacos {
    public static void main(String[] args) {
        System.out.print("Digite um palavra ou fazer: ");
        Scanner s = new Scanner(System.in);
        String str = s.next();

        System.out.println(str);
        for (int i = 0; i < str.length() ; i++) {
            System.out.print(str.charAt(i) + " ");
        }

    }
}
