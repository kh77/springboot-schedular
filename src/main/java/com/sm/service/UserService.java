package com.sm.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class UserService {


    // in every 2 seconds, this scheduler will be fired
    @Scheduled(fixedRate = 2000)
    public void fixedRateScheduler() throws InterruptedException {
        System.out.println("Rate start :"+ LocalDateTime.now());
        System.out.println("Rate end");
    }

    // once all execution has been finished then it will take 3 seconds delay to start new execution
    @Scheduled(fixedDelay = 3000)
    public void fixedDelayScheduler() {
        System.out.println("Delay start: "+ LocalDateTime.now());
        System.out.println("Delay end");
    }

    @Scheduled(cron = "0 0/2 * 1/1 * ?")
    public void cronScheduler() {
        System.out.println("Cron start: "+ LocalDateTime.now());
        System.out.println("Cron end");
    }
}


