package com.example.logging_example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class LoggerController {
    Logger logger = LoggerFactory.getLogger(LoggerController.class);

    @GetMapping
    public String example() {
        logger.info(" log example info");
        logger.error("log example error");
        logger.debug("log example debug");
        logger.trace("log example trace");

        return "example of logging";

    }
}
