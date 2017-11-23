package servlets_test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping("/hibich")
    public Greeting hi(){
        return new Greeting(123, "lilbich");
    }
}
