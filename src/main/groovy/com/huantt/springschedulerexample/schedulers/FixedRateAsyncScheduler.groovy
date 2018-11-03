package com.huantt.springschedulerexample.schedulers

import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.scheduling.annotation.Async
import org.springframework.scheduling.annotation.EnableAsync
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

import java.util.concurrent.TimeUnit

/**
 * @author huantt on 11/3/18
 */
@Slf4j
@Component
@EnableAsync
class FixedRateAsyncScheduler {

    @Autowired
    final initTime = System.currentTimeMillis()
    int round = 0

    @Async
    @Scheduled(fixedRate = 2000L)
    void run() {
        log.info("@FixedRateAsyncScheduler: Roud ${++round} was be started at ${TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - initTime)}")
        this.doSomething()
        log.info("@FixedRateAsyncScheduler: Roud ${round} was be finished at ${TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - initTime)}")
    }

    void doSomething() {
        Thread.sleep(5000L)
    }
}
