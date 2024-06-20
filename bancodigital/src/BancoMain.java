import model.Banco;
import model.Cliente;
import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;
import model.TipoConta;

public class BancoMain {
    public static void main(String[] args) throws Exception {
        Banco banco = new Banco();
        Conta conta1 = new ContaCorrente(new Cliente("ronaldo", "777"));
        banco.criarConta(conta1);
        Conta conta2 = new ContaPoupanca(new Cliente("priscila", "888"));
        banco.criarConta(conta2);

        banco.imprimirContas();

        System.out.println();
        banco.depositar(1, TipoConta.CONTA_CORRENTE, 600);
        banco.sacar(1, TipoConta.CONTA_CORRENTE, 300);
        banco.transferir(1, TipoConta.CONTA_CORRENTE, 1, TipoConta.CONTA_POUPANCA, 100);
        System.out.println(banco.acessarConta(1, TipoConta.CONTA_CORRENTE));

        System.out.println();

        System.out.println(banco.acessarConta(1, TipoConta.CONTA_POUPANCA));

    }
}
