package corretorarendafixa;

public class FI extends Investimento{
    public FI(double valorInvestido, double rentabilidade, OrgaoEmissor orgaoEmissor) {
        super(valorInvestido, rentabilidade, orgaoEmissor, true);
        
    }
    
    @Override
    public void mostrar() {
        System.out.println("Tipo: FI");
        System.out.println("Valor investido: " + getValorInvestido());
        System.out.println("Taxa de rendimento: " + getRentabilidade());
        System.out.println("Órgão emissor: ");
        getOrgaoEmissor().mostrar();
        System.out.println("Valor atual: " + getValorAtual());
        System.out.println("Imposto: " + (getImposto() ? "Sim" : "Não"));
    }
}