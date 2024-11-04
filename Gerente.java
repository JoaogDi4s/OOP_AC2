public class Gerente extends FuncionarioBase implements Beneficios{
    private double bonusPercentual;

    //construtor
    public Gerente(String nome, double salarioBase, double bonusPercentual){
        super(nome, salarioBase);
        this.bonusPercentual = bonusPercentual;
    }

    //getter
    public double getBonusPercentual() {
        return bonusPercentual;
    }
    //setter
    public void setBonusPercentual(double bonusPercentual) {
        this.bonusPercentual = bonusPercentual;
    }

    //calcular bonus percentual
    @Override
    public double calcularBonus(double bonusPercentual){
        return getSalarioBase() * (bonusPercentual/100);
    }    

    //calcular auxilo moradio
    @Override
    public double calcularAuxilioMoradia(double valorFixado){
        return valorFixado;
    }

    //calcular salário
    @Override
    public double calcularSalario(){
        return salarioBase + calcularBonus(bonusPercentual);
    }

    //calcular salário com bonus adicional
    @Override
    public double calcularSalario(double bonusAdicional){
        return salarioBase + calcularSalario(bonusPercentual) + bonusAdicional; 
    }

    //to string
    @Override
    public String toString() {
        return "O salario de " + nome + " é R$ " + calcularSalario();
    }
}
