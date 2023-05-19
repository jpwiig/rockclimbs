package com.example.rockclimbs.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
//import repository.routeRepository;

import java.util.ArrayList;
import java.util.List;

@RestController

public class Controller {

@PostMapping("api/test/")
    public List<String> test(){
    List<String>test = new ArrayList<>();
    test.add("colorado");
    test.add("yellowstone");
    test.add("fontainebleau");
    test.add("lofoten");
    return test;
}


}
