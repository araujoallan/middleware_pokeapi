package com.api.pokeapi.adapters.output;


import com.api.core.ports.output.FindPokemonOutputPort;
import com.api.domain.entity.Pokemon;
import com.api.pokeapi.configuration.PokeAPIClient;
import com.api.pokeapi.configuration.PokeAPIInterfaceConfig;
import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Log4j2
@Setter
@Component
@AllArgsConstructor
public class FindPokemonOutputPokeApi implements FindPokemonOutputPort {

    private static final String MESSAGE_ERROR = "ERRO AO TENTAR COMUNICAÇÃO COM POKE API";

    private final PokeAPIInterfaceConfig pokeAPIInterfaceConfig;
    private final PokeAPIClient pokeAPIClient;

    @Override
    public Pokemon findPokemon(String name) {
        try {
            return pokeAPIClient.getPokemon(this.pokeAPIInterfaceConfig.getEndpoint() + name);

        } catch(Exception e) {
            log.info(e);
            log.info(MESSAGE_ERROR);
        }
        return null;
    }
}

