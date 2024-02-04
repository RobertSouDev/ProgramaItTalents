public class EstruturaDeDecisao {

    void media(float nota) {
        if (nota >= 7) {
            System.out.println("Sua nota foi "+ nota +" Aluno Aprovado");
        }else if(nota >= 4 && nota <= 6){
            System.out.println("Sua nota foi "+ nota + " Se ficou de recupreção");
        }else {
            System.out.println("Sua nota foi "+ nota +" Aluno Reprovado");
        }

    }

    public static void main(String[] args) {
        float a = 3.5f, b= 6.5f, c=10f, d= 8.9f;
        float media = (a+b+c+d)/4;
        new EstruturaDeDecisao().media(4.6f);
    }
}
