/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.waluciarz;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 *
 * @author domagalapawel
 */
public class DownloadFromHTML {
    private boolean wybor;
    
    public float DFHTML(String currency){
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://api.nbp.pl/api/exchangerates/rates/c/"+currency+"/today/")).build();

        try{
            HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String result = response.body().toString();
            if(wybor){
                String ask = result.substring(result.indexOf("\"ask\":")+6);
                String test = ask.substring(0, ask.indexOf("}"));
                return(Float.parseFloat(test));
            }else{
                String bid = result.substring(result.indexOf("\"bid\":")+6);
                String test = bid.substring(0, bid.indexOf(","));
                return(Float.parseFloat(test));}
        }catch(Exception e){
        }
        return 0;
    }

    public void setWybor(boolean wybor) {
        this.wybor = wybor;
    }
}
