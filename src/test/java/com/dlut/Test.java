package com.dlut;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import com.dlut.contorller.test;
import org.junit.jupiter.api.Test;
import org.slf4j.impl.StaticLoggerBinder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MyTest {

    @Autowired
    private test test;
    @Test
    void contextLoads() {

        test.save();
    }

}
