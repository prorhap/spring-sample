package com.woowa.biz.pilot.board;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSampleApplication {

    private static final Logger logger = LoggerFactory.getLogger(SpringSampleApplication.class);

    public static void main(String[] args) {
        logger.info("Starting SpringSampleApplication ...");
        SpringApplication.run(SpringSampleApplication.class, args);
    }
}
