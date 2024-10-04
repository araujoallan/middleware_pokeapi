package com.api.pokeapi.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Getter
@Setter
@Component
public class PokeAPIConfig implements PokeAPIInterfaceConfig {

    @Value("${poke.api.endpoint}")
    private String endpoint;

    @Bean
    @Qualifier("pokeRestTemplate")
    public RestTemplate pokeRestTemplate() {
        return new RestTemplate();
    }
}
