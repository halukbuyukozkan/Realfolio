package com.buyukozkan.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Yahoo Finance API configuration properties.
 */
@ConfigurationProperties(prefix = "yahoo")
public record YahooFinanceProperties(
    String baseUrl
) {
}

