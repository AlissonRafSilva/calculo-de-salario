public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Ada");

        FuncionarioHorista horista1 = new FuncionarioHorista("Carlos", 20, 240, 8, 1);
        FuncionarioHorista horista2 = new FuncionarioHorista("Ana", 25, 240, 8, 0);


        FuncionarioMensalista mensalista1 = new FuncionarioMensalista("João", 3000, 5000);
        FuncionarioMensalista mensalista2 = new FuncionarioMensalista("Maria", 3500, 7000);


        empresa.adicionarFuncionario(horista1);
        empresa.adicionarFuncionario(horista2);
        empresa.adicionarFuncionario(mensalista1);
        empresa.adicionarFuncionario(mensalista2);

        empresa.mostrarSalarios();
    }
}