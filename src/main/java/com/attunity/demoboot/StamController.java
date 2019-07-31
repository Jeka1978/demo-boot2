package com.attunity.demoboot;

import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;

/**
 * @author Evgeny Borisov
 */
@RestController
@RequestMapping("/api")
public class StamController {


    @PostMapping("/person")
    public Person handlePerson(@RequestBody Person person, HttpRequest request) {
        System.out.println(person);
        return person.withName(person.getName().toUpperCase());
    }

    @GetMapping("/name")
    public String hello(@RequestParam("name")String name) {
        return name.toUpperCase();
    }

    @GetMapping("/hello")
    public String ping() {
        return "Hello JAVA SPring";
    }
}
