package com.buyukozkan.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(YahooFinanceProperties.class)
public class YahooFinanceConfig {
}

