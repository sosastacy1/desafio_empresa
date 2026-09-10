public class Gerente extends Funcionarios {
    private int quantidadeF;

    public Gerente (String nome, String cpf, double salario, int quantidadeF) {
        super(nome, cpf, salario);
        this.quantidadeF = quantidadeF;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Gerente{" +
                "quantidadeF=" + quantidadeF +
                '}';
    }
}
