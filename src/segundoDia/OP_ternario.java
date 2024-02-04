public class OP_ternario {
    String maiorDeIdade(int idade) {
        return (idade > 18)? "Maior de idade ": "Menor de idade";
    }
    public static void main(String[] args) {
        int x = 19 ;
        String z = new OP_ternario().maiorDeIdade(x);
        System.out.println(z);
    }
}
