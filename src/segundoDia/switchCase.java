public class switchCase {

    float calcularBonus(String cargo, float salario) {
            float bonus = 0f;
            cargo = cargo.toLowerCase();
            switch (cargo) {
                case "gerente":
                    bonus = salario * 1.6f;
                    break;
                case "analista":
                    bonus = salario* 1.5f;
                    break;
                case "supervisor":
                    bonus = salario* 1.1f;
                    break;
                default:
                    bonus = salario *  0.7f;
                    break;
            }
            return  bonus;
        }


    public static void main(String[] args) {
        String cargo = "Gerente";
        float salario = 1000f;
        float bonus = new switchCase().calcularBonus(cargo, salario);
        System.out.println("O salario do cargo "+ cargo + " é: "+ salario + " e sua bonificação é: "+ bonus);

        System.out.println("Seu ganho foi de:" +(salario+bonus));

    }
}
