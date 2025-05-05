package br.com.alura.conversorDeMoeda.calculos;

import br.com.alura.conversorDeMoeda.modelos.ApiReponse;
import br.com.alura.conversorDeMoeda.modelos.ConecaoAPI;

public class RetornoCotacao {

    public ApiReponse retornoCalculo (String moeda){
        ConecaoAPI busca = new ConecaoAPI();
        String key = busca.getKey();
        String endereco = "https://v6.exchangerate-api.com/v6/" + key + "/latest/"+moeda;

        ApiReponse teste = busca.buscaJson(endereco);
        return teste;

    }
}
