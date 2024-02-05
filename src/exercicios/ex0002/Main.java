package exercicios.ex0002;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        double numberOne = scanner.nextDouble();


        System.out.print("Digite o segundo numero: ");
        double numberTwo = scanner.nextDouble();
        double resultado = numberTwo + numberOne;
        System.out.println("A soma entre "+ numberOne + " + "+numberTwo+" = "+ resultado);




    }

}