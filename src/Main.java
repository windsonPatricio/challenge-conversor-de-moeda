import br.com.alura.conversorDeMoeda.modelos.ApiReponse;
import br.com.alura.conversorDeMoeda.modelos.ConecaoAPI;
import br.com.alura.conversorDeMoeda.modelos.ConversionRates;

import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String digitado;

        Scanner scanner = new Scanner(System.in);
        System.out.println("**********************************");
        System.out.println("LOCALIZADOR DE CIDADES POR CEP!");
        System.out.println("digite uma moeda:");
        digitado = scanner.nextLine();

        try {
            ConecaoAPI busca = new ConecaoAPI();
            String key = busca.getKey();
            String endereco = "https://v6.exchangerate-api.com/v6/"+key+"/latest/"+digitado;


            ApiReponse teste = busca.buscaJson(endereco);
            ConversionRates rates = teste.getConversion_rates();


        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("Nao deu certo!!");
        }
    }
}


