package com.company.facade;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Clock {
    private Hour hour;
    private Minute minute;
    private Second second;

    public Clock() {
        this.hour = new Hour(0);
        this.minute = new Minute(0);
        this.second = new Second(0);
    }

    public void tick() throws InterruptedException, IOException {
        while (true) {
            hour.tick();
            minute.tick();
            second.tick();

            hour.print();
            minute.print();
            second.print();

            TimeUnit.SECONDS.sleep(1);
        }
    }
}
