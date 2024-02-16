import java.util.InputMismatchException;
import java.util.Scanner;

public class Tratamento_Excecao {
    public static void main(String[] args) {
        String str = "ABC";
        String nome = null;
        nome = "Robert";
        Scanner s = new Scanner(System.in);
        System.out.println("digite um numero");
        try{
            int y = s.nextInt();
            //codigo
            int x = 10/0;
            System.out.println("Tramanho da string com: "+nome.length());
            System.out.println(str.charAt(3));
        }catch (StringIndexOutOfBoundsException e) {
            // tratamento de exceção
            System.out.println("Posição invalida tente outra");
        }catch (NullPointerException e){
            System.out.println("Nao tem nein um nome digitado");
        }catch (ArithmeticException e){
            System.out.println("Nao existe divisao por zero");
        }catch (InputMismatchException e){
            System.out.println("O numero Digitado deve ser do tipo inteiro: ");
        }catch (Exception e){
            System.out.println("Exceção generica");
        }finally {
            System.out.println("Executando o Finally");// feicha procedimentos abertos
        }
    }
}
