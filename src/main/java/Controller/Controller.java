package Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController

public class Controller {
@GetMapping("api/test/")
    public List<String> test(){
    List<String>test = new ArrayList<>();
    test.add("colorado");
    test.add("yellowstone");
    test.add("fontainebleau");
    test.add("lofoten");
    return test;
}
}
