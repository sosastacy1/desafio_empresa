public class Desenvolvedor extends Funcionarios {
    private String LinguagemPP;

    public Desenvolvedor (String nome, String cpf, double salario, String linguagemPP) {
        super(nome, cpf, salario);
        LinguagemPP = linguagemPP;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Desenvolvedor{" +
                "LinguagemPP='" + LinguagemPP + '\'' +
                '}';
    }
}
