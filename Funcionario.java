public class Funcionario extends FuncionarioBase {

    //construtor
    public Funcionario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    //calcular salario
    @Override
    public double calcularSalario() {
        return salarioBase;
    }

    //calcular salário com bonus adicional
    @Override
    public double calcularSalario(double bonusAdicional){
        return salarioBase + bonusAdicional;
    }

    //to string
    @Override
    public String toString() {
        return "O salario de " + this.nome + " é R$" + calcularSalario();
    }

}
