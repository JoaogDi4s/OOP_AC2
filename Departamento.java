import java.util.ArrayList;

public class Departamento {
    private String nome;
    //criando a lista
    private ArrayList<FuncionarioBase> funcionarios = new ArrayList<>();

    //construtor
    public Departamento(String nome) {
        this.nome = nome;
    }

    //getter
    public String getNome() {
        return nome;
    }

    //setter
    public void setNome(String nome) {
        this.nome = nome;
    }

    //adicionar funcionario 
    public void adicionarFuncionario(FuncionarioBase nome) {
        funcionarios.add(nome);
    }

    //remover funcionario 
    public void removerFuncionario(FuncionarioBase nome) {
        funcionarios.remove(nome);
    }

    //calcular folha de pagamento
    public double calcularFolhaPagamentoTotal() {
        double total = 0;
        for (int i = 0; i < funcionarios.size(); i++) {
            total += funcionarios.get(i).calcularSalario();
        }
        return total;
    }

    //imprimir salários funcionários
    public void imprimirSalariosFuncionarios() {
          System.out.println("Departamento: " + getNome());
            for (int i = 0; i < funcionarios.size(); i++) {
            FuncionarioBase funcionario = funcionarios.get(i);
            System.out.println("Nome: " + funcionario.getNome() + ", Salário: " + funcionario.calcularSalario());
        }
    }
}
