import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite o número de linhas: ");
        int linhas = s.nextInt();
        System.out.print("Digite o número de colunas: ");
        int colunas = s.nextInt();

        int [][] matriz = new int[linhas][colunas];
        System.out.print("Digite os elementos da matriz: ");
        for(int i = 0; i<linhas;i++){
            for(int j=0; j<colunas;j++){
                matriz[i][j]= s.nextInt();
            }
        }

        System.out.println("Matriz lida, aora vamos imprimi-la: ");
        for(int i = 0; i<linhas; i++){
            for (int j = 0; j < colunas;j++){
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println();
        }

        s.close();


    }
}
}
