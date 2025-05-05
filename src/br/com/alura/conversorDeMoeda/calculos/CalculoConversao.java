package br.com.alura.conversorDeMoeda.calculos;

import br.com.alura.conversorDeMoeda.modelos.ConversionRates;

public class CalculoConversao {
    private double resultado;

    public Double conversao (String moeda, String moedaParamts, double valor){

        RetornoCotacao reponse = new RetornoCotacao();
        ConversionRates rates = reponse.retornoCalculo(moeda).getConversion_rates();

        if (moedaParamts.equals("USD")){
            resultado = rates.getUSD()* valor;
        } else if (moedaParamts.equals("EUR")) {
            resultado = rates.getEUR()* valor;
        }else if (moedaParamts.equals("CAD")) {
            resultado = rates.getCAD()* valor;
        }else if (moedaParamts.equals("CPL")) {
            resultado = rates.getCLP()* valor;
        }else if (moedaParamts.equals("BRL")) {
            resultado = rates.getBRL()* valor;
        }else if (moedaParamts.equals("BOB")) {
            resultado = rates.getBOB()* valor;
        }

        return resultado;
    }
}
