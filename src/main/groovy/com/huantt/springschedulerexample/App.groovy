package com.huantt.springschedulerexample

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableScheduling
class App {

    static void main(String[] args) {
        SpringApplication.run App, args
    }
}
