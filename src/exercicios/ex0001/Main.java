package exercicios.ex0001;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner oneScanner = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        int numberOne = oneScanner.nextInt();

        Scanner twoScanner = new Scanner(System.in);
        System.out.print("Digite o segundo numero: ");
        int numberTwo = twoScanner.nextInt();

        System.out.println("A soma entre "+ numberOne + " + "+numberTwo+" = "+(numberTwo+numberOne));




    }

}