package springRest.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Justin on 8/8/16.
 */
// don't do html here it is not intended for html.
    // Senior will be pissed haha pffft.
@RestController
public class JsonRestController {

    @RequestMapping("/")
    public String index() {
        return "<h1>Greetings from Spring Boot!</h1>";
    }

    @RequestMapping("/test")
    public String test() { return "<h1>This is a test...</h1>";
    }
}
