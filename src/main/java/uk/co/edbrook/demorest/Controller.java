package uk.co.edbrook.demorest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class Controller {

    @GetMapping(value = "/1", produces = "application/json")
    public List<String> getOne() {
        return Arrays.asList("One", "Two", "Three");
    }

    @GetMapping(value = "/2", produces = "application/json")
    public List<String> getTwo() {
        throw new ApiBadRequestException();
    }

    @GetMapping(value = "/3", produces = "application/json")
    public List<String> getThree() {
        throw new RuntimeException("Ooops!");
    }
}
