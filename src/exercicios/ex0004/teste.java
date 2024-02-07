package exercicios.ex0004;

public class teste {
    public static void main(String[] args) {
        for (int i = 0; i<= 10; i++){
            if (i == 10){
                System.out.print(i + " fim");
            } else if (i == 0) {
                System.out.print("Começou "+ i +" ,");
            } else if (i == 1 ){
                System.out.print(i + " ,");
            }else{
                System.out.print( i + " , ");
            }
        }
    }
}
