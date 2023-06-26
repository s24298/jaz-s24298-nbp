package pl.pjatk.s24298nbp;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Service
public class NBPService {

    public final RestTemplateConfig restTemplateConfig;

    public NBPService(RestTemplateConfig restTemplateConfig) {
        this.restTemplateConfig = restTemplateConfig;
    }

    public String getCurrency(String table) {

        String URL = "http://api.nbp.pl/api/exchangerates/rates/a/" + table + "/";
        ResponseEntity<String> response = restTemplateConfig.getRestTemplate().getForEntity(URL, String.class);
        String productJ = response.getBody();
        return productJ;
    }

    public String getGoldInDate(String start, String end) {
        String URL = "http://api.nbp.pl/api/cenyzlota/"+ start + "/" + end + "/";
        ResponseEntity<String> response = restTemplateConfig.getRestTemplate().getForEntity(URL, String.class);
        String productJ = response.getBody();

        return productJ;
    }

    //DEBUG
    public String getData(String table) {
        String URL = "http://api.nbp.pl/api/exchangerates/rates/a/" + table + "/";
        ResponseEntity<Data> response = restTemplateConfig.getRestTemplate().getForEntity(URL, Data.class);
        Data productJ = response.getBody();
        System.out.println(productJ.rates + " Witaj");

        return "Witaj";
    }

}
