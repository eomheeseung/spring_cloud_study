package example.second_service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class SecondServiceController {
    @GetMapping("/welcome")
    public String welcome() {
        log.info("welcome");
        return "welcome to the second service";
    }
}
