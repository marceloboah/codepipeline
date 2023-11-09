package br.com.codepipeline;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("hello")
    public ResponseEntity<String> getHello(){
        return new ResponseEntity<>("Hello Marcelo", HttpStatus.OK);
    }

    @GetMapping("basic")
    public String getBasic(){
        return "OK";
    }
}
