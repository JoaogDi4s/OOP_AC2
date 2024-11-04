public class Diretor extends FuncionarioBase implements Beneficios{
    private double auxilioMoradia;
    private double bonusPercentual;

    //construtor
    public Diretor(String nome, double salarioBase, double auxilioMoradia,double bonusPercentual) {
        super(nome, salarioBase);
        this.auxilioMoradia = auxilioMoradia;
        this.bonusPercentual = bonusPercentual;
    }

    //getters
    public double getAuxilioMoradia() {
        return auxilioMoradia;
    }
    public double getBonus() {
        return bonusPercentual;
    }

    //setters
    public void setAuxilioMoradia(double auxilioMoradia) {
        this.auxilioMoradia = auxilioMoradia;
    }
    public void setBonus(double bonus) {
        this.bonusPercentual = bonus;
    }

    //calcular bonus percentual
    @Override
    public double calcularBonus(double bonusPercentual){
        return getSalarioBase() * (bonusPercentual/100);
    }    

    //calcular auxilo moradio
    @Override
    public double calcularAuxilioMoradia(double valorFixado){
        return auxilioMoradia = valorFixado;
    }

    //calcular salario
    @Override
    public double calcularSalario() {
        return salarioBase + calcularBonus(bonusPercentual) + calcularAuxilioMoradia(auxilioMoradia);
    }

    //calcular salário com bonus adicional
    @Override
    public double calcularSalario(double bonusAdicional){
        return salarioBase + calcularBonus(bonusPercentual) + calcularAuxilioMoradia(auxilioMoradia) + bonusAdicional;
    }

    //to String
    @Override
    public String toString() {
        return "O salario de " + nome + " é R$ " + calcularSalario();
    }
}
