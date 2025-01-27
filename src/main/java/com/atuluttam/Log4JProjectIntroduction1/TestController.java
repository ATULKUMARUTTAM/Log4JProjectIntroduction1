package com.atuluttam.Log4JProjectIntroduction1;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private final Logger logger = LoggerFactory.getLogger(TestController.class);
    @Autowired
    GreetService greetService;
    @GetMapping("/api")
    public ResponseEntity<String> process()
    {
        logger.debug("Debugging Level log!!!");
        logger.info("Info Level log!!!");
        logger.error("Error Level Log!!!");
        logger.warn("Warning level Log!!!!");
        return new ResponseEntity<>(greetService.wish(), HttpStatus.OK);
    }
}
