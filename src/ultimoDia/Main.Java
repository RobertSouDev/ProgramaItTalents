import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String teste = "C:\\Users\\ASUS\\Desktop\\java\\ProgramaItTalents\\src\\ultimoDia\\teste.txt";
        try{
            FileReader  arquivoReader = new FileReader(teste); // destaca o caminho do arquivo a ser lido
            BufferedReader leitor = new BufferedReader(arquivoReader); // realiza a otimização de leitura do arq
            String linha;
            while((linha = leitor.readLine())!=null){
                System.out.println(linha);
            }
            leitor.close();
        }catch(IOException e){
            System.err.println("Arquivo nao encontrado");
        }
    }
}