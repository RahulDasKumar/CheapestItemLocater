package com.example.demo.Vegetables;

import com.example.demo.Algorithms;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import javax.persistence.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Iterator;

@Entity
@Table(name = "vegetable")
public class Vegetable {
    @Id
    @Column(name = "product_name")
    private String name;
    @Column(name = "price")
    private double price;

    @Column(name = "store")
    private String sources;



    @Column(name = "url")
    private String link;
//    @Value("${api.key}")
//    private String apiKey;

    @Transient
    String apiKey = "02fc4b553614e0b1815f17a2258e88dae88b797d14a7ba778238a25aee438764";

    public Vegetable() {
    }

    public Vegetable( String name, Double price, String sources) {
        this.sources = sources;
        this.name = name;
        this.price = price;
    }
    public Vegetable( String name, Double price, String sources, String url) {
        this.sources = sources;
        this.name = name;
        this.price = price;
        this.link = url;
    }
    public Vegetable(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSources() {
        return sources;
    }

    public void setSources(String sources) {
        this.sources = sources;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getApiKey(){
        return apiKey;
    }
    public void findCheapestItem(String item) throws IOException, InterruptedException, URISyntaxException {
// Building request
        HttpRequest getRequestofItem = HttpRequest.newBuilder()
                .uri(new URI("https://serpapi.com/search.json?q="+item+"&tbm=shop&hl=en&gl=us&api_key=" + apiKey)).build();
        //Setting http client
        HttpClient httpClient = HttpClient.newHttpClient();
        // Getting response
        HttpResponse<String> getResponse = httpClient.send(getRequestofItem, HttpResponse.BodyHandlers.ofString());
        // Getting json object
        JsonElement jsonElement = JsonParser.parseString(getResponse.body()).getAsJsonObject();
        JsonObject rootObj = jsonElement.getAsJsonObject();
        JsonArray documents = (JsonArray) rootObj.get("shopping_results");
        ArrayList<Double> itemList = new ArrayList<Double>();
        ArrayList<String> storeList = new ArrayList<String>();
        ArrayList<String> urlList  = new ArrayList<String>();
        //Finding cheapest price
        Iterator<JsonElement> itr = documents.iterator();
        while (itr.hasNext()) {
            JsonObject jsonObject = (JsonObject) itr.next();
            JsonElement price = jsonObject.get("extracted_price");
            JsonElement store = jsonObject.get("source");
            JsonElement url = jsonObject.get("link");
            double bananaPrice = price.getAsDouble();
            String sourceName = store.getAsString();
            String urlName = url.getAsString();
            itemList.add(bananaPrice);
            storeList.add(sourceName);
            urlList.add(urlName);
        }
        setLink(urlList.get(Algorithms.indexOfSmallest(itemList)));
        setSources(storeList.get(Algorithms.indexOfSmallest(itemList)));
        setPrice(itemList.get(Algorithms.indexOfSmallest(itemList)));
        // setSources(storeList.get(Algorithms.indexOfSmallest(itemList)));

    }
    @Override
    public String toString() {
        return "Item{" +
                "id=" + sources +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
