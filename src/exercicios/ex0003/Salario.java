package exercicios.ex0003;

import java.util.Scanner;

public class Salario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite quantos anos de empressa voce tem: ");
        int anos = scanner.nextInt();

        System.out.println("Digite quantos filhos você tem: ");
        int filhos = scanner.nextInt();
        int salario = 1400;
        if(anos >= 2 || filhos > 0){
            System.out.println("Parabens você ganhou um aumento");
            System.out.println("Saldo antigo: "+ salario);
            System.out.println("Saldo novo: "+ (salario+280));
        }else{
            System.out.println("Infelimente você nao tem direito ao bonus.");
        }

    }
}