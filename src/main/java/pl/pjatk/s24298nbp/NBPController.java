package pl.pjatk.s24298nbp;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("/nbp")
public class NBPController {

    private final NBPService nbpService;

    public NBPController(NBPService nbpService) {
        this.nbpService = nbpService;
    }

    @GetMapping("/{table}")
    public ResponseEntity<String> getCurrencyPage(@PathVariable String table) {
        return ResponseEntity.ok(nbpService.getCurrency(table));
    }

    @GetMapping("{start}/{end}")
    public ResponseEntity<String> getGoldInDate(@PathVariable String start, @PathVariable String end) {
        return ResponseEntity.ok(nbpService.getGoldInDate(start, end));
    }
}
