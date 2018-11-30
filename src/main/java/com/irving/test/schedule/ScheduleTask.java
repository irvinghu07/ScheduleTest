package com.irving.test.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;

@Component
public class ScheduleTask {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    @Scheduled(fixedRate = 5000)
    public void firstSchedule(){
        System.out.println(String.format("greeting form SpringBoot:%s", dateFormat.format(System.currentTimeMillis())));
    }
}
