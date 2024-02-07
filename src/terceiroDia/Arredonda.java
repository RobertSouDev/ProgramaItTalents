package terceiroDia;

public class Arredonda {
    public static void main(String[] args) {
    float numeroQuebrado = 2.3f;
        System.out.println(Math.round(numeroQuebrado)); // arrendada o numero <5 pra baixo >= 5 pra cima
        System.out.println(Math.ceil(numeroQuebrado));// sempre para cima
        System.out.println(Math.floor(numeroQuebrado));// sempre para baixo
    }
}