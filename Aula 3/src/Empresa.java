import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nome;
    private List<Funcionario> funcionarios;

    public Empresa(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public double calcularFolhaPagamento() {
        double total = 0;
        for (Funcionario funcionario : funcionarios) {
            total += funcionario.calcularSalario();
        }
        return total;
    }
    public void mostrarSalarios() {
        double total = 0;
        for (Funcionario funcionario : funcionarios) {
            double salario = funcionario.calcularSalario();
            System.out.printf("Salário de %s: R$ %.2f%n", funcionario.getNome(), salario);
            total += salario;
        }
        System.out.printf("Valor total da folha de pagamento: R$ %.2f%n", total);
    }
}
