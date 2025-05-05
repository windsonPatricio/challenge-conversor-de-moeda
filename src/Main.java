import br.com.alura.conversorDeMoeda.Telas.MenuOpcoes;
import br.com.alura.conversorDeMoeda.Telas.TelasMenu;
import br.com.alura.conversorDeMoeda.calculos.CalculoConversao;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        String moedaPrincipal = "";
        String moedaConversao = "";
        double valorDeCotacao = 0;
        boolean sair = false;
        int operacao = 0;

        Scanner scanner = new Scanner(System.in);
        TelasMenu telas = new TelasMenu();
        MenuOpcoes menu = new MenuOpcoes();
        try {
            while (operacao != 7) {

                telas.getTelaInicial();

                int opcao = scanner.nextInt();

                if (opcao < 1 || opcao > 7) {
                    System.out.println("Opção Inválida! Digite uma opção válida.");
                } else if (opcao == 7) {
                    System.out.println("""
                            *************************************************
                            Obrigado por utilizar nosso Sistema!
                            *************************************************
                            """);
                    break;
                } else if (opcao instanceof Integer) {
                    System.out.println("Opção Inválida! Digite uma opção válida.");

                } else {
                    while (sair == false) {
                        moedaPrincipal = menu.menuPrincipalRetorno(opcao);
                        telas.getMoedaDeConversao();
                        int opcao2 = scanner.nextInt();

                        if (opcao2 < 1 || opcao2 > 6) {
                            System.out.println("Opção Inválida! Digite uma opção válida.");
                        } else {
                            moedaConversao = menu.menuPrincipalRetorno(opcao2);
                            sair = true;
                        }
                    }
                }


                System.out.println("digite o valor para realizar a cotacao:");
                valorDeCotacao = scanner.nextDouble();
                CalculoConversao calculo = new CalculoConversao();
                double finalValor;
                finalValor = calculo.conversao(moedaPrincipal, moedaConversao, valorDeCotacao);

                System.out.println("""
                        *************************************************
                        O valor de %s em %s
                        Corresponde a:
                        %s %s
                        *************************************************
                        """.formatted(valorDeCotacao, moedaPrincipal, finalValor, moedaConversao));
            }
        } catch (RuntimeException  e) {
            System.out.println(e.getMessage());
            System.out.println("""
                *************************************************
                Ocorreu um erro na execução do Programa!
                Entre em contato com o suporte.
                *************************************************
                """);
        }
    }
}



