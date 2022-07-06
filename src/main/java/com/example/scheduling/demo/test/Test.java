package com.example.scheduling.demo.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Test {
    @Scheduled(fixedDelay = 1000)
    public void scheduledFixedDelay() throws IllegalAccessException {
        log.info("Test");
    }
}
