package com.api.pokeapi.configuration;

import com.api.domain.entity.Pokemon;
import com.api.restapi.adapters.input.response.FindPokemonResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.io.IOException;
import java.net.URI;

@Component
public class PokeAPIClient {

    private final RestTemplate restTemplate;
    private static final Logger log = LoggerFactory.getLogger(PokeAPIClient.class);

    public Pokemon getPokemon(String endpoint) throws IOException {
        try {
            URI uri = UriComponentsBuilder.fromHttpUrl(endpoint)
                    .build().toUri();

            ResponseEntity<FindPokemonResponse> response = restTemplate.getForEntity(uri, FindPokemonResponse.class);
            FindPokemonResponse findPokemonResponse = response.getBody();

            if (!response.getStatusCode().is2xxSuccessful()) {
                log.error("GET request failed with status code: {}", response.getStatusCode());
                throw new RuntimeException("GET request failed. Status code: " + response.getStatusCode());
            }

            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

            return objectMapper.convertValue(findPokemonResponse, Pokemon.class);

        } catch (Exception e) {
            log.error("Error during GET request: {}", e.getMessage(), e);
            throw new RuntimeException("Error fetching Pokemon", e);
        }
    }

    public PokeAPIClient(@Qualifier("pokeRestTemplate")  RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
}
