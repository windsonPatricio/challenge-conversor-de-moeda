package br.com.alura.conversorDeMoeda.Telas;

public class MenuOpcoes {
    String moeda;

    public String menuPrincipalRetorno (int opcao) {

        if (opcao == 1) {
            moeda =  "USD";
        }
        if (opcao == 2) {
            moeda =  "CAD";
        }
        if (opcao == 3) {
            moeda =  "BRL";
        }
        if (opcao == 4) {
            moeda =  "CPL";
        }
        if (opcao == 5) {
            moeda =  "BOB";
        }
        if (opcao == 6) {
            return "EUR";
        }
        return moeda;
    }
}
