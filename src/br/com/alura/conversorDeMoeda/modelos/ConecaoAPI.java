package br.com.alura.conversorDeMoeda.modelos;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConecaoAPI {

    private String key =  "f341813331f8953943cec56c";

    public String getKey() {
        return this.key;
    }

    public ApiReponse buscaJson(String endereco){


        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());


            return new Gson().fromJson(response.body(), ApiReponse.class);

        } catch (IOException | InterruptedException  e) {
            throw new RuntimeException("eu nao consegui");
        }




}
}
