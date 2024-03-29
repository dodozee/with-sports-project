package com.withsports.notificationservice.global.config;

import com.p6spy.engine.spy.P6SpyOptions;
import com.withsports.notificationservice.global.p6psy.CustomP6spySqlFormat;
import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Configuration;


@Configuration
public class P6spyConfiguration {

    @PostConstruct
    public void setMessageFormat() {
        P6SpyOptions.getActiveInstance().setLogMessageFormat(CustomP6spySqlFormat.class.getName());
    }
}
