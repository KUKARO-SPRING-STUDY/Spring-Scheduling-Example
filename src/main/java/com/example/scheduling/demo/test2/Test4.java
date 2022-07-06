package com.example.scheduling.demo.test2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Test4 {
    @Scheduled(fixedDelay = 1000)
    public void scheduledFixedDelay() throws IllegalAccessException {
        log.info("Test4");
    }
}
