package Controller;

import model.Route;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//import repository.routeRepository;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController

public class Controller {
/*    @Autowired
    routeRepository rep;
*/
@GetMapping("api/test/")
    public List<String> test(){
    List<String>test = new ArrayList<>();
    test.add("colorado");
    test.add("yellowstone");
    test.add("fontainebleau");
    test.add("lofoten");
    return test;
}
//@GetMapping("/api/routes/")
   // public List<Route> searchforRoute(String Search, HttpServletResponse response) throws IOException {
 //   return rep.searchForRoute(Search, response);
//}

}
