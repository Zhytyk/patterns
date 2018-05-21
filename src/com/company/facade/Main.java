package com.company.facade;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {
        Clock clock = new Clock();
        clock.tick();
    }
}
