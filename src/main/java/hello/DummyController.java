package hello;

import org.springframework.web.bind.annotation.*;

@RestController
public class DummyController {
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String get() {
        return "GET method called";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String getById(@PathVariable("id") int id) {
        return "GET (by id) method called";
    }


    @RequestMapping(method = RequestMethod.POST)
    public void post(@RequestBody String str)  {
        System.out.println("POST method called");
    }

    @RequestMapping(method = RequestMethod.PUT)
    public void update(@RequestBody String customer) {
        System.out.println("POST method called");
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void updateById(@PathVariable("id") Long id, @RequestBody String customer) {
        System.out.println("POST (by id) method called");
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete() {
        System.out.println("DELETE method called");
    }

}
