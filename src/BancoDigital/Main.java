package BancoDigital;

public class Main {
    public static void main(String[] args) {

        Cliente Karol = new Cliente();

        Karol.setNome("Karol");
        Conta cc = new ContaCorrente(Karol);
        Conta poupanca = new ContaPoupanca(Karol);
        cc.depositar(1000);
        cc.transferir(100, poupanca);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        PessoaFisica pf = new PessoaFisica();
        PessoaJuridica pj = new PessoaJuridica();

    }
}

