package com.example.testapi;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@RestController
@RequestMapping("api/v1/")
public class TestApiController {

    @GetMapping("data")
    public ResponseEntity<String> getdata(){
        return ResponseEntity.ok("Okay");
    }

    @PostMapping("postit")
    public ResponseEntity<String> postdata(@RequestBody String fullName){
        System.out.println(fullName);
        if(fullName.startsWith("A")) {
            return new ResponseEntity<>("Your name is not upto our standards", HttpStatus.BAD_REQUEST);
        }
        String test = fullName;
        return new ResponseEntity<>("Its done ", HttpStatus.OK);
    }
}
