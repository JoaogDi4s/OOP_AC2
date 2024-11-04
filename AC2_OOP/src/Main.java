public class Main {
    public static void main(String[] args) {

        System.out.println("===============================");
        System.out.println("==============AC2==============");
        System.out.println("===============================");
    
        System.out.println("\n");
        System.out.println("--------------Cada funcionário--------------");
        //funcionário
        Funcionario Joao = new Funcionario("João", 3000);
        System.out.println(Joao.toString());
        //gerente
        Gerente Maria = new Gerente("Maria", 5000, 20);
        System.out.println(Maria.toString());
        //diretor
        Diretor Carlos = new Diretor("Carlos", 10000, 2000, 30);
        System.out.println(Carlos.toString());

        System.out.println("\n");
        System.out.println("--------------funcionário com bonus adicional--------------");
        System.out.println("O salário com bonus adicional de "+ Joao.getNome() + " é R$" + Joao.calcularSalario(300));

        //pacote Departamento
        Departamento tecnologia = new Departamento("tecnologia");

        System.out.println("\n");
        System.out.println("--------------Lista--------------");
        tecnologia.adicionarFuncionario(Maria);    
        tecnologia.adicionarFuncionario(Joao);
        tecnologia.adicionarFuncionario(Carlos);
        System.out.println("A folha de pagamento total é: " + tecnologia.calcularFolhaPagamentoTotal());
        tecnologia.imprimirSalariosFuncionarios();

        System.out.println("\n");
        System.out.println("--------------Lista removendo o carlos--------------");
        tecnologia.removerFuncionario(Carlos);
        System.out.println("A folha de pagamento total é: " + tecnologia.calcularFolhaPagamentoTotal());
        tecnologia.imprimirSalariosFuncionarios();
    }

}