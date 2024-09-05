public class FuncionarioMensalista extends Funcionario {
    private double bonusAnual;

    public FuncionarioMensalista(String nome, double salarioBase, double bonusAnual) {
        super(nome, salarioBase);
        this.bonusAnual = bonusAnual;
    }

    public void setBonusAnual(double bonusAnual) {
        this.bonusAnual = bonusAnual;
    }

    public double calcularSalarioAnual() {

        return getSalarioBase() * 12 + bonusAnual;
    }
}
