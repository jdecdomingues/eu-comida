package com.grisaworks.eu.comida.core.openapi;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
    private static final String DESCRIPTION = "REST APIs of the eucomida project.";

    @Bean
    public OpenAPI springDocsOpenApi(){
        return new OpenAPI().info(new Info().title("EuComida Documentation")
                .description(DESCRIPTION));
    }
}
