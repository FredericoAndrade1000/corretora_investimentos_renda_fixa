package corretorarendafixa;

public class CorretoraRendaFixa {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("João Silva", "111.222.333-44", "Rua A, 123", "1111-2222", null);
        Cliente cliente2 = new Cliente("Maria Souza", "222.333.444-55", "Rua B, 456", "2222-3333", null);
        
        Conta conta1 = new Conta(0, cliente1);
        cliente1.setConta(conta1);
        
        Conta conta2 = new Conta(0, cliente2);
        cliente2.setConta(conta2);

        conta1.depositar(2500);
        conta2.depositar(3200);
        conta1.sacar(200);
        
        OrgaoEmissor orgaoEmissor1 = new OrgaoEmissor("Banco do Brasil", "Banco Público", "AAA", "00.000.000/0001-91");
        OrgaoEmissor orgaoEmissor2 = new OrgaoEmissor("Governo Federal", "Instituição Pública", "AAA", "Não especificado");        
        
        Investimento investimento1 = new CDB(1000, 0.06, orgaoEmissor1);
        Investimento investimento2 = new LCI(1500, 0.05, orgaoEmissor2);
        
        conta1.adicionarInvestimento(investimento1);
        conta2.adicionarInvestimento(investimento2);
        
        conta1.resgatarInvestimento(investimento1);

        conta1.transferir(conta2, 300);

        cliente1.mostrar();
        cliente2.mostrar();
    }
}

