public class Cliente  extends Pessoa{

    private double saldo;
    private double limite;
    private double chequeEspecial;

    public Cliente(String nome, int idade, int cpf, double saldo, double limite, double chequeEspecial) {
        super(nome, idade, cpf);
        this.saldo = saldo;
        this.limite = limite;
        this.chequeEspecial = chequeEspecial;
    }

    public void sacar(double valor){
        this.saldo = this.saldo - valor;
    }

    public void depositar(double valor){
        this.saldo = this.saldo + valor;
    }
}
