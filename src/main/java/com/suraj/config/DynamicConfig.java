package com.suraj.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@RefreshScope
@Configuration
@ConfigurationProperties
@Setter
@Getter
public class DynamicConfig {

  private String firstName;

  private String lastName;

  private String mapConfig;
}
