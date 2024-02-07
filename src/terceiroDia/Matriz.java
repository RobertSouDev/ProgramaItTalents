package terceiroDia;

public class Matriz {
    public static void main(String[] args) {
        int[][] matriz = new int [4][4];
        for(int i = 0; i < matriz.length;i++){
           for (int j=0; j<matriz[i].length;j++){
               matriz[i][j]= i+j;
           }
        }

        for (int i= 0; i < matriz.length;i++){
            for (int j= 0; j< matriz.length;j++){
                System.out.print(matriz[i][j]+ " ");

            }
            System.out.println(" ");

        }
        System.out.println(" ");
        System.out.println("-------------------------------------");

        int[][] matriz2 = new int [4][];
        matriz2[0] = new int[5];
        matriz2[1] = new int[3];
        matriz2[2] = new int[6];
        matriz2[3] = new int[3];
        for(int i = 0; i < matriz2.length;i++){
            for (int j=0; j<matriz2[i].length;j++){
                matriz2[i][j]= i+j;
            }
        }

        for (int i= 0; i < matriz2.length;i++){
            for (int j= 0; j< matriz2[i].length;j++){
                System.out.print(matriz2[i][j]+ " ");

            }
            System.out.println(" ");

        }
        System.out.println(" ");
    }
}
