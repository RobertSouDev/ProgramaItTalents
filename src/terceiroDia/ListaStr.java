package terceiroDia;
import java.util.Arrays;

public class ListaStr {
    
    public static void main(String[] args) {
        String[]  cars = {"BMW","Tesla", "Fiat","Jeep"};
        System.out.println(Arrays.toString(cars));
        System.out.println(cars[1]);

        for (int i = 0; i <= cars.length;i++){
            System.out.println(i + "# item: "+ cars[i]);
        }
    }


}
