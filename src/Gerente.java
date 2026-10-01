public class Gerente extends Funcionario{
    private int senha;
    private int numFuncionariosGerenciados;

    public Gerente(String nome, int idade, int cpf, double salario, int senha, int numFuncionariosGerenciados) {
        super(nome, idade, cpf, salario);
        this.senha = senha;
        this.numFuncionariosGerenciados = numFuncionariosGerenciados;
    }

    public boolean autentica(int senha){

        if(senha == this.senha){
            System.out.println("Senha autenticada");
            return true;
        }else{
            System.out.println("Senha inválida!");
            return false;

        }
    }
}
