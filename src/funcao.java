public class funcao {
    // com retorno. - tipo de dados com parametro ou sem parametro
    // sem retorno. - Void - com paramentro ou sem parametro


    void Hello(){ // função sem retorno e sem parametros
        System.out.println("Olá!");
    }

    void Hello(String nome) { //função sem retorno e com paramentro
        System.out.println("Olá, "+nome+"!");
    }

    String chegada(){ // função com retorno e sem parametro
        return "Olá!!!!";
    }

    String chegada(String nome){ // função com retorno e com parametro
        return "Olá, "+nome+"!";
    }
    public static void main(String[] args) {
        new funcao().Hello();
        new funcao().Hello("robert");

        String x = new funcao().chegada();
        System.out.println(x);
        String y = new funcao().chegada("Victor");
        System.out.println(y);
    }
}
