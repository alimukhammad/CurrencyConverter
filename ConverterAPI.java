import java.net.http.HttpResponse;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class ConverterAPI {
    private static final String API_ENDPOINT = "https://www.amdoren.com";
    private static final String API_KEY = "";
    
    public static void main(String[] args) throws Exception {
        HttpClient client = HttpClients.createDefault();
        HttpGet request = new HttpGet(API_ENDPOINT);
        request.addHeader("Authorization", "Bearer " + API_KEY);
        HttpResponse response = client.execute(request);
        String json = EntityUtils.toString(response.getEntity());
        // Parse the JSON response into a Java object using a JSON parsing library
        // ...
    }
}