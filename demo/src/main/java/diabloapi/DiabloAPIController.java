package diabloapi;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiabloAPIController {
	private static final String template = "Wesh, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public DiabloAPI diabloapi(@RequestParam(value="name", defaultValue="poto") String name) {
        return new DiabloAPI(counter.incrementAndGet(),
                            String.format(template, name));
    }
}
