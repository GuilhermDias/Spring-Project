package com.alura.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class APIconsumer {

    public String getData(String url){
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
        HttpResponse<String> response = null;
        try {
           response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch(IOException | InterruptedException exception){
            throw new RuntimeException(exception);
        }
        String json = response.body();
        return json;
    }
}
