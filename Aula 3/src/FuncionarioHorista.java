public class FuncionarioHorista extends Funcionario {
    private double salarioHora;
    private int horasTrabalhadas;
    private int horasExtras;
    private int faltas;

    public FuncionarioHorista(String nome, double salarioHora, int horasTrabalhadas, int horasExtras, int faltas) {
        super(nome, salarioHora * 240);
        this.salarioHora = salarioHora;
        this.horasTrabalhadas = horasTrabalhadas;
        this.horasExtras = horasExtras;
        this.faltas = faltas;
    }

    @Override
    public double calcularSalario() {
        double salario = salarioHora * horasTrabalhadas;
        if (horasExtras > 0) {
            if (horasExtras <= 2) {
                salario += horasExtras * salarioHora * 1.7;
            } else {
                salario += 2 * salarioHora * 1.7;
                salario += (horasExtras - 2) * salarioHora * 2;
            }
        }
        if (faltas > 0) {
            salario -= faltas * salarioHora * 8 * 2;
        }
        return salario;
    }
}
