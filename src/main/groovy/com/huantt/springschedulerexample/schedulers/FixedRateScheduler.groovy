package com.huantt.springschedulerexample.schedulers

import groovy.util.logging.Slf4j
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

import java.util.concurrent.TimeUnit

/**
 * @author huantt on 11/3/18
 */

@Component
@Slf4j
class FixedRateScheduler {

    final initTime = System.currentTimeMillis()
    int round = 0

    @Scheduled(fixedRate = 2000L)
    void run() {
        log.info("@FixedDelayScheduler: Roud ${++round} was be started at ${TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - initTime)}")
        this.doSomething()
        log.info("@FixedDelayScheduler: Roud ${round} was be finished at ${TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - initTime)}")
    }

    void doSomething() {
        Thread.sleep(5000L)
    }
}
