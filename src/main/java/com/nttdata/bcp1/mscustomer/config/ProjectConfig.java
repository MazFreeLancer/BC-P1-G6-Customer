package com.nttdata.bcp1.mscustomer.config;

import lombok.Data;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.EnableWebFlux;

@Data
@RefreshScope
@Configuration
@EnableWebFlux
public class ProjectConfig {

}
