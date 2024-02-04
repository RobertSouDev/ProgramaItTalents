public class For {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i+=2){
            if (i < 2){
                System.out.println("Contando de "+ i);
            }else if (i >= 20){
                System.out.println("Ate esse numero "+ i);
            }else {
                System.out.println("ate: "+ i);
            }
        }
    }
}