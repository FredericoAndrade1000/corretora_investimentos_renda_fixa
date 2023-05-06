package corretorarendafixa;

public class Investimento {
    private double valorInvestido;
    private double rentabilidade;
    private OrgaoEmissor orgaoEmissor;
    private Boolean imposto;

    public Investimento(double valorInvestido, double rentabilidade, OrgaoEmissor orgaoEmissor, Boolean imposto) {
        this.valorInvestido = valorInvestido;
        this.rentabilidade = rentabilidade;
        this.orgaoEmissor = orgaoEmissor;
        this.imposto = imposto;
    }

    public Boolean getImposto() {
        return imposto;
    }

    public void setImposto(Boolean imposto) {
        this.imposto = imposto;
    }

    public double getRentabilidade() {
        return rentabilidade;
    }

    public void setRentabilidade(double rentabilidade) {
        this.rentabilidade = rentabilidade;
    }

    public double getValorInvestido() {
        return valorInvestido;
    }

    public void setValorInvestido(double valorInvestido) {
        this.valorInvestido = valorInvestido;
    }

    public double getTaxaDeRendimento() {
        return rentabilidade;
    }

    public void setTaxaDeRendimento(double taxaDeRendimento) {
        this.rentabilidade = taxaDeRendimento;
    }

    public OrgaoEmissor getOrgaoEmissor() {
        return orgaoEmissor;
    }

    public void setOrgaoEmissor(OrgaoEmissor orgaoEmissor) {
        this.orgaoEmissor = orgaoEmissor;
    }

    public double getValorAtual() {
        double rendimento = valorInvestido * rentabilidade;
        return valorInvestido + rendimento;
    }
    public void mostrar() {
        System.out.println("Valor investido: " + getValorInvestido());
        System.out.println("Taxa de rendimento: " + getRentabilidade());
        System.out.println("Órgão emissor: ");
        getOrgaoEmissor().mostrar();
        System.out.println("Valor atual: " + getValorAtual());
        System.out.println("Imposto: " + getValorAtual());
    }

}
