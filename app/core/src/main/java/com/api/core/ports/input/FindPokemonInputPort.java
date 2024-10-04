package com.api.core.ports.input;

import com.api.core.ports.output.FindPokemonOutputPort;
import com.api.core.usecases.FindPokemonUseCase;
import com.api.domain.entity.Pokemon;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Log4j2
public class FindPokemonInputPort implements FindPokemonUseCase {

    private final FindPokemonOutputPort findPokemonOutputPort;

    @Override
    public Pokemon find(Pokemon pokemon) {
        return findPokemonOutputPort.findPokemon(pokemon.getName());
    }
}

