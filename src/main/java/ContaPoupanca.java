public class ContaPoupanca extends Conta {


    @Override
    public void imprimirExtratos() {
        System.out.println("Extrato Conta Poupanca");
        super.ImprimirInfosComuns();
    }


}
