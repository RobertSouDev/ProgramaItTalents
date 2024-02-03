public class Formato_String {
    public static void main(String[] args) {
        String str = "Curso de Android.";
        System.out.println("tamanho da String: "+str.length());
        System.out.println("tamanho da String: "+str.charAt(2));
        System.out.println(str.equals("Curso de Ios")); // retorna True ou false
        System.out.println(str.startsWith("Curso"));
        System.out.println(str.endsWith("Curso"));
        System.out.println(str.substring(5)); // pega a parti do elemento que eu quiser
        System.out.println(str.substring(0, 5)); // pega parte so do intevalor que eu coloca
        System.out.println(str.replace("Curso", "Curso Top")); // troca um valor por outro
        System.out.println(str.replace("o", "x")); // troca cada elemento por outro
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        String str2 = "              teste       de        java          ";
        System.out.println(str2.trim());// removeu espaços do final e do começo NAO o que fica no Intevalor



    }
}
