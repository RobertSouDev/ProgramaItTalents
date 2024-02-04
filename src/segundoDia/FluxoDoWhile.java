public class FluxoDoWhile {
    public static void main(String[] args) {
        int a = 0;
        do{
            System.out.println(a + "# testando Do While");
            a +=1000;
        }while(a<=10000);

        System.out.println("------------------------");
        int b = 11000;
        do{
            System.out.println(a + "# testando Do While");
            b +=1000;
        }while(b<=10000);
    }
}
