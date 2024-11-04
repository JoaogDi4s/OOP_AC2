public abstract class FuncionarioBase {
    protected String nome;
    protected double salarioBase;

    //construtor
    public FuncionarioBase(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }
    
    //getters
    public String getNome() {
        return nome;
    }
    public double getSalarioBase() {
        return salarioBase;
    }

    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    //calcular salário
    public abstract double calcularSalario();

    //salario com bonus
    public  double calcularSalario(double bonusAdicional){
        return salarioBase + bonusAdicional;
    }

}
