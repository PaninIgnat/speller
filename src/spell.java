import java.io.IOException;

import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.ParseException;
import org.apache.hc.core5.http.io.entity.EntityUtils;


public class spell {

    static String sURL = "https://speller.yandex.net/services/spellservice";

    public static void main(String[] args) {

        CloseableHttpResponse resp1 = null;
        try {
            CloseableHttpClient httpClient =  HttpClients.createDefault();
            HttpGet httpGet = new HttpGet(sURL + "/checkText?text=синхрафазатрон+в+дубне");

            resp1 = httpClient.execute(httpGet);

            System.out.println(resp1); //EntityUtils.toString(resp1.getEntity())
        }
        catch (IOException e ) {
            e.printStackTrace();
        } finally {
            try {
                resp1.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
