public class ContaCorrente extends Conta {

    @Override
    public void imprimirExtratos() {
        System.out.println("Extrato Conta Corrente");
        super.ImprimirInfosComuns();
    }
}
