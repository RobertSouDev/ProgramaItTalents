public class Fluxo_while {
    public static void main(String[] args) {
        int i = 0;
        while(i <= 10){
            System.out.println(i + "# numero");
            i ++;
        }
        System.out.println("----------------------------------");

        i = 0;
        while(i <= 12){
            System.out.println(i + "# numero");
            i += 3;
        }

        System.out.println("----------------------------------");
        while(i >= 0){
            System.out.println(i + "# numero");
            i --;
        }
    }
}
